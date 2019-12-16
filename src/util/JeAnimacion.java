package util;

import javax.swing.JComponent;

import java.util.Timer;
import java.util.TimerTask;

/* PROPIEDAD DE JERSON RAM�REZ ORTIZ
 * Si lo usa por favor mencionar mi name :V
 * */
public class JeAnimacion {
    
    
    public static void crecent(int tamFinal, int salto, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (tamFinal > component.getWidth()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                int i = component.getWidth();

                @Override
                public void run() {
                    if (i < tamFinal) {
                        i += salto;
                    } else {
                        i = tamFinal;
                        time.cancel();
                    }
                    component.setSize(i, component.getHeight());
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }
    }
    

    public synchronized static void moveToLeft(int posInicial, int posFinal, double salto, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (posInicial == component.getX()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                double i = posInicial;

                @Override
                public void run() {
                    if (i >= posFinal) {
                        i -= salto;
                    } else {
                        i = posFinal;
                        time.cancel();
                    }
                    component.setLocation((int)i, component.getY());
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }
    }

    public synchronized static void moveToRight(int posInicial, int posFinal, double salto, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (posInicial == component.getX()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                double i = posInicial;

                @Override
                public void run() {
                    if (i <= posFinal) {
                        i += salto;
                    } else {
                        i = posFinal;
                        time.cancel();
                    }
                    component.setLocation((int)i, component.getY());
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }
    }

    public static void moveToTop(int posInicial, int posFinal, double salto, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (posInicial == component.getY()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                double i = posInicial;

                @Override
                public void run() {
                    if (i >= posFinal) {
                        i -= salto;
                    } else {
                        i = posFinal;
                        time.cancel();
                    }
                    component.setLocation(component.getX(), (int)i);
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }

        /*
		 * creando un hilo de ejecuci�n:comenta lo anterior i descomenta esto para
		 * ejecutar con un thread
         */

 /*
		 * if(posInicial==component.getY()) { new Thread() {
		 * 
		 * @Override public void run() { for (int i = posInicial; i>=posFinal ;
		 * i-=salto) { try { Thread.sleep(tiempoDSalto);
		 * component.setLocation(component.getX(),i); }catch(Exception ex) {
		 * ex.printStackTrace(); } } //component.setLocation(component.getX(),
		 * posFinal); } }.start(); }else{ throw new
		 * ErrorDeAnimacion("La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente"
		 * ); }
         */
    }

    public static void moveToBottom(int posInicial, int posFinal, double salto, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (posInicial == component.getY()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                double i = posInicial;

                @Override
                public void run() {
                    if (i <= posFinal) {
                        i += salto;
                    } else {
                        i = posFinal;
                        time.cancel();
                    }
                    component.setLocation(component.getX(), (int)i);
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }

        /*
		 * if(posInicial==component.getY()) { new Thread() {
		 * 
		 * @Override public void run() { for (int i = posInicial; i<=posFinal ;
		 * i+=salto) { try { Thread.sleep(tiempoDSalto);
		 * component.setLocation(component.getX(),i); }catch(Exception ex) {
		 * ex.printStackTrace(); } } //component.setLocation(component.getX(),
		 * posFinal); } }.start(); }else{ throw new
		 * ErrorDeAnimacion("La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente"
		 * ); }
         */
    }

    public static void hacerGrande(int widthI, int heightI, int crece, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (widthI == component.getWidth() && heightI == component.getHeight()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                int w = widthI;
                int h = heightI;
                int i = 1;

                @Override
                public void run() {
                    if (i != crece) {
                        w += 1;
                        h += 1;
                    } else {
                        w = widthI + crece;
                        h = heightI + crece;
                        time.cancel();
                    }
                    component.setSize(w, h);
                    i++;
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }
    }

    public static void hacerPequegno(int widthI, int heightI, int decrementar, long delay, int tiempoDeRetrasoEnAnimar,
            JComponent component) throws Exception {

        if (widthI == component.getWidth() && heightI == component.getHeight()) {
            Timer time = new Timer();
            TimerTask task = new TimerTask() {
                int w = widthI;
                int h = heightI;
                int i = 1;

                @Override
                public void run() {
                    if (i != decrementar) {
                        w -= 1;
                        h -= 1;
                    } else {
                        w = widthI - decrementar;
                        h = heightI - decrementar;
                        time.cancel();
                    }
                    component.setSize(w, h);
                    i++;
                }
            };
            time.schedule(task, tiempoDeRetrasoEnAnimar, delay);
        } else {
            throw new Exception(
                    "La posici�n inicial tiene que estar a corde a la posici�n en el eje y del componente");
        }
    }
}
