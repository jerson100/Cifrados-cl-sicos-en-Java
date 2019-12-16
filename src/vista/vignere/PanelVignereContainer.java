package vista.vignere;

import javax.swing.JOptionPane;

/**
 *
 * @author Edson
 */
public class PanelVignereContainer extends javax.swing.JPanel {

    public PanelVignereContainer() {
        initComponents();
        jtxtresultado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jtxttexto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtclave = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbtndescifrar = new javax.swing.JButton();
        jbtncifrar = new javax.swing.JButton();
        jbtnnuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtresultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        setLayout(null);

        jtxttexto.setEditable(false);
        add(jtxttexto);
        jtxttexto.setBounds(140, 100, 240, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Ingrese Mensaje: ");
        add(jLabel2);
        jLabel2.setBounds(140, 60, 120, 17);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ingrese Clave: ");
        add(jLabel3);
        jLabel3.setBounds(580, 60, 100, 17);

        jtxtclave.setEditable(false);
        add(jtxtclave);
        jtxtclave.setBounds(580, 100, 230, 20);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("VIGENERE");
        add(jLabel1);
        jLabel1.setBounds(410, 20, 112, 26);

        jbtndescifrar.setText("Descifrar");
        jbtndescifrar.setEnabled(false);
        jbtndescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndescifrarActionPerformed(evt);
            }
        });
        add(jbtndescifrar);
        jbtndescifrar.setBounds(300, 160, 80, 25);

        jbtncifrar.setText("Cifrar");
        jbtncifrar.setEnabled(false);
        jbtncifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncifrarActionPerformed(evt);
            }
        });
        add(jbtncifrar);
        jbtncifrar.setBounds(140, 160, 80, 25);

        jbtnnuevo.setText("Nuevo");
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        add(jbtnnuevo);
        jbtnnuevo.setBounds(730, 460, 80, 25);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Resultado");
        add(jLabel4);
        jLabel4.setBounds(140, 220, 250, 30);

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        jtxtresultado.setColumns(20);
        jtxtresultado.setRows(5);
        jScrollPane1.setViewportView(jtxtresultado);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 270, 670, 150);
        add(jPanel1);
        jPanel1.setBounds(10, 10, 100, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtndescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndescifrarActionPerformed
        if (jtxttexto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un mensaje");
        } else if (jtxtclave.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una clave");
            jtxttexto.setEditable(false);
        } else {
            jtxttexto.setEditable(false);
            jtxtclave.setEditable(false);
            String texto;
            texto = jtxttexto.getText();
            String clave = jtxtclave.getText();
            String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            jtxtresultado.setText(Descifrado(alfabeto, texto, clave));
        }
    }//GEN-LAST:event_jbtndescifrarActionPerformed

    private void jbtncifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncifrarActionPerformed
        if (jtxttexto.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un mensaje");
        } else if (jtxtclave.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe ingresar una clave");
            jtxttexto.setEditable(false);
        } else {
            jtxttexto.setEditable(false);
            jtxtclave.setEditable(false);
            String texto;
            texto = jtxttexto.getText();
            String clave = jtxtclave.getText();
            String alfabeto = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
            jtxtresultado.setText(Cifrado(alfabeto, texto, clave));
        }
    }//GEN-LAST:event_jbtncifrarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        habilitaControles(true);
        limpiaControles();
    }//GEN-LAST:event_jbtnnuevoActionPerformed

    private String Cifrado(String alfabeto, String texto, String clave) {
        clave = rellenar(texto, clave);
        texto = texto.toUpperCase();
        String rspt = "";
        for (int i = 0; i < texto.length(); i++) {
            if (alfabeto.indexOf(texto.charAt(i)) == -1) {
                rspt += texto.charAt(i);
            } else {
                int replace = (alfabeto.indexOf(texto.charAt(i)) + alfabeto.indexOf(clave.charAt(i))) % alfabeto.length();
                rspt += alfabeto.charAt(replace);
            }
        }
        return rspt;
    }

    private void habilitaControles(boolean b) {
        jtxttexto.setEditable(b);//la caja de texto es editable
        jtxtclave.setEditable(b);
        jbtncifrar.setEnabled(b);//los botones cifrar y descifrar son habilitadas
        jbtndescifrar.setEnabled(b);
    }

    private void limpiaControles() {
        jtxttexto.setText("");//asigna un valor vacio a la caja de texto, en otras palabras lo limpia
        jtxtclave.setText("");
        jtxtresultado.setText("");
        jtxttexto.requestFocus();//sirve para responder al evento del teclado
    }

    private String Descifrado(String alfabeto, String texto, String clave) {
        clave = rellenar(texto, clave);
        texto = texto.toUpperCase();
        int replace;
        String rspt = "";
        for (int i = 0; i < texto.length(); i++) {
            if (alfabeto.indexOf(texto.charAt(i)) == -1) {
                rspt += texto.charAt(i);
            } else {
                if (alfabeto.indexOf(texto.charAt(i)) - alfabeto.indexOf(clave.charAt(i)) >= 0) {
                    replace = (alfabeto.indexOf(texto.charAt(i)) - alfabeto.indexOf(clave.charAt(i))) % alfabeto.length();
                    rspt += alfabeto.charAt(replace);
                } else {
                    replace = (alfabeto.indexOf(texto.charAt(i)) - alfabeto.indexOf(clave.charAt(i)) + alfabeto.length()) % alfabeto.length();
                    rspt += alfabeto.charAt(replace);
                }
            }
        }
        return rspt;
    }

    public static String rellenar(String txt, String clave) {
        clave = clave.toUpperCase();
        clave = clave.replace(" ", "");
        String cadena = "";
        int i = 0;
        for (int j = 0; j < txt.length(); j++) {
            if (txt.charAt(j) == ' ') {
                cadena += " ";
            } else {
                if (i >= clave.length()) {
                    i = 0;
                }
                cadena += clave.charAt(i++);
            }
        }
        return cadena;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncifrar;
    private javax.swing.JButton jbtndescifrar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JTextField jtxtclave;
    private javax.swing.JTextArea jtxtresultado;
    private javax.swing.JTextField jtxttexto;
    // End of variables declaration//GEN-END:variables
}
