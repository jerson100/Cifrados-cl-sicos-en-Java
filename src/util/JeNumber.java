package util;

/**
 *
 * @author Jerson
 */
public class JeNumber {
    
    private JeNumber(){}
    
    public static int aleatorio(int i,int f){
        return ((int)(Math.random() * (f - i + 1)) + i);
    }
    
}
