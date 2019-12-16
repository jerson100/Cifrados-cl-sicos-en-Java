package controlador;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import modelo.Letra;

/**
 *
 * @author Jerson
 */
public class ControlAnimacionLetraAtbash {

    private Queue<Letra> cabeceraLetras;
    private Map<Letra, List<Letra>> caracteres;
    private Map<Letra, List<Letra>> caracteresIterable;
    /*private List<Letra> letrasIterator;*/
    private String abc;
    private String texto;
    private String textoCifradoDescifrado;
    private boolean estadoAnimacion;
        
    public ControlAnimacionLetraAtbash(String texto,String abc) {
        this.abc = abc;
        this.texto = texto.toLowerCase();
    }
    
    public void iniciar(){
        this.indiceActual = 0;
        this.caracteres = new LinkedHashMap<>();
        this.caracteresIterable = new LinkedHashMap<>();
        this.cabeceraLetras = new LinkedList<>();
        this.estadoAnimacion = true;
        char cA;
        int desX=80,desY=50;
        
        String aux = "";
        
        for (int i = 0; i < this.texto.length(); i++) {
        
            cA = this.texto.charAt(i);
        
            Letra l = new Letra();
            l.setCaracter(cA);    
            l.setInit(true);
            l.setFin(false);
            l.setX(desX * (i+1));
            l.setY(desY);
            
            this.cabeceraLetras.add(l);//agregamos a la cola de letras
            
            List<Letra> letras = cA == ' ' || cA == '\n' ? null:cifrarDescifrar(this.abc,cA, desX * (i+1), desY);
            
            caracteres.put(l, letras);
            
            aux += letras == null ? cA: letras.get(letras.size() - 1).getCaracter();
            
        }
        
        cabeceraLetras.add(null);
        
        this.letraCabeceraActual = cabeceraLetras.remove();
        
        this.textoCifradoDescifrado = aux;
        
    }
    
    public void detenerEjecucion(){
    
        this.estadoAnimacion = false;
        this.indiceActual = 0;
        this.letraCabeceraActual = null;
        
    }
    
    public List<Letra> cifrarDescifrar(String abc, char caracter, int desX, int desY){
    
        List<Letra> list = new ArrayList<>();
        
        int indiceCaracter = abc.indexOf(String.valueOf(caracter));
        int countPosicion = 1;
        
        if(indiceCaracter != -1){
        
            int indiceDestino = abc.length() - 1 - indiceCaracter;
            
            if(indiceCaracter >= abc.length() / 2){//si la longitud del abecedario es par
            
                for(int j = indiceCaracter - 1; j >= indiceDestino; j--){
                    
                    Letra lA = new Letra();
                    lA.setCaracter(abc.charAt(j));
                    lA.setX(desX);
                    lA.setY(desY * ++countPosicion);
                    
                    if(j == indiceDestino){
                        
                        lA.setFin(true);
                        
                    }
                    
                    list.add(lA);
                    
                }
            
            }else{
                
                for(int j = indiceCaracter + 1; j <= indiceDestino; j++){
                    
                    Letra lA = new Letra();
                    lA.setCaracter(abc.charAt(j));
                    lA.setX(desX);
                    lA.setY(desY * ++countPosicion);
                    
                    if(j == indiceDestino){
                        
                        lA.setFin(true);
                        
                    }
                    
                    list.add(lA);
                    
                }
                
            }
        
        }else{
            
            
        }
        
        return list;
    }

    private int indiceActual = 0;
    private Letra letraCabeceraActual;
    
    public void ejecutarAnimacion() {
    
        if(this.cabeceraLetras.isEmpty()){
        
            System.out.println(this.cabeceraLetras);
            
            detenerEjecucion();
            
            return;
            
        }
        
        if(this.caracteres.get(this.letraCabeceraActual) == null){
            
            //this.caracteres.remove(this.letraCabeceraActual);
            
            //this.letrasIterator = this.caracteres.get(this.letraCabeceraActual);
            
            this.letraCabeceraActual = this.cabeceraLetras.remove(); //pasamos a la siguiente letra...
            
        }else{
            
            List<Letra> listaActual = this.caracteres.get(this.letraCabeceraActual);
            
            if(this.indiceActual < listaActual.size()){
            
                //agregamos al mapa auxiliar el cual nos servirá para ir pintando en el panel
                //los carácteres actuales de la animación
                
                //primero comprobamos si el carácter actual ya está agregado al mapa
                
                if(this.caracteresIterable.containsKey(this.letraCabeceraActual)){
                 
                    //obtenemos la lista
                    List<Letra> letrasLis = this.caracteresIterable.get(this.letraCabeceraActual);
                    
                    letrasLis.add(listaActual.get(indiceActual));
                    
                }else{
                
                    //creamos la lista
                    List<Letra> newList = new ArrayList<>();
                    
                    newList.add(listaActual.get(this.indiceActual));
                    
                    this.caracteresIterable.put(this.letraCabeceraActual, newList);
                    
                }
                
                this.indiceActual++;
                
            }else{
            
                this.caracteres.remove(this.letraCabeceraActual);
                
                this.indiceActual = 0;
            
            }
            
        }
        
    }
    
    public Map<Letra, List<Letra>> getCaracteres() {
        return caracteres;
    }

    public void setCaracteres(Map<Letra, List<Letra>> caracteres) {
        this.caracteres = caracteres;
    }

    public boolean isEstadoAnimacion() {
        return estadoAnimacion;
    }

    public void setEstadoAnimacion(boolean estadoAnimacion) {
        this.estadoAnimacion = estadoAnimacion;
    }

    public Map<Letra, List<Letra>> getCaracteresIterable() {
        return caracteresIterable;
    }

    public void setCaracteresIterable(Map<Letra, List<Letra>> caracteresIterable) {
        this.caracteresIterable = caracteresIterable;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto.toLowerCase();
        iniciar();
    }

    public String getTextoCifradoDescifrado() {
        return textoCifradoDescifrado;
    }

    public void setTextoCifradoDescifrado(String textoCifradoDescifrado) {
        this.textoCifradoDescifrado = textoCifradoDescifrado;
    }

    public int getIndiceActual() {
        return indiceActual;
    }

    public void setIndiceActual(int indiceActual) {
        this.indiceActual = indiceActual;
    }

    public Letra getLetraCabeceraActual() {
        return letraCabeceraActual;
    }

    public void setLetraCabeceraActual(Letra letraCabeceraActual) {
        this.letraCabeceraActual = letraCabeceraActual;
    }
    
}
