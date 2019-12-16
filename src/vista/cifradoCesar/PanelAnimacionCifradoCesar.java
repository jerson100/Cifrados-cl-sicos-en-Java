package vista.cifradoCesar;

import Configuracion.GrosorLinea;
import controlador.ControlAnimacionLetraCesar;
import interfaces.IComponentText;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import modelo.Letra;

/**
 *
 * @author Jerson
 */
public class PanelAnimacionCifradoCesar extends JPanel{

    private ControlAnimacionLetraCesar control;
    private boolean animar;
    private IComponentText parent;//haremos uso del polimorfismo
    private boolean txtFinal;
    private JPanel pnlStop;
    
    public PanelAnimacionCifradoCesar(String texto,IComponentText parent,int rot,boolean esCifrado,String abc,JPanel pnlStop) {

        control = new ControlAnimacionLetraCesar(abc,texto,rot,esCifrado);
        
        this.parent = parent;
        
        this.pnlStop = pnlStop;
        
        addOyente();

        //quitar el * 2 si quieres que sea solo lo necesario :V
        
        this.setPreferredSize(new Dimension((control.getRot()*2 + 1) * control.DESX + /*20*/300/*1500*/, (texto.length()*2 + 1) * control.DESY + /*35*/450));

    }

    public void setPanelStop(JPanel pnlStop){
        this.pnlStop = pnlStop;
    }
    
    public void terminarHilo(){
        this.animar = false;
        this.txtFinal = true;
    }
    
    public void iniciarAnimacion() {

        this.animar = true;
        this.txtFinal = false;
        control.iniciarAnimacion();
        pnlStop.setVisible(true);

        Thread t = new Thread() {
            @Override
            public void run() {
                
                while(control.isEstado()){
                    System.out.println("");
                    while (animar) {
                       System.out.println("animando");
                        try {
                            control.ejecutarFrame();
                            repaint();
                            if(!control.isEstado()){
                                break;
                            }
                            Thread.sleep(180);
                        } catch (InterruptedException ex) {}
                    
                    }
                    
                }
                
                System.out.println("terminó el hilo"); 
                txtFinal = true;
                parent.getLabelText().setText(control.getTextoCifrado());
                pnlStop.setVisible(false);
                
            } 
        };

        t.start();

    }
    
    private void pintarFondo(Graphics2D g){
    
        int tam = 10;
        int cant = this.getHeight() / tam;
        Color prev=null,act;
        
        for(int i=0;i<=cant;i++){
            try {
                act = new Color(81,255,255-i);
                g.setColor(act);   
                prev = act;
            } catch (Exception e) {
                g.setColor(prev);
            }
            
            g.fillRect(0, tam * i, this.getWidth(), tam);
        }
        
    }

    private void pintarLetras(Graphics2D g) {

        g.setFont(new Font("Georgia", 1, 18));

        List<Letra> letras = control.pintarLetras();
        Letra l;
        
        String aux = "";

        for (int i = 0; i < letras.size(); i++) {

            l = letras.get(i);
            
            if(l.isFin()){
                
                if(!this.txtFinal){
                    
                    parent.getLabelText().setText("Cifrando: "+l.getCaracter());
                    
                }else{
                    
                    parent.getLabelText().setText(control.getTextoCifrado());
                    
                }
                
                if(i != control.getRot()){
                    
                    //pintarLineaFinal(g, l.getX(), l.getY());
                    
                }
                
            }

            if (l.getCaracter() == ' ') {
                
                g.setColor(new Color(14, 126, 205));

                pintarEspacio(g, l.getX(), l.getY());

                continue;
            }

            if (l.isInit() || l.isFin()) {
                Color c = l.isFin() ? Color.RED:Color.BLACK;
                dibujarCirculo(c,g, l.getX(), l.getY());
                if (l.isInit()) {
                    pintarCurva(g, l.getX(), l.getY());
                }
                g.setColor(Color.WHITE);

            } else {

                if (!l.isFin()) {
                    dibujarLinea(g, l.getX(), l.getY());
                }
                g.setColor(new Color(14, 126, 205));

            }

            g.drawString(l.getCaracter() + "", l.getX(), l.getY());

        }

    }

    @Override
    public void paintComponent(Graphics gg) {
        //if (!this.animar)return;
        Graphics2D g = (Graphics2D) gg;
        super.paintComponent(g);
        pintarFondo(g);
        pintarLetras(g);
    }

    private void addOyente() {

        PanelAnimacionCifradoCesar p = this;

        MouseAdapter ma = new MouseAdapter() {
            private Point origin;

            @Override
            public void mousePressed(MouseEvent e) {
                origin = new Point(e.getPoint());
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseDragged(MouseEvent e) {

                if (origin != null) {
                    JViewport viewPort = (JViewport) SwingUtilities.getAncestorOfClass(JViewport.class,
                             p);
                    if (viewPort != null) {
                        int deltaX = origin.x - e.getX();
                        int deltaY = origin.y - e.getY();

                        Rectangle view = viewPort.getViewRect();
                        view.x += deltaX;
                        view.y += deltaY;

                        p.scrollRectToVisible(view);
                    }
                }
            }

        };

        p.addMouseListener(ma);
        p.addMouseMotionListener(ma);

    }

    private void dibujarLinea(Graphics2D g, int x, int y) {
        g.setColor(new Color(235, 86, 86));
        g.setStroke(GrosorLinea.LINEA1);
        g.drawLine(x + 23, y - 2, x + 52, y - 2);
    }

    private void dibujarCirculo(Color color,Graphics2D g, int x, int y) {
        g.setColor(color);
        g.setStroke(GrosorLinea.LINEA2);
        g.fillArc(x - 8, y - 20, 25, 25, 0, 360);
        g.drawArc(x - 8, y - 20, 25, 25, 0, 360);
    }

    private void pintarEspacio(Graphics2D g, int x, int y) {
        g.setStroke(GrosorLinea.LINEA3);
        g.drawLine(x, y + 20, (control.getRot() + 1) * control.DESX + 20 /*400*/, y + 20);
    }

    

    private void pintarCurva(Graphics2D g, int x, int y) {

        g.drawArc(x - 17, y - 18, 50, 50, 135, 135);

    }

    private void pintarLineaFinal(Graphics2D g, int x, int y) {
        g.setStroke(GrosorLinea.LINEA3);
        g.drawLine(x+1, y - 10, x+1, y - 70);
    }

    public void setTexto(String texto,boolean esDescifrar) {
        control.setTexto(texto,esDescifrar);
        this.setPreferredSize(new Dimension((control.getRot()*2 + 1) * control.DESX + 20/*1500*/, (texto.length()*2 + 1) * control.DESY + 35));
    }

    public void stop() {
        
        this.animar = false;
    
        
    }

    public void reanudar() {
        this.animar = true;
    }

}
