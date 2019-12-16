package controlador;

import Configuracion.ColorApp;
import Configuracion.ImagenApp;
import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import util.JeAnimacion;
import vista.JFramePrincipal;
import vista.cifradoCesar.PanelCifradoCesar;
import vista.PanelInicio;
import vista.cifradoCesar.PanelRotContainer;
import vista.cifradoCesar.JDialogCifradoCesar;

/**
 *
 * @author Jerson
 */
public class ControladorPanelRotContainer {

    private PanelRotContainer panel;
    
    private static final ImagenApp IMAGE = new ImagenApp();

    public PanelRotContainer open(JFramePrincipal frm, int rot) {

        PanelRotContainer pl = new PanelRotContainer(frm, rot);

        pl.setBounds(10, 10, 840, 520);

        pl.lblRot.setText("ROT " + rot);

        this.panel = pl;
        
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

        };

        this.panel.txtTextoIngresado.addKeyListener(oyenteTeclado);

        this.panel.lblAnimacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JDialogCifradoCesar d = new JDialogCifradoCesar(panel.frm, true,
                        panel.txtTextoIngresado.getText().trim(), panel.isCifrado,
                        panel.rot);
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
        
        panel.pnlRetornar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                Component c = (Component) panel.frm.pnlPrincipal.getComponent(1);

                if (c instanceof PanelInicio) {
                    ((PanelInicio) c).eliminarHilo();
                }

                panel.frm.pnlPrincipal.remove(1);

                ControladorPanelCifradoCesar controlador = new ControladorPanelCifradoCesar();

                PanelCifradoCesar p = controlador.open(panel.frm.pnlPrincipal, panel.frm);

                //p.setBounds(10, 10, 840, 520);
                panel.frm.pnlPrincipal.add(p);
                panel.frm.pnlPrincipal.updateUI();

                Thread t = new Thread() {
                    @Override
                    public void run() {
                        try {
                            int i = 841, f = 10, d = i - f, time = 200;
                            double velocidad = d / time;
                            JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                        } catch (Exception ex) {}
                    }
                };
                t.start();
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                panel.lblRetornar.setIcon(IMAGE.RETURN_HOVER);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                panel.lblRetornar.setIcon(IMAGE.RETURN);
            }
        });

    }

}
