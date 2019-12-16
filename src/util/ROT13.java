package util;

/**
 *
 * @author Jerson
 */
public class ROT13 {
    
    public static String cifrar(String texto) {
        char ch, ch1; 
        int i, y, l;
        String str1="";
        l = texto.length (); 
        for (i = 0; i <l; i ++)
        {
            ch = texto.charAt (i); 
            if (ch>= 'A' && ch <= 'M' || ch>= 'a' && ch <= 'm')
            {
                y = (int) ch + 13;
                ch = (char) y;
                str1 = str1 + ch;
            }
            else if (ch>= 'N' && ch <= 'Z' || ch>= 'n' && ch <= 'z')
            {
                y = (int) ch-13;
                ch = (char) y;
                str1 = str1 + ch;
            }
        }
        return str1;
    }
    
}
