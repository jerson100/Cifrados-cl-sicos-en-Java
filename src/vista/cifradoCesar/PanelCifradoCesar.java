package vista.cifradoCesar;

import javax.swing.JPanel;
import vista.JFramePrincipal;

/**
 *
 * @author Jerson
 */
public class PanelCifradoCesar extends javax.swing.JPanel {

   public JPanel panelContainer;
   public JFramePrincipal frm;
    
    public PanelCifradoCesar(JPanel panelContainer,JFramePrincipal frm) {
        initComponents();
        this.frm = frm;
        this.panelContainer = panelContainer;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRot47 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlIrRot47 = new javax.swing.JPanel();
        lblIrRot49 = new javax.swing.JLabel();
        pnlRot3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnlIrRot3 = new javax.swing.JPanel();
        lblIrRot4 = new javax.swing.JLabel();
        pnlRot13 = new javax.swing.JPanel();
        lblRot13 = new javax.swing.JLabel();
        pnlIrRot13 = new javax.swing.JPanel();
        lblIrRot13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        pnlRot47.setBackground(new java.awt.Color(255, 166, 0));
        pnlRot47.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRot47.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ROT47");
        pnlRot47.add(jLabel2);
        jLabel2.setBounds(60, 50, 100, 50);

        pnlIrRot47.setBackground(new java.awt.Color(0, 153, 204));
        pnlIrRot47.setLayout(null);

        lblIrRot49.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblIrRot49.setForeground(new java.awt.Color(255, 255, 255));
        lblIrRot49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIrRot49.setText("Ir");
        lblIrRot49.setToolTipText("");
        pnlIrRot47.add(lblIrRot49);
        lblIrRot49.setBounds(10, 10, 50, 14);

        pnlRot47.add(pnlIrRot47);
        pnlIrRot47.setBounds(150, 120, 70, 30);

        add(pnlRot47);
        pnlRot47.setBounds(310, 520, 227, 158);

        pnlRot3.setBackground(new java.awt.Color(235, 86, 86));
        pnlRot3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRot3.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ROT3");
        pnlRot3.add(jLabel3);
        jLabel3.setBounds(60, 50, 100, 50);

        pnlIrRot3.setBackground(new java.awt.Color(0, 153, 204));
        pnlIrRot3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIrRot3.setLayout(null);

        lblIrRot4.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblIrRot4.setForeground(new java.awt.Color(255, 255, 255));
        lblIrRot4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIrRot4.setText("Ir");
        pnlIrRot3.add(lblIrRot4);
        lblIrRot4.setBounds(10, 10, 50, 14);

        pnlRot3.add(pnlIrRot3);
        pnlIrRot3.setBounds(150, 120, 70, 30);

        add(pnlRot3);
        pnlRot3.setBounds(150, -158, 227, 158);

        pnlRot13.setBackground(new java.awt.Color(43, 212, 128));
        pnlRot13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRot13.setLayout(null);

        lblRot13.setFont(new java.awt.Font("Georgia", 0, 22)); // NOI18N
        lblRot13.setForeground(new java.awt.Color(255, 255, 255));
        lblRot13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRot13.setText("ROT13");
        pnlRot13.add(lblRot13);
        lblRot13.setBounds(60, 50, 100, 50);

        pnlIrRot13.setBackground(new java.awt.Color(0, 153, 204));
        pnlIrRot13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIrRot13.setLayout(null);

        lblIrRot13.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        lblIrRot13.setForeground(new java.awt.Color(255, 255, 255));
        lblIrRot13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIrRot13.setText("Ir");
        pnlIrRot13.add(lblIrRot13);
        lblIrRot13.setBounds(10, 10, 50, 14);

        pnlRot13.add(pnlIrRot13);
        pnlIrRot13.setBounds(150, 120, 70, 30);

        add(pnlRot13);
        pnlRot13.setBounds(840, 100, 227, 158);

        jLabel1.setFont(new java.awt.Font("Georgia", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cifrado César");
        add(jLabel1);
        jLabel1.setBounds(140, 20, 550, 40);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblIrRot13;
    private javax.swing.JLabel lblIrRot4;
    private javax.swing.JLabel lblIrRot49;
    private javax.swing.JLabel lblRot13;
    private javax.swing.JPanel pnlIrRot13;
    private javax.swing.JPanel pnlIrRot3;
    private javax.swing.JPanel pnlIrRot47;
    public javax.swing.JPanel pnlRot13;
    public javax.swing.JPanel pnlRot3;
    public javax.swing.JPanel pnlRot47;
    // End of variables declaration//GEN-END:variables

    

}
