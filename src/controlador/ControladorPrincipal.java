package controlador;

import Configuracion.ColorApp;
import Configuracion.ImagenApp;
import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComponent;
import util.JeAnimacion;
import util.JeNumber;
import vista.JFramePrincipal;
import vista.cifradoAtbash.PanelAtbashContainer;
import vista.cifradoCesar.PanelCifradoCesar;
import vista.PanelInicio;
import vista.ascii.PanelAsciiContainer;
import vista.cifradoPolybios.PanelPolybiosContainer;
import vista.escitala.PanelEscitalaContainer;
import vista.playFair.PanelPlayFairContainer;
import vista.vignere.PanelVignereContainer;

/**
 *
 * @author Jerson
 */
public class ControladorPrincipal {

    private JFramePrincipal frmPrincipal;
    private static final ImagenApp IMAGENES = new ImagenApp();

    public void open() {
        frmPrincipal = new JFramePrincipal();
        frmPrincipal.setSize(946, 552);
        frmPrincipal.setLocationRelativeTo(null);
        frmPrincipal.pnlMenuLateral.setBackground(ColorApp.COLOR_BOTON);
        frmPrincipal.setBackground(ColorApp.COLOR_BLANCO);
        agregarOyentes();
        frmPrincipal.setVisible(true);
        pintarCadaSegundo();
    }

    public void agregarOyentes() {

        OyenteClick oyente = new OyenteClick();

        frmPrincipal.jLabel1.addMouseListener(oyente);

        frmPrincipal.jLabel7.addMouseListener(oyente);

        frmPrincipal.jLabelInicio.addMouseListener(oyente);

        frmPrincipal.pnlCifradoAscci.addMouseListener(oyente);
        frmPrincipal.pnlCifradoCesar.addMouseListener(oyente);
        frmPrincipal.pnlCifradoPlybios.addMouseListener(oyente);
        frmPrincipal.pnlCifradoAtbash.addMouseListener(oyente);
        frmPrincipal.pnlCifradoVignere.addMouseListener(oyente);
        frmPrincipal.pnlCifradoPlayFair.addMouseListener(oyente);
        frmPrincipal.pnlCifradoEscitala.addMouseListener(oyente);

        frmPrincipal.pnlLogo.addMouseListener(oyente);
        frmPrincipal.pnlMenu.addMouseListener(oyente);

        frmPrincipal.pnlMenuLateral.addMouseListener(oyente);
        frmPrincipal.pnlMenuLateral.addMouseMotionListener(oyente);

        frmPrincipal.pnlSalir.addMouseListener(oyente);

    }

    public void cerrar() {
        frmPrincipal.dispose();
    }

    private class OyenteClick extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            if (e.getSource() == frmPrincipal.jLabel1) {

                animarPanelMenuLateral();

            } else if (e.getSource() == frmPrincipal.jLabel7) {

                System.exit(0);

            } else if (e.getSource() == frmPrincipal.jLabelInicio) {

                animarPanelInicio();

            } else if (e.getSource() == frmPrincipal.pnlCifradoCesar) {

                animarPanelCifradoCesar();

            } else if (e.getSource() == frmPrincipal.pnlCifradoAtbash) {

                animarPanelCifradoAtbash();

            } else if (e.getSource() == frmPrincipal.pnlCifradoPlybios) {

                animarPanelCifradoPolybios();

            } else if (e.getSource() == frmPrincipal.pnlCifradoEscitala) {

                animarPanelCifradoEscitala();

            } else if (e.getSource() == frmPrincipal.pnlCifradoVignere) {

                animarPanelCifradoVignere();

            } else if(e.getSource() == frmPrincipal.pnlCifradoAscci){
                
                animarPanelCifradoAscii();
                
            } else if(e.getSource() == frmPrincipal.pnlCifradoPlayFair){
                
                animarPanelPlayFair();
                
            }

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            if (e.getSource() == frmPrincipal.jLabel1) {

                frmPrincipal.jLabel1.setIcon(IMAGENES.MENU_HOVER);

            } else if (e.getSource() == frmPrincipal.jLabel7) {

                frmPrincipal.jLabel7.setIcon(IMAGENES.SALIR_HOVER);

            } else if (e.getSource() == frmPrincipal.jLabelInicio) {

                frmPrincipal.jLabelInicio.setIcon(IMAGENES.HOME_HOVER);

            }

