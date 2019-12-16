package vista.ascii;

import javax.swing.JOptionPane;

/**
 *
 * @author Jerson
 */
public class PanelAsciiContainer extends javax.swing.JPanel {

    public PanelAsciiContainer() {
        initComponents();
        jtxtresultado.setEditable(false);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtxttexto = new javax.swing.JTextField();
        jbtncifrar = new javax.swing.JButton();
        jbtndescifrar = new javax.swing.JButton();
        jbtnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtresultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setText("ASCII");
        add(jLabel1);
        jLabel1.setBounds(390, 10, 60, 26);

        jLabel2.setText("Ingrese Mensaje:");
        add(jLabel2);
        jLabel2.setBounds(140, 60, 140, 30);

        jtxttexto.setEditable(false);
        jtxttexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxttextoKeyReleased(evt);
            }
        });
        add(jtxttexto);
        jtxttexto.setBounds(140, 100, 510, 30);

        jbtncifrar.setText("Cifrar");
        jbtncifrar.setEnabled(false);
        jbtncifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncifrarActionPerformed(evt);
            }
        });
        add(jbtncifrar);
        jbtncifrar.setBounds(140, 160, 80, 25);

        jbtndescifrar.setText("Descifrar");
        jbtndescifrar.setEnabled(false);
        jbtndescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndescifrarActionPerformed(evt);
            }
        });
        add(jbtndescifrar);
        jbtndescifrar.setBounds(270, 160, 80, 25);

        jbtnnuevo.setText("Nuevo");
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        add(jbtnnuevo);
        jbtnnuevo.setBounds(740, 470, 80, 25);

        jtxtresultado.setColumns(20);
        jtxtresultado.setRows(5);
        jScrollPane1.setViewportView(jtxtresultado);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 210, 680, 220);
        add(jPanel1);
        jPanel1.setBounds(10, 10, 100, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtncifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncifrarActionPerformed
        jtxttexto.setEditable(false);
        String texto;
        texto = jtxttexto.getText();
        jtxtresultado.setText(String.valueOf(Cifrado(texto)));
        jbtncifrar.setEnabled(false);
            jbtndescifrar.setEnabled(false);
    }//GEN-LAST:event_jbtncifrarActionPerformed

    private void jbtndescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndescifrarActionPerformed
        try {
            jtxttexto.setEditable(false);
            String texto;
            texto = jtxttexto.getText().trim();
            String data[] = texto.split(" ");
            String rspt = "";
            for (String s : data) {
                rspt +=  String.valueOf((char)(Integer.parseInt(s)));
            }
            jtxtresultado.setText(rspt);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ingrese solo numeros\n     borre las letras");
        }
        jbtncifrar.setEnabled(false);
        jbtndescifrar.setEnabled(false);
    }//GEN-LAST:event_jbtndescifrarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        jtxttexto.setEditable(true);
        limpiaControles();
    }//GEN-LAST:event_jbtnnuevoActionPerformed

    private void jtxttextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttextoKeyReleased
       if(jtxttexto.getText().isEmpty()){
            jbtncifrar.setEnabled(false);
            jbtndescifrar.setEnabled(false);
        }else{
            jbtncifrar.setEnabled(true);
            jbtndescifrar.setEnabled(true);
        }
    }//GEN-LAST:event_jtxttextoKeyReleased


    private void limpiaControles() {
        jtxttexto.setText("");//asigna un valor vacio a la caja de texto, en otras palabras lo limpia
        jtxtresultado.setText("");
        jtxttexto.requestFocus();//sirve para responder al evento del teclado
    }

    private Object Cifrado(String texto) {
        
        long asci;
        String cadena="";
        for (int i = 0; i < texto.length(); i++) {
                    asci = texto.charAt(i);
                   cadena=cadena+" "+asci; 
                }  
        return cadena;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtncifrar;
    private javax.swing.JButton jbtndescifrar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JTextArea jtxtresultado;
    private javax.swing.JTextField jtxttexto;
    // End of variables declaration//GEN-END:variables
}
