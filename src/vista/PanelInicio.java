package vista;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Jerson
 */
public class PanelInicio extends javax.swing.JPanel {

    public JPanel parent;
    public Thread hilo;
    public boolean estado = true;
    
    public PanelInicio(JPanel parent,long sleep) {
        initComponents();
        this.parent = parent;
    }

    public void eliminarHilo(){
        hilo = null;
        estado = false;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblIntegrante4 = new javax.swing.JLabel();
        lblIntegrante5 = new javax.swing.JLabel();
        lblIntegrante3 = new javax.swing.JLabel();
        lblIntegrante2 = new javax.swing.JLabel();
        lblIntegrante1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel15.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 255, 204));
        jLabel15.setText("Integrantes:");
        add(jLabel15);
        jLabel15.setBounds(180, 70, 250, 50);

        jLabel16.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 255, 204));
        jLabel16.setText("Escuela:");
        add(jLabel16);
        jLabel16.setBounds(180, 320, 210, 60);

        jLabel17.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 255, 51));
        jLabel17.setText("Ingeniería Informática");
        add(jLabel17);
        jLabel17.setBounds(180, 400, 290, 40);

        lblIntegrante4.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblIntegrante4.setForeground(new java.awt.Color(102, 255, 102));
        add(lblIntegrante4);
        lblIntegrante4.setBounds(180, 250, 420, 23);

        lblIntegrante5.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblIntegrante5.setForeground(new java.awt.Color(102, 255, 102));
        add(lblIntegrante5);
        lblIntegrante5.setBounds(180, 290, 420, 23);

        lblIntegrante3.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblIntegrante3.setForeground(new java.awt.Color(102, 255, 102));
        add(lblIntegrante3);
        lblIntegrante3.setBounds(180, 210, 420, 23);

        lblIntegrante2.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblIntegrante2.setForeground(new java.awt.Color(102, 255, 102));
        add(lblIntegrante2);
        lblIntegrante2.setBounds(180, 170, 420, 23);

        lblIntegrante1.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        lblIntegrante1.setForeground(new java.awt.Color(102, 255, 102));
        add(lblIntegrante1);
        lblIntegrante1.setBounds(180, 130, 420, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/portada2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(0, 0, 840, 520);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    public javax.swing.JLabel lblIntegrante1;
    public javax.swing.JLabel lblIntegrante2;
    public javax.swing.JLabel lblIntegrante3;
    public javax.swing.JLabel lblIntegrante4;
    public javax.swing.JLabel lblIntegrante5;
    // End of variables declaration//GEN-END:variables
}
