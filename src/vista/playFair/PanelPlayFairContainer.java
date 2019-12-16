package vista.playFair;

import javax.swing.JOptionPane;
import util.*;

/**
 *
 * @author Jerson
 */
public class PanelPlayFairContainer extends javax.swing.JPanel {

    public PanelPlayFairContainer() {
        initComponents();
        jtxtresultado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxttexto = new javax.swing.JTextField();
        jtxtclave = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jbtndescifrar = new javax.swing.JButton();
        jbtncifrar = new javax.swing.JButton();
        jbtnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtresultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("PLAYFAIR");
        add(jLabel1);
        jLabel1.setBounds(410, 20, 108, 26);

        jLabel2.setText("Ingrese Mensaje: ");
        add(jLabel2);
        jLabel2.setBounds(140, 70, 87, 14);

        jtxttexto.setEditable(false);
        add(jtxttexto);
        jtxttexto.setBounds(140, 110, 224, 30);

        jtxtclave.setEditable(false);
        add(jtxtclave);
        jtxtclave.setBounds(590, 110, 220, 30);

        jLabel3.setText("Ingrese Palabra Clave: ");
        add(jLabel3);
        jLabel3.setBounds(590, 70, 113, 14);

        jbtndescifrar.setText("Descifrar");
        jbtndescifrar.setEnabled(false);
        jbtndescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndescifrarActionPerformed(evt);
            }
        });
        add(jbtndescifrar);
        jbtndescifrar.setBounds(280, 170, 80, 25);

        jbtncifrar.setText("Cifrar");
        jbtncifrar.setEnabled(false);
        jbtncifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncifrarActionPerformed(evt);
            }
        });
        add(jbtncifrar);
        jbtncifrar.setBounds(140, 170, 80, 25);

        jbtnnuevo.setText("Nuevo");
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        add(jbtnnuevo);
        jbtnnuevo.setBounds(730, 460, 80, 25);

        jtxtresultado.setColumns(20);
        jtxtresultado.setRows(5);
        jScrollPane1.setViewportView(jtxtresultado);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 230, 670, 200);
        add(jPanel1);
        jPanel1.setBounds(10, 10, 100, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtndescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndescifrarActionPerformed
        try {
            jtxttexto.setEditable(false);
            jtxtclave.setEditable(false);
            String texto = jtxttexto.getText();
            String clave = jtxtclave.getText();

            if ("".equals(jtxtclave.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Clave", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                jtxtresultado.setText(Cifrado(texto));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es necesario poner espacios");
        }

    }//GEN-LAST:event_jbtndescifrarActionPerformed

    private void jbtncifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncifrarActionPerformed
        try {
            jtxttexto.setEditable(false);
            jtxtclave.setEditable(false);
            String texto = jtxttexto.getText();
            String clave = jtxtclave.getText();

            if ("".equals(jtxtclave.getText())) {
                JOptionPane.showMessageDialog(null, "Ingrese Clave", "ERROR", JOptionPane.ERROR_MESSAGE);
            } else {
                jtxtresultado.setText(Cifrado(texto));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No es necesario poner espacios");
        }

    }//GEN-LAST:event_jbtncifrarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        habilitaControles(true);
        limpiaControles();
    }//GEN-LAST:event_jbtnnuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncifrar;
    private javax.swing.JButton jbtndescifrar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JTextField jtxtclave;
    private javax.swing.JTextArea jtxtresultado;
    private javax.swing.JTextField jtxttexto;
    // End of variables declaration//GEN-END:variables

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

    private String Cifrado(String texto) {
        String clave;
        clave = jtxtclave.getText();
        PlayEncriptor pfEncryption = new PlayEncriptor();
        pfEncryption.makeArray(clave);
        texto = pfEncryption.manageMessage(texto);
        pfEncryption.doPlayFair(texto, "Encriptar");
        String en = pfEncryption.getEncrypted();
        pfEncryption.doPlayFair(en, "Desencriptar");
        return en;

    }

    private String Descifrado(String texto) {
        String clave;
        clave = jtxtclave.getText();
        PlayEncriptor pfEncryption = new PlayEncriptor();
        pfEncryption.makeArray(clave);
        texto = pfEncryption.manageMessage(texto);
        pfEncryption.doPlayFair(texto, "Encriptar");
        String en = pfEncryption.getEncrypted();
        pfEncryption.doPlayFair(en, "Desencriptar");
        return texto;

    }

}
