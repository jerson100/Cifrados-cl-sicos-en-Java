package vista.cifradoAtbash;

import Configuracion.ColorApp;
import Configuracion.Fuente;
import Configuracion.GrosorLinea;
import controlador.ControlAnimacionLetraAtbash;
import interfaces.IComponentText;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.swing.JViewport;
import javax.swing.SwingUtilities;
import modelo.Letra;
import util.ROT;

/**
 *
 * @author Jerson
 */
public class PanelAnimacionCifradoAtbash extends javax.swing.JPanel {

    private ControlAnimacionLetraAtbash control;
    private IComponentText componente;
    
   
    public PanelAnimacionCifradoAtbash(IComponentText componente) {
        initComponents();
        
        //String texto = "abcd";
        
        this.componente = componente;
        
        control = new ControlAnimacionLetraAtbash("", ROT.ABECEDARIO);
        
        addOyente();
        
        this.setPreferredSize(new Dimension(1500,1500));
        
        control.iniciar();
        
    }
    
    public void iniciarAnimacion(){
    
        Thread t = new Thread(){
            
            @Override
            public void run() {
             
                //mientras el estado de la animaciÃ³n este como verdadero, entonces seguimos iterando ps
                
                while(control.isEstadoAnimacion()){
                    
                    try {
                        
                        control.ejecutarAnimacion();
                        
                        repaint();
                        
                        Thread.sleep(150);
                        
                    } catch (InterruptedException ex) {
                    
                    }
                    
                }
                
                System.out.println("Animación terminada :-)");
                
                componente.getLabelText().setText(control.getTextoCifradoDescifrado());
                
            }
            
        };
        
        t.start();
        
    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D)gg;
        pintarFondo(g);
        try{
            pintarLetra(g);
        }catch(java.util.ConcurrentModificationException e){}
    }
    
/*
    
    public static void main(String[] args) {
        
        JFrame fm = new JFrame();
        fm.setLayout(null);
        fm.setSize(500,800);
        
        PanelAnimacionCifradoAtbash p = new PanelAnimacionCifradoAtbash(null);
        p.setBounds(0, 0, 500, 800);
        
        fm.add(p);
        
        p.iniciarAnimacion();
        
        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);
        
    }
    
  */  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pintarFondo(Graphics2D g) {
    
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

    private void pintarLetra(Graphics2D g) throws java.util.ConcurrentModificationException{
    
        Map<Letra,List<Letra>> mapa = control.getCaracteresIterable();
        
        Iterator<Map.Entry<Letra,List<Letra>>> it = mapa.entrySet().iterator();
        
        Letra aux;
        
        while(it.hasNext()){
            
            Map.Entry<Letra,List<Letra>> mA = it.next();
            
            Letra key = mA.getKey();
            
            g.setFont(Fuente.GEORGIA_TITLE_BOLD);
            
            g.setStroke(GrosorLinea.LINEA3);
            
            g.setColor(ColorApp.COLOR_BOTON);
            
            g.fillArc(key.getX() - 10, key.getY() - 21, 30,  30, 0, 360);
            
            g.drawArc(key.getX() - 10, key.getY() - 21, 30,  30, 0, 360);
            
            g.setColor(ColorApp.COLOR_BLANCO);
            
            g.drawString(""+key.getCaracter(), key.getX(), key.getY());
            
            List<Letra> values = mA.getValue();
            
            //System.out.println("calve: "+key.getCaracter()+ " values: "+values.size());
            
            for(int i=0;i<values.size();i++){
                
                aux = values.get(i);
                
                if(control.isEstadoAnimacion()){
                    
                    componente.getLabelText().setText("Para "+ key.getCaracter() + ": \nPaso --> * " + aux.getCaracter() + " * <--");
                    
                }
                
                g.setFont(Fuente.GEORGIA_TEXT_BOLD);
                
                g.setStroke(GrosorLinea.LINEA2);
                
                if(aux.isFin()){
                    
                    g.setColor(ColorApp.COLOR_ROJO_SUAVE);
                    g.fillArc(aux.getX() - 10, aux.getY() - 18, 30,  30, 0, 360);
                    g.drawArc(aux.getX() - 10, aux.getY() - 18, 30,  30, 0, 360);
                    
                    dibujarLineaFinal(g,key,aux);
                    
                    g.setColor(ColorApp.COLOR_BLANCO);
                    
                }else{
                    
                    g.setColor(Color.BLACK);
                    
                }
                
                g.drawString(""+aux.getCaracter(), aux.getX(), aux.getY());
                
                if(!aux.isFin()){
                 
                    dibujarPunto(g, aux.getX(), aux.getY());
                    
                }
                
            }
            
        }
    
    }
    
    private void addOyente() {

        PanelAnimacionCifradoAtbash p = this;

        MouseAdapter ma = new MouseAdapter() {
            private Point origin;

            @Override
            public void mousePressed(MouseEvent e) {
                origin = new Point(e.getPoint());
                System.out.println(origin);
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

    void terminarHilo() {}

    void reanudar() {}

    void stop() {}

    void setTexto(String texto, boolean cifrado) {
        control.setTexto(texto);
    }

    private void dibujarLineaFinal(Graphics2D g, Letra key, Letra aux) {
    
        g.setColor(ColorApp.COLOR_ROJO_SUAVE);
        g.fillRect(key.getX() - 25,key.getY() - 8, 20, 2);
        
        g.fillRect(key.getX() - 25,key.getY() - 8, 2, aux.getY() - key.getY());
        
        g.fillRect(aux.getX() - 25,aux.getY() - 8, 20, 2);
    
    }

    private void dibujarPunto(Graphics2D g,int x, int y) {
    
        g.setColor(ColorApp.COLOR_ROJO_SUAVE);
        g.fillArc(x + 5, y + 15, 5,  5, 0, 360);
        g.drawArc(x + 5, y + 15, 5,  5, 0, 360);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
