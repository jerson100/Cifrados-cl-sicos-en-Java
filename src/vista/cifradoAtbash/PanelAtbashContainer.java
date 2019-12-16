package vista.cifradoAtbash;

import javax.swing.JFrame;

/**
 *
 * @author Jerson
 */
public class PanelAtbashContainer extends javax.swing.JPanel {
    public JFrame frm;
    public PanelAtbashContainer(JFrame frm) {
        
        initComponents();
        this.frm = frm;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menuPanel = new javax.swing.JTabbedPane();
        pnlSimuladorContainer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTextoIngresado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblCantidadCaracteres = new javax.swing.JLabel();
        lbl = new javax.swing.JLabel();
        lblAnimacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel1.setLayout(null);

        menuPanel.setBackground(new java.awt.Color(255, 204, 204));
        menuPanel.setTabPlacement(javax.swing.JTabbedPane.RIGHT);
        menuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuPanelMouseClicked(evt);
            }
        });

        pnlSimuladorContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlSimuladorContainer.setLayout(null);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        jPanel4.setLayout(null);

        jLabel4.setText("Cantidad de carácteres ingresados:");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(260, 310, 220, 20);

        txtTextoIngresado.setBackground(new java.awt.Color(102, 102, 102));
        txtTextoIngresado.setColumns(20);
        txtTextoIngresado.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtTextoIngresado.setForeground(new java.awt.Color(51, 255, 51));
        txtTextoIngresado.setRows(5);
        txtTextoIngresado.setCaretColor(new java.awt.Color(51, 255, 204));
        txtTextoIngresado.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtTextoIngresado);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 460, 200);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el texto:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(60, 50, 320, 30);

        lblCantidadCaracteres.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblCantidadCaracteres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidadCaracteres.setText("0");
        jPanel4.add(lblCantidadCaracteres);
        lblCantidadCaracteres.setBounds(490, 310, 30, 20);

        lbl.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl.setText("Atbash");
        jPanel4.add(lbl);
        lbl.setBounds(440, 20, 80, 30);

        lblAnimacion.setForeground(new java.awt.Color(0, 153, 204));
        lblAnimacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAnimacion.setText("ver animación..");
        lblAnimacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblAnimacion);
        lblAnimacion.setBounds(360, 380, 160, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("*  Los espacios al inicio y final se eliminan");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 70, 290, 20);

        pnlSimuladorContainer.add(jPanel4);
        jPanel4.setBounds(20, 10, 590, 490);

        menuPanel.addTab("Simulador", pnlSimuladorContainer);

        jPanel1.add(menuPanel);
        menuPanel.setBounds(117, 3, 720, 514);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked

    }//GEN-LAST:event_menuPanelMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl;
    public javax.swing.JLabel lblAnimacion;
    public javax.swing.JLabel lblCantidadCaracteres;
    private javax.swing.JTabbedPane menuPanel;
    private javax.swing.JPanel pnlSimuladorContainer;
    public javax.swing.JTextArea txtTextoIngresado;
    // End of variables declaration//GEN-END:variables
}
