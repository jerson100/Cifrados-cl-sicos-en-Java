package vista.cifradoPolybios;

import Configuracion.ColorApp;
import Configuracion.Fuente;
import Configuracion.GrosorLinea;
import controlador.ControlAnimacionLetraPolybios;
import interfaces.IComponentText;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;

/**
 *
 * @author Jerson
 */
public class PanelAnimacionCifradoPolybios extends JPanel {

    private IComponentText componente;
    private ControlAnimacionLetraPolybios control;
    private String values[][] = {
        {"aflqv", "1"},
        {"bgmrw", "2"},
        {"chnsx", "3"}, 
        {"dioty", "4"},
        {"ekpuz", "5"},};

    public PanelAnimacionCifradoPolybios(IComponentText componente) {

        this.componente = componente;
        
        this.control = new ControlAnimacionLetraPolybios("", true);

        this.setLayout(null);

    }

    void setTexto(String texto, boolean cifrado) {
         control.setTexto(texto.toUpperCase(), cifrado); 
         componente.getLabelText().setText(control.getTextoRespuesta());
    }

    void iniciarAnimacion() {

        Thread t = new Thread() {
            @Override
            public void run() {

                while (true) {

                    try {
                        control.ejecutarFrame();
                        repaint();
                        Thread.sleep(2000);
                    } catch (InterruptedException ex) {
                    }

                }

            }
        };

        t.start();

    }

    @Override
    protected void paintComponent(Graphics gg) {
        super.paintComponent(gg);
        Graphics2D g = (Graphics2D) gg;
        printarPanel(g);
        pintarTablero(g);
        pintarLetra(g);
        pintarInfo(g);
        pintarAutor(g);
    }

    int row;
    int col;

    private void printarPanel(Graphics2D g){
        
        for (int i = 0; i < this.getHeight() / 2 + 1; i++) {
            g.setColor(new Color(255, 200, i));
            g.fillRect(0, i * 2, this.getWidth(), 2);
        }
    }
    
    private void pintarInfo(Graphics2D g){
        g.setFont(Fuente.GEORGIA_TITLE_BOLD);
        g.setColor(Color.MAGENTA);
        g.drawString(control.getInfo(), 50 * 8 - 25, 50*4+10);
    }
    
    private void pintarTablero(Graphics2D g) {
        g.setFont(Fuente.ARIAL_TEXT);
        for (int i = 0; i < ControlAnimacionLetraPolybios.TABLERO.length; i++) {
            for (int j = 0; j < ControlAnimacionLetraPolybios.TABLERO.length; j++) {
                if(i>=1 && j >= 1){
                    g.setColor(new Color(40 - i*2, 230-i*2, 120));
                }else{
                    g.setColor(new Color(40 - i*2, 200-i*2, 120));
                }
                g.fillRect((j + 1) * 50, (i + 1) * 50, 50, 50);
                g.setColor(Color.white);
                g.drawRect((j + 1) * 50, (i + 1) * 50, 50, 50);
                g.drawString(ControlAnimacionLetraPolybios.TABLERO[i][j], (j + 1) * 50 + 25, (i + 1) * 50 + 30);
            }
        }

    }

    void terminarHilo() {
    }

    void stop() {
    }

    void reanudar() {
    }

    private void pintarLetra(Graphics2D g) {

        if (control.isEsCifrar()) {

            String letraActual = control.getLetrasActual().split(" ")[0];

            System.out.println("actual_: "+letraActual);
            
            int[] pos = getPosicion(values, letraActual.toLowerCase());

            g.setColor(ColorApp.COLOR_ROJO_SUAVE);
            g.fillRect(50, (pos[0] + 2) * 50, 50, 50);
            g.fillRect((pos[1]+1) * 50, 50, 50, 50);
            
            g.setColor(ColorApp.COLOR_HOVER_BOTON);
            System.out.println(pos[0] + " - "+pos[1]);
            g.fillRect((pos[1]+1) * 50, (pos[0]+2) * 50, 50, 50);
            
            g.setFont(Fuente.GEORGIA_TEXT_BOLD);
            g.setColor(ColorApp.COLOR_BLANCO);
            g.drawString(ControlAnimacionLetraPolybios.TABLERO[pos[0]+1][0],
                    1 * 50 + 18, (pos[0]+2) * 50 + 32);
            
            g.drawString(ControlAnimacionLetraPolybios.TABLERO[0][pos[1]],
                    (pos[1] + 1) * 50 + 18, 1 * 50 + 32);
            
            g.drawString(letraActual,
                    (pos[1] + 1) * 50 + 18, (pos[0]+2) * 50 + 32);
            
            dibujarLinea(g,50,(pos[0]+2)*50,(pos[1]+1)*50,50,(pos[1]+1)*50,(pos[0]+2)*50);

        } else {

        }

    }

    public int[] getPosicion(String[][] m, String c) {
        // ñ = 2  -> 3, i => 2 -> 4
        if(c.equals("ñ")){
            return new int[]{2,3};
        }else if(c.equals("j")){
            return new int[]{2,4};
        }
        
        for (int i = 0; i < m.length; i++) {
            String d = m[i][0];
            if (d.indexOf(c) != -1) {
                return new int[]{d.indexOf(c), Integer.parseInt(m[i][1])};
            }
        }

        return null;

    }
/*
    public static void main(String[] args) {

        JFrame fm = new JFrame();
        fm.setLayout(null);
        fm.setSize(420, 450);

        PanelAnimacionCifradoPolybios p = new PanelAnimacionCifradoPolybios(null);
        p.setBounds(0, 0, 500, 500);

        fm.add(p);

        p.iniciarAnimacion();

        fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fm.setLocationRelativeTo(null);
        fm.setVisible(true);

    }*/

    private void dibujarLinea(Graphics2D g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.setStroke(GrosorLinea.LINEA3);
        g.setColor(ColorApp.COLOR_ROJO_SUAVE);
        g.drawLine(x1 + 50 / 2 - 1, y1, x2, y2 / 2 - 1 + 50);//diagonal
     
        g.setColor(ColorApp.COLOR_HOVER_BOTON);
        g.drawLine(x1 + 50, y1 + 50 / 2 - 1, x3, y3 + 50 / 2 - 1);//left - right
        g.drawLine(x3 + 50 / 2 - 1, y3, x2 + 50 / 2 - 1, y2 + 50);//bottom - top
    }

    private void pintarAutor(Graphics2D g) {
        g.setFont(Fuente.GEORGIA_TEXT_BOLD);
        g.setColor(ColorApp.COLOR_BOTON);
        g.drawString("Created by jerson", 50 * 12 - 50, 50*8+2);
    }

}
