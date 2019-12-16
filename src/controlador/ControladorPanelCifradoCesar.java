package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import util.JeAnimacion;
import vista.JFramePrincipal;
import vista.cifradoCesar.PanelCifradoCesar;
import vista.cifradoCesar.PanelRotContainer;

/**
 *
 * @author Jerson
 */
public class ControladorPanelCifradoCesar {
    
    private PanelCifradoCesar panel;
    
    
    public PanelCifradoCesar open(JPanel panelContainer,JFramePrincipal frm){
        
        PanelCifradoCesar pnl = new PanelCifradoCesar(panelContainer, frm);
        
        pnl.setBounds(841, 10, 840, 520);
        
        pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        
        this.panel = pnl;
        
        agregarOyente();
        
        animar();
        
        return pnl;
    }
    
    private void animar() {
    
        //158 - h
        //pos y = 100
        
        System.out.println("animar");
        
        long time = 100;
        int d  =  Math.abs(panel.pnlRot3.getY() - 100);
        double velocidad = d / time;
        
        try {
            JeAnimacion.moveToBottom(panel.pnlRot3.getY() , 100, velocidad, 1, 600, panel.pnlRot3);
        } catch (Exception ex) {}
        
        d = Math.abs(panel.pnlRot47.getY() - 300);
        velocidad = d / time;
        
        try {
            JeAnimacion.moveToTop(panel.pnlRot47.getY(), 300, velocidad, 1, 800, panel.pnlRot47);
         } catch (Exception ex) {}
        
        
        d = Math.abs(panel.pnlRot13.getX() - 470);
        velocidad = d / time;
        
        try {
            JeAnimacion.moveToLeft(panel.pnlRot13.getX(), 470, velocidad, 1, 1000, panel.pnlRot13);
         } catch (Exception ex) {}
        
    }

    private void agregarOyente() {
    
        OyenteClicked oyente = new OyenteClicked();
        
        panel.pnlRot13.addMouseListener(oyente);
        
        panel.pnlRot3.addMouseListener(oyente);
        
        panel.pnlRot47.addMouseListener(oyente);
    
    }
    
    private class OyenteClicked extends MouseAdapter{

        @Override
        public void mouseClicked(MouseEvent e) {
            
            if(e.getSource() == panel.pnlRot13){
                
                ControladorPanelRotContainer control = new ControladorPanelRotContainer();
                
                PanelRotContainer panel13 = control.open(panel.frm,13);
        
                panel.panelContainer.remove(1);

                panel.panelContainer.add(panel13);

                panel.panelContainer.updateUI();
                
            }else if(e.getSource() == panel.pnlRot3){
                
                 ControladorPanelRotContainer control = new ControladorPanelRotContainer();
                
                PanelRotContainer panel3 = control.open(panel.frm,3);
        
                panel.panelContainer.remove(1);

                panel.panelContainer.add(panel3);

                panel.panelContainer.updateUI();
                
                
            }else if(e.getSource() == panel.pnlRot47){
                
                 ControladorPanelRotContainer control = new ControladorPanelRotContainer();
                
                PanelRotContainer panel47 = control.open(panel.frm,47);
        
                panel.panelContainer.remove(1);

                panel.panelContainer.add(panel47);

                panel.panelContainer.updateUI();
                
            }
            
        }
    
    }
    
}
