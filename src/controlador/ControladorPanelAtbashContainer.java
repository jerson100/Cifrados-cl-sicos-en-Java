package controlador;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import vista.cifradoAtbash.JDialogCifradoAtbash;
import vista.cifradoAtbash.PanelAtbashContainer;

/**
 *
 * @author Jerson
 */
public class ControladorPanelAtbashContainer {
 
    private PanelAtbashContainer panel;
    
    public PanelAtbashContainer open(JFrame frm){
        
        PanelAtbashContainer pl = new PanelAtbashContainer(frm);
        
        this.panel = pl;
        
        this.panel.lblAnimacion.setVisible(false);
        
        agregarOyente();
        
        pl.setBounds(841, 10, 840, 520);
        
        pl.setVisible(true);
        
        return pl;
    }

    private void agregarOyente() {
    
        panel.lblAnimacion.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
            
                JDialogCifradoAtbash dialog = new JDialogCifradoAtbash(panel.frm, true, panel.txtTextoIngresado.getText(), true);
                
                dialog.setVisible(true);
                
            }
        
        });
        
        panel.txtTextoIngresado.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                panel.lblCantidadCaracteres.setText(String.valueOf(panel.txtTextoIngresado.getText().length()));
            }

            @Override
            public void keyReleased(KeyEvent e) {
                
                if(panel.txtTextoIngresado.getText().isEmpty()){
                    panel.lblAnimacion.setVisible(false);
                }else{
                    panel.lblAnimacion.setVisible(true);
                }
            
                panel.lblCantidadCaracteres.setText(String.valueOf(panel.txtTextoIngresado.getText().length()));
                
            }

            @Override
            public void keyTyped(KeyEvent e) {
                
                if(!(""+e.getKeyChar()).matches("[a-z|A-Z| ]")){
                
                    e.consume();
                    
                }
            
            }
            
        });
        
    }
    
}
