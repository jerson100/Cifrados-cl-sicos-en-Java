package controlador;

import util.CifradoPoliBios;
import java.util.ArrayList;
import java.util.List;
import modelo.Letra;

/**
 *
 * @author Jerson
 */
public class ControlAnimacionLetraPolybios {
    
    private List<String> letras;
    private String letrasActual;
    public static final String TABLERO[][] = {
				{"-","A","B","C","D","E"},
				{"A","A","B","C","D","E"},
				{"B","F","G","H","IJ","K"},
				{"C","L","M","NÑ","O","P"},
				{"D","Q","R","S","T","U"},
				{"E","V","W","X","Y","Z"}
    };
    
    private String texto;
    private String textoRespuesta;
    private boolean estado;
    private boolean esCifrar;

    public ControlAnimacionLetraPolybios(String texto,boolean esCifrar) {
        this.texto = texto.toUpperCase();
        this.esCifrar = esCifrar;
    }
    
    public void iniciar(){
        
        this.indice = 0;
        
        textoRespuesta = esCifrar ? CifradoPoliBios.cifradoPolyBios(TABLERO, texto): 
                                    CifradoPoliBios.descifrado(TABLERO, texto);
        
        if(esCifrar){
            
            letras = new ArrayList<>();
            letrasActual = "";
            System.out.println(texto.replaceAll("[^a-z|A-Z|ñ|Ñ]",""));
            String data[] = texto.replaceAll("[^a-z|A-Z|ñ|Ñ]","").split("");
            
            for (int i = 0; i < data.length; i++) {
                
                letras.add(data[i]);
                
            }
            
        }
        
    }
    
    private int indice;
    
    public void ejecutarFrame(){
        
        if(indice < this.letras.size()){
            
            this.letrasActual = letras.get(indice++);
            
        }else{
            
            //this.estado = false;
            this.indice = 0;
            
        }
        
    }

    public List<String> getLetras() {
        return letras;
    }

    public void setLetras(List<String> letras) {
        this.letras = letras;
    }

    public String getLetrasActual() {
        return letrasActual;
    }

    public void setLetrasActual(String letrasActual) {
        this.letrasActual = letrasActual;
    }


    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTextoRespuesta() {
        return textoRespuesta;
    }

    public void setTextoRespuesta(String textoRespuesta) {
        this.textoRespuesta = textoRespuesta;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEsCifrar() {
        return esCifrar;
    }

    public void setEsCifrar(boolean esCifrar) {
        this.esCifrar = esCifrar;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int indice) {
        this.indice = indice;
    }

    public String getInfo() {
        System.out.println("....."+CifradoPoliBios.cifradoPolyBios(TABLERO, this.letrasActual));
        return "La letra : " + this.letrasActual +
                " se cifra por => " +
                CifradoPoliBios.cifradoPolyBios(TABLERO, this.letrasActual);
        
    }

    public void setTexto(String texto, boolean cifrado) {
        this.texto = texto;
        indice = 0;
        this.esCifrar = cifrado;
        this.letrasActual = null;
        this.iniciar();
    }
    
}

