package controlador;

import java.awt.Color;
import javax.swing.JPanel;
import util.JeNumber;
import util.JeTextoAnimado;
import vista.PanelInicio;

/**
 *
 * @author Jerson
 */
public class ControladorPanelInicio {
    
    private PanelInicio panelInicio;
 
    public PanelInicio open(JPanel parent,long sleep){
        
        PanelInicio pnl = new PanelInicio(parent, sleep);
    
        pnl.setBounds(841, 10, 840, 520);
        pnl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        
        this.panelInicio = pnl;
        
        try{
            Thread.sleep(sleep);
            agregarAnimacionIntegrantes();
        } catch (InterruptedException ex) {}
        
        return pnl;
    
    }
    
    private void agregarAnimacionIntegrantes() {
        
        panelInicio.hilo = new Thread(){
            
            @Override
            public void run() {
                
                JeTextoAnimado txt1,
                               txt2,
                               txt3,
                               txt4,
                               txt5;
                
                String integrante1 = ".  Jerson Ramírez Ortiz",
                       integrante2 = ".  Mendoza Ramírez Edson",
                       integrante3 = ".  Bonatti Bueno Adrian",
                       integrante4 = ".  Yover Santiago Jara",
                       integrante5 = ".  Dávila Villanueva Eduardo";
                
                long sleep = 25l;
                
                
                while(panelInicio.estado){
                    
                     try {
                        
                        txt1 = new JeTextoAnimado(integrante1, panelInicio.lblIntegrante1, sleep);
                        txt2 = new JeTextoAnimado(integrante2, panelInicio.lblIntegrante2, sleep);
                        txt3 = new JeTextoAnimado(integrante3, panelInicio.lblIntegrante3, sleep);
                        txt4 = new JeTextoAnimado(integrante4, panelInicio.lblIntegrante4, sleep);
                        txt5 = new JeTextoAnimado(integrante5, panelInicio.lblIntegrante5, sleep);
                        
                        txt1.start();
                        txt1.join();
                        
                        txt2.start();
                        txt2.join();
                        
                        txt3.start();
                        txt3.join();
                        
                        txt4.start();
                        txt4.join();
                        
                        txt5.start();
                        txt5.join();
                        
                       /* panelInicio.parent.setBackground(new Color(JeNumber.aleatorio(0,255),
                                            JeNumber.aleatorio(0,255), JeNumber.aleatorio(0,255)));*/
                        
                        Thread.sleep(1000);
                        
                        limpiarLabelIntegrantes();
                        
                    } catch (InterruptedException ex) {}
                    
                }
            }
        
        };
        
        panelInicio.hilo.start();
        
    }
    
    private void limpiarLabelIntegrantes() {
        panelInicio.lblIntegrante1.setText("");
        panelInicio.lblIntegrante2.setText("");
        panelInicio.lblIntegrante3.setText("");
        panelInicio.lblIntegrante4.setText("");
        panelInicio.lblIntegrante5.setText("");
    }
    
}
