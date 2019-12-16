package util;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.JDialog;

/**
 *
 * @author Jerson
 */
public class JeMovedViewPort {
    
    public static void moveTo(Point posicionVentana,Point posicionPulsada,MouseEvent e,JDialog component){
        int x,y;
        
        int desplazamientoX = e.getX() - posicionPulsada.x;
        int desplazamientoY = e.getY() - posicionPulsada.y;
        
        x = posicionVentana.x + desplazamientoX;
        y = posicionVentana.y + desplazamientoY;
        
        component.setLocation(x, y);
    }
    
}
