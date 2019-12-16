package util;

import javax.swing.JLabel;

/**
 *
 * @author Jerson
 */
public class JeTextoAnimado extends Thread{

    private final String texto;
    private final JLabel componente;
    private final long tiempoPausa;
    private boolean estado = true;
    
    public JeTextoAnimado(String texto,JLabel label,long tiempoPausa){
        this.texto = texto;
        this.componente = label;
        this.tiempoPausa = tiempoPausa;
    }
    
    @Override
    public void run() {
    
        char caracterA;
        int index = 0;
        String textoAuxiliar = "";
        
        for (int i = 0; i < texto.length() && estado; i++) {
            
            try {
                
                //System.out.println("hilo txt "+this.getId());
                
                caracterA = texto.charAt(index);
                
                textoAuxiliar = textoAuxiliar.concat(String.valueOf(caracterA));
                
                Thread.sleep(tiempoPausa);
                
                componente.setText(textoAuxiliar);
                
                index++;
                
            } catch (InterruptedException ex) {estado = false;}
            
        }
        
    }
    
    
}
