package util;

public class CifradoPoliBios {

    /*public static void main(String[] args) {
        String m[][] = {
            {"-", "A", "B", "C", "D", "E"},
            {"A", "A", "B", "C", "D", "E"},
            {"B", "F", "G", "H", "IJ", "K"},
            {"C", "L", "M", "NÑ", "O", "P"},
            {"D", "Q", "R", "S", "T", "U"},
            {"E", "V", "W", "X", "Y", "Z"}
        };

        try (Scanner sc = new Scanner(System.in)) {
            String txt = sc.nextLine();
            String txtCifrado = cifradoPolyBios(m, txt);
            System.out.println("Texto cifrado: " + txtCifrado);
            //System.out.println("Texto descifrado: " + descifrado(m, txtCifrado));
        }
    }*/

    public static String cifradoPolyBios(String[][] m, String txt) {
        txt = txt.toUpperCase();
        String rspt = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = txt.charAt(i);
            rspt += getCaracter(m, ""+c);
        }
        return rspt.trim();
    }

    public static String getCaracter(String[][] m, String c) {
        for (int i = 1; i < m.length; i++) {
            for (int j = 1; j < m[i].length; j++) {
               if (m[i][j].length() == 2) {
                    if (c.equals(""+m[i][j].charAt(0)) || c.equals(""+m[i][j].charAt(1))) {
                        return m[i][0] + m[0][j] + " ";
                    }
                } else {
                    if (c.equals(""+m[i][j].charAt(0))) {
                        return m[i][0] + m[0][j] + " ";
                    }
                }
            }
        }
        return "" + c;
    }

    public static String descifrado(String[][] dat, String txt) {

        String split[] = txt.split(" ");
        String rspt = "";

        for (int i = 0; i < split.length; i++) {

            String cad = split[i];

            String fil = "" + cad.charAt(0);
            String col = "" + cad.charAt(1);

            int[] indices = getIndex(dat, fil, col);

            rspt += dat[indices[0]][indices[1]].charAt(0);

        }

        return rspt;
    }

    public static int[] getIndex(String[][] m, String fil, String col) {
        int f = -1;
        int c = -1;
        for (int i = 1; i < m.length; i++) {
            if (m[i][0].equals(fil)) {
                f = i;
                break;
            }
        }
        for (int i = 1; i < m.length; i++) {
            if (m[0][i].equals(col)) {
                c = i;
                break;
            }
        }
        return new int[]{f, c};
    }

}
