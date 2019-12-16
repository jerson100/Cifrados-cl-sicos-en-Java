package controlador;

import java.util.ArrayList;
import java.util.List;
import modelo.Letra;

/**
 *
 * @author Jerson
 */
public class ControlAnimacionLetraCesar extends Thread{

    private ArrayList<Letra> letras;
    private List<Letra> letrasActuales;
    private boolean estado;
    private int index = 0;
    private String texto;
    public static final int DESX = 60;
    public static final int DESY = 80;
    private int rot;
    public String textoCifrado;
    private String abecedario;

    public ControlAnimacionLetraCesar(String abc,String txt,int rot,boolean esCifrado) {
        this.texto = txt;
        this.rot = rot;
        this.abecedario = abc;
        this.letras = agregarLetras(abc,rot==47?txt:txt.toLowerCase(),esCifrado);
    }

    public void ejecutarFrame() {

        if (index < letras.size()) {

            //debemos ir agregando las letras
            letrasActuales.add(letras.get(index++));

        } else {

            estado = false;
            index = 0;

        }

    }

    public void iniciarAnimacion() {
        this.estado = true;
        this.letrasActuales = new ArrayList<>();
        index = 0;
    }

    public List<Letra> pintarLetras() {
        return letrasActuales;
    }

    public boolean isEstado() {
        return estado;
    }

    private ArrayList<Letra> agregarLetras(String abecedario,String texto,boolean esCifrado) {
        ArrayList<Letra> letrasAux = new ArrayList<>();
        List<Letra> l;
        String aux = "";
        for (int i = 0; i < texto.length(); i++) {
            l = esCifrado?obtenerDesplazamientos(abecedario,texto.charAt(i), DESX, (i + 1) * DESY):obtenerDesplazamientosDescifrado(abecedario,texto.charAt(i), DESX, (i + 1) * DESY);
            aux += l.get(l.size() - 1).getCaracter();
            letrasAux.addAll(l);
        }
        this.textoCifrado = aux;
        return letrasAux;
    }
    
    private ArrayList<Letra> obtenerDesplazamientosDescifrado(String abc,char charAt,int x,int y) {
    
        //String cifrado = ROT13.cifrar(""+charAt);
        
        //String abc = "abcdefghijklmnopqrstuvwxyz";
        
        int index = abc.indexOf(charAt);
       
        ArrayList<Letra> letras = new ArrayList<>();
        
        Letra l = new Letra();
        l.setX(x);
        l.setY(y);
        l.setInit(true);
        l.setCaracter(charAt);
        
        letras.add(l);
        
        if(index != -1){
            
            int count = 0;
            char cA;
            int pos = 1;
            
            for (int i = index - 1; count != rot; i--) {
                
                if(i<0){
                
                    i = abc.length()-1;
                    
                }
                
                cA = abc.charAt(i);
                
                l = new Letra();
                
                l.setCaracter(cA);
                l.setX(pos++ * x + 20);
                l.setY(y + 35);
                
                letras.add(l);
                
                count++;
                
            }
            
            letras.get(letras.size() - 1).setFin(true);
            
        }else{
            
            if(charAt != ' '){
           
                Letra l2 = new Letra();
                l2.setX(x + 20);
                l2.setY(y + 35);
                l2.setFin(true);
                l2.setCaracter(charAt);

                letras.add(l2);   
            }
            
        }
        
        return letras;
        
    }
    
    private ArrayList<Letra> obtenerDesplazamientos(String abc,char charAt,int x,int y) {
    
        //String cifrado = ROT13.cifrar(""+charAt);
        
        //String abc = "abcdefghijklmnopqrstuvwxyz";
        
        int index = abc.indexOf(charAt);
       
        ArrayList<Letra> letras = new ArrayList<>();
        
        Letra l = new Letra();
        l.setX(x);
        l.setY(y);
        l.setInit(true);
        l.setCaracter(charAt);
        
        letras.add(l);
        
        if(index != -1){
            
            int count = 0;
            char cA;
            int pos = 1;
            
            for (int i = index + 1; count != rot; i++) {
                
                if(i==abc.length()){
                
                    i = 0;
                    
                }
                
                cA = abc.charAt(i);
                
                l = new Letra();
                
                l.setCaracter(cA);
                l.setX(pos++ * x + 20);
                l.setY(y + 35);
                
                letras.add(l);
                
                count++;
                
            }
            
            letras.get(letras.size() - 1).setFin(true);
            
        }else{
            
            if(charAt != ' '){
           
                Letra l2 = new Letra();
                l2.setX(x + 20);
                l2.setY(y + 35);
                l2.setFin(true);
                l2.setCaracter(charAt);

                letras.add(l2);   
            }
            
        }
        
        return letras;
        
    }

    public void setTexto(String texto,boolean esDescifrar) {
        this.texto = texto;
        this.letras = agregarLetras(abecedario,rot==47?texto:texto.toLowerCase(),esDescifrar);
    }

    public int getIndex() {
        return index;
    }

    public static int getDesX() {
        return DESX;
    }

    public static int getDesY() {
        return DESY;
    }

    public int getRot() {
        return rot;
    }

    public String getTextoCifrado() {
        return this.textoCifrado;
    }
    
}
