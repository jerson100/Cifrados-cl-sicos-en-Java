package vista.cifradoPolybios;

import vista.cifradoCesar.*;
import vista.JFramePrincipal;

/**
 *
 * @author Jerson
 */
public class PanelPolybiosContainer extends javax.swing.JPanel {

    public JFramePrincipal frm;
    public boolean isCifrado;
    
    public PanelPolybiosContainer(JFramePrincipal frm) {
        this.frm = frm;
        initComponents();
        //this.setBounds(841, 10, 840, 520);
        
        /*
        menuPanel.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
            
                int seleccion = menuPanel.getSelectedIndex();
                
                pnlTutorial.terminarHilo();
                
                switch(seleccion){
                    
                    case 1:
                        
                        pnlTutorial.iniciarAnimacion();
                        
                        break;
                        
                }
            
            }
        });
        */
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPanel = new javax.swing.JTabbedPane();
        pnlSimuladorContainer = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTextoIngresado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        lblCantidadCaracteres = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlCifrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlDescifrar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRot = new javax.swing.JLabel();
        lblAnimacion = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 3));
        setLayout(null);

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
        jLabel4.setBounds(260, 300, 220, 20);

        txtTextoIngresado.setBackground(new java.awt.Color(102, 102, 102));
        txtTextoIngresado.setColumns(20);
        txtTextoIngresado.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtTextoIngresado.setForeground(new java.awt.Color(51, 255, 51));
        txtTextoIngresado.setRows(5);
        txtTextoIngresado.setCaretColor(new java.awt.Color(51, 255, 204));
        txtTextoIngresado.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(txtTextoIngresado);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(60, 90, 460, 190);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel1.setText("Ingrese el texto:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(60, 50, 320, 30);

        lblCantidadCaracteres.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        lblCantidadCaracteres.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCantidadCaracteres.setText("0");
        jPanel4.add(lblCantidadCaracteres);
        lblCantidadCaracteres.setBounds(490, 300, 30, 20);

        jPanel1.setLayout(null);

        pnlCifrar.setBackground(new java.awt.Color(153, 153, 153));
        pnlCifrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlCifrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlCifrarMouseClicked(evt);
            }
        });
        pnlCifrar.setLayout(null);

        jLabel7.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("C");
        pnlCifrar.add(jLabel7);
        jLabel7.setBounds(10, 5, 40, 40);

        jPanel1.add(pnlCifrar);
        pnlCifrar.setBounds(230, 0, 60, 50);

        pnlDescifrar.setBackground(new java.awt.Color(153, 153, 153));
        pnlDescifrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        pnlDescifrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlDescifrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDescifrarMouseClicked(evt);
            }
        });
        pnlDescifrar.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("D");
        pnlDescifrar.add(jLabel8);
        jLabel8.setBounds(10, 5, 40, 40);

        jPanel1.add(pnlDescifrar);
        pnlDescifrar.setBounds(290, 0, 60, 50);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel2.setText("¿Qúe desea hacer?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 10, 160, 30);

        jPanel4.add(jPanel1);
        jPanel1.setBounds(170, 340, 350, 50);

        lblRot.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        lblRot.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRot.setText("ROT 13");
        jPanel4.add(lblRot);
        lblRot.setBounds(440, 20, 80, 30);

        lblAnimacion.setForeground(new java.awt.Color(0, 153, 204));
        lblAnimacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAnimacion.setText("ver animación..");
        lblAnimacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(lblAnimacion);
        lblAnimacion.setBounds(360, 430, 160, 14);

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 204, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("*  Los espacios al inicio y final se eliminan");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(230, 70, 290, 20);

        pnlSimuladorContainer.add(jPanel4);
        jPanel4.setBounds(20, 10, 590, 490);

        menuPanel.addTab("Simulador", pnlSimuladorContainer);

        add(menuPanel);
        menuPanel.setBounds(117, 3, 720, 514);
    }// </editor-fold>//GEN-END:initComponents

    private void menuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPanelMouseClicked
       
    }//GEN-LAST:event_menuPanelMouseClicked

    private void pnlDescifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDescifrarMouseClicked
        
    }//GEN-LAST:event_pnlDescifrarMouseClicked

    private void pnlCifrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCifrarMouseClicked
        
    }//GEN-LAST:event_pnlCifrarMouseClicked

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblAnimacion;
    public javax.swing.JLabel lblCantidadCaracteres;
    public javax.swing.JLabel lblRot;
    private javax.swing.JTabbedPane menuPanel;
    public javax.swing.JPanel pnlCifrar;
    public javax.swing.JPanel pnlDescifrar;
    private javax.swing.JPanel pnlSimuladorContainer;
    public javax.swing.JTextArea txtTextoIngresado;
    // End of variables declaration//GEN-END:variables
}