            if (e.getSource() != frmPrincipal.pnlMenuLateral) {

                pintarComponent((JComponent) e.getSource(), Color.red);

            }

        }

        @Override
        public void mouseExited(MouseEvent e) {

            if (e.getSource() == frmPrincipal.jLabel1) {

                frmPrincipal.jLabel1.setIcon(IMAGENES.MENU);

            } else if (e.getSource() == frmPrincipal.jLabel7) {

                frmPrincipal.jLabel7.setIcon(IMAGENES.SALIR);

            } else if (e.getSource() == frmPrincipal.jLabelInicio) {

                frmPrincipal.jLabelInicio.setIcon(IMAGENES.HOME);

            }

            if (e.getSource() != frmPrincipal.pnlMenuLateral) {

                pintarComponent((JComponent) e.getSource(), ColorApp.COLOR_BOTON);

            }

        }

        @Override
        public void mouseDragged(MouseEvent e) {

            if (e.getSource() == frmPrincipal.pnlMenuLateral) {

                moverVentanaPrincipal(e);

            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

            if (e.getSource() == frmPrincipal.pnlMenuLateral) {

                localizacionClick = e.getPoint();

            }

        }

    }

    private Point localizacionClick;

    private void moverVentanaPrincipal(MouseEvent evt) {
        Point p = new Point();
        Point posicionClick = evt.getPoint();
        Point posicionJFrame = frmPrincipal.getLocationOnScreen();

        int x, y;

        x = posicionJFrame.x + (posicionClick.x - localizacionClick.x);
        y = posicionJFrame.y + (posicionClick.y - localizacionClick.y);

        p.setLocation(x, y);

        frmPrincipal.setLocation(p);
    }

    private void animarPanelMenuLateral() {
        Point localizacion = frmPrincipal.pnlMenuPrincipalHover.getLocation();
        //System.out.println(frmPrincipal.pnlMenuPrincipalHover.getLocation());
        int i, f, d;
        double t = 100;
        double velocidad;

        if (localizacion.x <= -125) {
            i = localizacion.x;
            f = 0;
            d = Math.abs(i - f);
            velocidad = d / t;
            try {
                JeAnimacion.moveToRight(localizacion.x, f, velocidad, 1, 0, frmPrincipal.pnlMenuPrincipalHover);
            } catch (Exception ex) {
            }
        } else {
            i = localizacion.x;
            f = frmPrincipal.pnlMenuPrincipalHover.getWidth() * -1;
            d = Math.abs(i - f);
            velocidad = d / t;
            try {
                JeAnimacion.moveToLeft(i, f, velocidad, 1, 0, frmPrincipal.pnlMenuPrincipalHover);
            } catch (Exception ex) {
            }
        }
    }

    private void pintarComponent(JComponent componente, Color color) {
        componente.setBackground(color);
    }

    private void animarPanelCifradoCesar() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        ControladorPanelCifradoCesar controlador = new ControladorPanelCifradoCesar();

        PanelCifradoCesar p = controlador.open(frmPrincipal.pnlPrincipal, frmPrincipal);

        //p.setBounds(10, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }

    private void animarPanelCifradoAtbash() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        ControladorPanelAtbashContainer controlador = new ControladorPanelAtbashContainer();

        PanelAtbashContainer p = controlador.open(frmPrincipal);

        //p.setBounds(10, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }

    private void animarPanelCifradoEscitala() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        PanelEscitalaContainer p = new PanelEscitalaContainer();

        p.setBounds(841, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }

    private void animarPanelCifradoVignere() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        PanelVignereContainer p = new PanelVignereContainer();

        p.setBounds(841, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }
    
    private void animarPanelCifradoAscii() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        PanelAsciiContainer p = new PanelAsciiContainer();

        p.setBounds(841, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }
    
    private void animarPanelPlayFair() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        PanelPlayFairContainer p = new PanelPlayFairContainer();

        p.setBounds(841, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }

    private void animarPanelCifradoPolybios() {

        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        if (c instanceof PanelInicio) {
            ((PanelInicio) c).eliminarHilo();
        }

        frmPrincipal.pnlPrincipal.remove(1);

        ControladorPanelPolybiosContainer controlador = new ControladorPanelPolybiosContainer();

        PanelPolybiosContainer p = controlador.open(frmPrincipal);

        //p.setBounds(10, 10, 840, 520);
        frmPrincipal.pnlPrincipal.add(p);
        frmPrincipal.pnlPrincipal.updateUI();

        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, p);
                } catch (Exception ex) {
                }
            }
        };
        t.start();

    }

    private void animarPanelInicio() {
        Component c = (Component) frmPrincipal.pnlPrincipal.getComponent(1);

        frmPrincipal.pnlInicioContainer = null;

        if (c instanceof PanelInicio) {

            ((PanelInicio) c).eliminarHilo();

        }

        frmPrincipal.pnlPrincipal.remove(1);
        /*if(pnlInicioContainer != null) {
                    pnlInicioContainer.eliminarHilo();
                    pnlInicioContainer = null;
                }*/
        ControladorPanelInicio controlPanelInicio = new ControladorPanelInicio();

        //PanelInicio pnlInicioContainer = new PanelInicio(frmPrincipal.pnlPrincipal, 0);
        //pnlInicioContainer.setBounds(841, 10, 840, 520);
        PanelInicio pnlInicioContainer = controlPanelInicio.open(frmPrincipal.pnlPrincipal, 0);
        frmPrincipal.pnlPrincipal.add(pnlInicioContainer);
        frmPrincipal.pnlPrincipal.updateUI();
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    int i = 841, f = 10, d = i - f, time = 200;
                    double velocidad = d / time;
                    JeAnimacion.moveToLeft(841, 10, velocidad, 1, 0, pnlInicioContainer);
                } catch (Exception ex) {
                }
            }
        };
        t.start();
    }
    
    private void pintarCadaSegundo(){
        
        new Thread(){
            @Override
            public void run() {
                while(true){
                    try {
                        Thread.sleep(3000);
                        frmPrincipal.pnlPrincipal.setBackground(new Color(JeNumber.aleatorio(0,255),
                                JeNumber.aleatorio(0,255), JeNumber.aleatorio(0,255)));
                    } catch (InterruptedException ex) {}
                }
            }
        }.start();
        
    }
    

}
