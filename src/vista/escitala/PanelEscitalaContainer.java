package vista.escitala;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edson
 */
public class PanelEscitalaContainer extends javax.swing.JPanel {

    private DefaultTableModel objDtm;

    public PanelEscitalaContainer() {
        initComponents();
        objDtm = (DefaultTableModel) jtblmatriz.getModel();
        jtxtresultado.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxtfilas = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtcolumnas = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jbtncifrar = new javax.swing.JButton();
        jtxttexto = new javax.swing.JTextField();
        jbtndescifrar = new javax.swing.JButton();
        jbtnnuevo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblmatriz = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtresultado = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Ingrese Mensaje: ");
        add(jLabel2);
        jLabel2.setBounds(140, 50, 120, 15);

        jLabel1.setFont(new java.awt.Font("Georgia", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SCITALA");
        add(jLabel1);
        jLabel1.setBounds(360, 10, 120, 28);

        jtxtfilas.setEditable(false);
        jtxtfilas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtfilasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtfilasKeyTyped(evt);
            }
        });
        add(jtxtfilas);
        jtxtfilas.setBounds(630, 80, 80, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Filas: ");
        add(jLabel3);
        jLabel3.setBounds(630, 50, 60, 15);

        jtxtcolumnas.setEditable(false);
        jtxtcolumnas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxtcolumnasKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtcolumnasKeyTyped(evt);
            }
        });
        add(jtxtcolumnas);
        jtxtcolumnas.setBounds(740, 80, 80, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Columnas: ");
        add(jLabel4);
        jLabel4.setBounds(740, 50, 70, 15);

        jbtncifrar.setText("Cifrar");
        jbtncifrar.setEnabled(false);
        jbtncifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncifrarActionPerformed(evt);
            }
        });
        add(jbtncifrar);
        jbtncifrar.setBounds(140, 120, 80, 25);

        jtxttexto.setEditable(false);
        jtxttexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxttextoActionPerformed(evt);
            }
        });
        jtxttexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxttextoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtxttextoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxttextoKeyTyped(evt);
            }
        });
        add(jtxttexto);
        jtxttexto.setBounds(140, 80, 310, 20);

        jbtndescifrar.setText("Descifrar");
        jbtndescifrar.setEnabled(false);
        jbtndescifrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtndescifrarActionPerformed(evt);
            }
        });
        add(jbtndescifrar);
        jbtndescifrar.setBounds(250, 120, 80, 25);

        jbtnnuevo.setText("Nuevo");
        jbtnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnnuevoActionPerformed(evt);
            }
        });
        add(jbtnnuevo);
        jbtnnuevo.setBounds(140, 470, 80, 25);

        jtblmatriz.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jtblmatriz);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 160, 680, 160);

        jtxtresultado.setColumns(20);
        jtxtresultado.setRows(5);
        jScrollPane2.setViewportView(jtxtresultado);

        add(jScrollPane2);
        jScrollPane2.setBounds(140, 340, 680, 110);
        add(jPanel1);
        jPanel1.setBounds(10, 10, 100, 500);
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtfilasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtfilasKeyReleased
        if (jtxtfilas.getText().isEmpty()) {
            jtxtcolumnas.setText("");
            jtxtcolumnas.setEnabled(true);
            jtxtcolumnas.setEditable(false);
        } else {
            if (Integer.parseInt(jtxtfilas.getText()) > 0) {
                jtxtcolumnas.setEnabled(true);
                jtxtcolumnas.setEditable(true);
            } else {
                JOptionPane.showMessageDialog(null, "Las filas no pueden ser 0");
                jtxtfilas.setText("");
            }
        }
        habilitaBotones();
    }//GEN-LAST:event_jtxtfilasKeyReleased

    private void jtxtfilasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtfilasKeyTyped
        if (!("" + evt.getKeyChar()).matches("[0-9]")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtfilasKeyTyped

    private void jtxtcolumnasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcolumnasKeyReleased
        habilitaBotones();
        if (jtxtcolumnas.getText().isEmpty()) {
            return;
        }
        int longi = jtxttexto.getText().length();
        int fil = Integer.parseInt(jtxtfilas.getText());
        int col = jtxtcolumnas.getText().isEmpty() ? 0 : Integer.parseInt(jtxtcolumnas.getText());
        if (fil * col < longi) {
            jtxtcolumnas.setText("" + (longi / fil + (longi % fil > 0 ? 1 : 0)));
        }
    }//GEN-LAST:event_jtxtcolumnasKeyReleased

    private void jtxtcolumnasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtcolumnasKeyTyped
        if (!("" + evt.getKeyChar()).matches("[0-9]")) {
            evt.consume();
        }
    }//GEN-LAST:event_jtxtcolumnasKeyTyped

    private void jbtncifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncifrarActionPerformed

        int n = Integer.parseInt(jtxtfilas.getText());
        int m = Integer.parseInt(jtxtcolumnas.getText());
        char matriz[][] = new char[n][m];
        String sal = this.Cifrado(matriz, n, m);
        jtxtresultado.setText(sal);
        this.mostrarMatriz(matriz, n, m);
        jtxtfilas.setEditable(false);
        jtxtcolumnas.setEditable(false);
        jtxttexto.setEditable(false);

        jbtncifrar.setEnabled(false);
        jbtndescifrar.setEnabled(false);

    }//GEN-LAST:event_jbtncifrarActionPerformed

    private void jtxttextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxttextoActionPerformed

    }//GEN-LAST:event_jtxttextoActionPerformed

    private void jtxttextoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttextoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxttextoKeyPressed

    private void jtxttextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttextoKeyReleased
        if (jtxttexto.getText().isEmpty()) {
            jtxtfilas.setEditable(false);
            jtxtcolumnas.setEditable(false);
            jtxtcolumnas.setEnabled(false);
            jtxtfilas.setEnabled(false);
        } else {
            jtxtfilas.setEnabled(true);
            jtxtfilas.setEditable(true);
        }
        habilitaBotones();
    }//GEN-LAST:event_jtxttextoKeyReleased

    private void jtxttextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxttextoKeyTyped

    }//GEN-LAST:event_jtxttextoKeyTyped

    private void jbtndescifrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtndescifrarActionPerformed

        int n = Integer.parseInt(jtxtfilas.getText());
        int m = Integer.parseInt(jtxtcolumnas.getText());
        char matriz[][] = new char[n][m];
        String sal = this.Descifrado(matriz, n, m);
        jtxtresultado.setText(sal.trim());
        this.mostrarMatriz2(matriz, n, m);
        jtxtfilas.setEditable(false);
        jtxtcolumnas.setEditable(false);
        jtxttexto.setEditable(false);
        jbtncifrar.setEnabled(false);
        jbtndescifrar.setEnabled(false);
        

    }//GEN-LAST:event_jbtndescifrarActionPerformed

    private void jbtnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnnuevoActionPerformed
        habilitaControles(true);
        jbtncifrar.setEnabled(false);
        jbtndescifrar.setEnabled(false);
        jtxtcolumnas.setEditable(false);
        jtxtfilas.setEditable(false);
        jtxtcolumnas.setEnabled(false);
        jtxtfilas.setEnabled(false);
        limpiaControles();
    }//GEN-LAST:event_jbtnnuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbtncifrar;
    private javax.swing.JButton jbtndescifrar;
    private javax.swing.JButton jbtnnuevo;
    private javax.swing.JTable jtblmatriz;
    private javax.swing.JTextField jtxtcolumnas;
    private javax.swing.JTextField jtxtfilas;
    private javax.swing.JTextArea jtxtresultado;
    private javax.swing.JTextField jtxttexto;
    // End of variables declaration//GEN-END:variables

    private void habilitaBotones() {
        if (jtxttexto.getText().isEmpty() || jtxtfilas.getText().isEmpty() || jtxtcolumnas.getText().isEmpty()) {
            jbtncifrar.setEnabled(false);
            jbtndescifrar.setEnabled(false);
        } else {
            jbtncifrar.setEnabled(true);
            jbtndescifrar.setEnabled(true);
        }
    }

    private String Cifrado(char[][] matriz, int n, int m) {
        int d = 0;
        int p = 0;
        String sal = "";
        int espacios = m * n - jtxttexto.getText().length();
        String aux = jtxttexto.getText();
        for (int i = 0; i < espacios; i++) {
            aux += " ";
        }
        for (int i = 0; i <= (aux.length() - 1) + m; i++) {//i=21,i=22
            if (d > (aux.length() - 1)) {//d>17
                p++;//p=0+1,p=1+1,p=2+1,p=3+1,p=4+1
                d = p;//d=1,d=2,d=3,d=4,d=5
            } else {
                sal += aux.charAt(d);//sal=h+i+o+o+g+e+l+o+s+a+c+t+a+o+a+m+m+s
                d += m;//d=3+6,d=9+6,d=15+6,d=4+6,d=10+6,d=16+6,d=5+6,d=11+6,d=17+6  
            }
        }
        return sal;
    }

    private void mostrarMatriz(char[][] matriz, int n, int m) {
        DefaultTableModel model = (DefaultTableModel) jtblmatriz.getModel();
        model.setRowCount(n);//cantidad de filas
        model.setColumnCount(m);//cantidad de columnas
        int elemento = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (elemento < jtxttexto.getText().length()) {
                    jtblmatriz.setValueAt(jtxttexto.getText().charAt(elemento), i, j);
                    elemento++;
                }
            }
        }
    }

    private void habilitaControles(boolean b) {
        jtxttexto.setEditable(b);//la caja de texto es editable

    }

    private void limpiaControles() {
        jtxttexto.setText("");//asigna un valor vacio a la caja de texto, en otras palabras lo limpia
        jtxtresultado.setText("");
        jtxtfilas.setText("");
        jtxtcolumnas.setText("");
        jtxttexto.requestFocus();//sirve para responder al evento del teclado
        limpiarJTable();
    }

    private void limpiarJTable() {
        while (objDtm.getRowCount() > 0) {
            objDtm.removeRow(0);
        }
    }

    private String Descifrado(char[][] matriz, int n, int m) {
        int d = 0;
        int p = 0;
        String sal = "";
        for (int i = 0; i <= (jtxttexto.getText().length() - 1) + n; i++) {//i=21,i=22
            if (d > (jtxttexto.getText().length() - 1)) {//d>17
                p++;//p=0+1,p=1+1,p=2+1,p=3+1,p=4+1
                d = p;//d=1,d=2,d=3,d=4,d=5
            } else {
                sal += jtxttexto.getText().charAt(d);//sal=h+i+o+o+g+e+l+o+s+a+c+t+a+o+a+m+m+s
                d += n;//d=3+6,d=9+6,d=15+6,d=4+6,d=10+6,d=16+6,d=5+6,d=11+6,d=17+6  
            }
        }
        return sal;
    }

    private void mostrarMatriz2(char[][] matriz, int n, int m) {
        try {
            DefaultTableModel model = (DefaultTableModel) jtblmatriz.getModel();
            model.setRowCount(n);//cantidad de filas
            model.setColumnCount(m);//cantidad de columnas
            int elemento = 0;
            int p = 0;
            //programareslomascercanoatenersuperpoderes
            //peredrscreolasrgonuermopsaaae mstr acep reno
            for (int i = 0; i < n; i++) {//i<5
                for (int j = 0; j <= m; j++) {//i<10
                    if (elemento < jtxttexto.getText().length()) {//0<45
                        jtblmatriz.setValueAt(jtxttexto.getText().charAt(elemento), i, j);
                        elemento += n;//=0,=3=6=9,=12,=15,=18

                    } else {
                        p++;
                        elemento = p;

                    }
                }//h+o+l+a+a+m
            }
        } catch (Exception e) {}

    }
}
