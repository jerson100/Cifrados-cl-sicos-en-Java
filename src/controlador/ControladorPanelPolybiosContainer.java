package controlador;

import Configuracion.ColorApp;
import Configuracion.ImagenApp;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.JFramePrincipal;
import vista.cifradoPolybios.JDialogCifradoPolybios;
import vista.cifradoPolybios.PanelPolybiosContainer;

/**
 *
 * @author Jerson
 */
public class ControladorPanelPolybiosContainer {
    
    private PanelPolybiosContainer panel;
    
    private static final ImagenApp IMAGE = new ImagenApp();

    public PanelPolybiosContainer open(JFramePrincipal frm) {

        PanelPolybiosContainer pl = new PanelPolybiosContainer(frm);

        pl.setBounds(841, 10, 840, 520);

        pl.lblRot.setText("Polybios");

        this.panel = pl;
        
        pl.isCifrado = true;
        
        agregarOyente();

        pl.lblAnimacion.setVisible(false);
        pl.pnlCifrar.setBackground(ColorApp.COLOR_HOVER_BOTON);

        return pl;

    }

    private void agregarOyente() {

        KeyAdapter oyenteTeclado = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                panel.lblCantidadCaracteres.setText("" + panel.txtTextoIngresado.getText().length());
            }

            @Override
            public void keyReleased(KeyEvent e) {

                panel.lblCantidadCaracteres.setText("" + panel.txtTextoIngresado.getText().length());

                if (panel.txtTextoIngresado.getText().trim().isEmpty()) {

                    panel.lblAnimacion.setVisible(false);

                } else {

                    panel.lblAnimacion.setVisible(true);

                }

            }
            
            @Override
            public void keyTyped(KeyEvent e){
                if(!(""+e.getKeyChar()).matches("[a-z|A-Z| |\n|ñ|Ñ]")){
                    e.consume();
                }
            }

        };

        this.panel.txtTextoIngresado.addKeyListener(oyenteTeclado);

        this.panel.lblAnimacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JDialogCifradoPolybios d = new JDialogCifradoPolybios(panel.frm, true,
                        panel.txtTextoIngresado.getText().trim(), panel.isCifrado);
                d.setVisible(true);
            }

        });

        panel.pnlDescifrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.isCifrado = false;
                panel.pnlDescifrar.setBackground(ColorApp.COLOR_HOVER_BOTON);
                panel.pnlCifrar.setBackground(ColorApp.COLOR_PLATA);
            }
        });

        panel.pnlCifrar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                panel.isCifrado = true;
                panel.pnlCifrar.setBackground(ColorApp.COLOR_HOVER_BOTON);
                panel.pnlDescifrar.setBackground(ColorApp.COLOR_PLATA);
            }
        });
        
    }
    
}
