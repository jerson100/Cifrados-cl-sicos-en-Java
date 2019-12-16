package modelo;

/**
 *
 * @author Jerson
 */
public class Letra {
    
    private char caracter;
    private int x;
    private int y;
    private boolean init;
    private boolean fin;

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Letra{" + "caracter=" + caracter + '}';
    }

    public boolean isInit() {
        return this.init;
    }

    public void setInit(boolean init) {
        this.init = init;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.caracter;
        hash = 23 * hash + this.x;
        hash = 23 * hash + this.y;
        hash = 23 * hash + (this.init ? 1 : 0);
        hash = 23 * hash + (this.fin ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Letra other = (Letra) obj;
        if (this.caracter != other.caracter) {
            return false;
        }
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.init != other.init) {
            return false;
        }
        if (this.fin != other.fin) {
            return false;
        }
        return true;
    }

    
    
    
}
