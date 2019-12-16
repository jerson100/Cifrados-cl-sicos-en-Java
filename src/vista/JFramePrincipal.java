package vista;

import Configuracion.ColorApp;
import Configuracion.Fuente;
import controlador.ControladorPanelInicio;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jerson
 */

/*
        
    Se mejorarÃ¡ la lÃ³gica cuando pasemos al patrÃ³n MVC
    :-)
            
*/
public class JFramePrincipal extends JFrame{
    
    public JPanel pnlLogo;
    private JLabel jlblLogo;
    public JPanel pnlInicio;
    public JLabel jLabelInicio;
    public PanelInicio pnlInicioContainer;

    public JFramePrincipal() {
        init();
    }
    
    private void init() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenuLateral = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlSalir = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        
        pnlMenuPrincipalHover = new javax.swing.JPanel();
        pnlCifradoAscci = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnlCifradoCesar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        pnlCifradoPlybios = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        pnlCifradoAtbash = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCifradoVignere = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pnlCifradoPlayFair = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pnlCifradoEscitala = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ControladorPanelInicio controlPanelInicio = new ControladorPanelInicio();
        pnlInicioContainer = controlPanelInicio.open(pnlPrincipal, 0);
        jLabel15 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblIntegrante1 = new javax.swing.JLabel();
        lblIntegrante2 = new javax.swing.JLabel();
        lblIntegrante3 = new javax.swing.JLabel();
        lblIntegrante4 = new javax.swing.JLabel();
        lblIntegrante5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pnlLogo = new JPanel();
        jlblLogo = new javax.swing.JLabel();
        pnlInicio = new JPanel();
        jLabelInicio = new JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jPanel1.setLayout(null);
       
        pnlMenuLateral.setBackground(new java.awt.Color(204, 204, 204));
        pnlMenuLateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlMenuLateral.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pnlMenuLateral.setLayout(null);
        pnlMenuLateral.setBounds(5, 5, 75, 542);
        jPanel1.add(pnlMenuLateral);

        pnlMenu.setBackground(new java.awt.Color(17, 146, 238));
        pnlMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMenu.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(17, 146, 238));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/menu.png"))); // NOI18N
        jLabel1.setToolTipText("Menú");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlMenu.add(jLabel1);
        jLabel1.setBounds(0, 0, 65, 49);

        pnlLogo.setBackground(new java.awt.Color(204,204,204));
        pnlLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlLogo.setLayout(null);
        pnlLogo.setBounds(4, 488, 65, 49);
        
        jlblLogo.setBackground(new java.awt.Color(17, 146, 238));
        jlblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/unjfsc2.png"))); // NOI18N
        jlblLogo.setToolTipText("UNJFSC");
        jlblLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        pnlLogo.add(jlblLogo);
        jlblLogo.setBounds(0, 0, 65, 49);
        
        pnlMenuLateral.add(pnlLogo);
        
        pnlMenuLateral.add(pnlMenu);
        pnlMenu.setBounds(5, 5, 65, 49);
        
        pnlInicio.setBackground(new java.awt.Color(17, 146, 238));
        pnlInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlInicio.setLayout(null);

        jLabelInicio.setBackground(new java.awt.Color(17, 146, 238));
        jLabelInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/home.png"))); // NOI18N
        jLabelInicio.setToolTipText("Inicio");
        jLabelInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlInicio.add(jLabelInicio);
        jLabelInicio.setBounds(1, 1, 65, 49);
        
        pnlMenuLateral.add(pnlInicio);
        pnlInicio.setBounds(5, 59, 65, 49);
        
        
        pnlSalir.setBackground(new java.awt.Color(17, 146, 238));
        pnlSalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlSalir.setLayout(null);

        jLabel7.setBackground(new java.awt.Color(17, 146, 238));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/salir.png"))); // NOI18N
        jLabel7.setToolTipText("Salir");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalir.add(jLabel7);
        jLabel7.setBounds(1, 1, 65, 49);
        
        pnlMenuLateral.add(pnlSalir);
        pnlSalir.setBounds(5, 113, 65, 49);
        
        pnlPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnlPrincipal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        pnlPrincipal.setLayout(null);
        pnlPrincipal.setBounds(79, 5, 862, 542);

        pnlMenuPrincipalHover.setBackground(new java.awt.Color(102, 102, 102));
        pnlMenuPrincipalHover.setRequestFocusEnabled(false);
        pnlMenuPrincipalHover.setLayout(null);
        pnlMenuPrincipalHover.setBounds(-125, 0, 125, 542);

        pnlCifradoAscci.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoAscci.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoAscci.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoAscci.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(51, 204, 255));
        jLabel2.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cifrado Ascci");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoAscci.add(jLabel2);
        jLabel2.setBounds(0, 10, 115, 20);

        pnlCifradoAscci.add(jLabel2);
        
        pnlMenuPrincipalHover.add(pnlCifradoAscci);
        pnlCifradoAscci.setBounds(4, 100, 115, 40);

        pnlCifradoCesar.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoCesar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoCesar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoCesar.setLayout(null);

        jLabel8.setBackground(new java.awt.Color(51, 204, 255));
        jLabel8.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Cifrado César");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoCesar.add(jLabel8);
        jLabel8.setBounds(0, 10, 115, 20);
        
        pnlMenuPrincipalHover.add(pnlCifradoCesar);
        pnlCifradoCesar.setBounds(4, 160, 115, 40);

        pnlCifradoPlybios.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoPlybios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoPlybios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoPlybios.setLayout(null);

        jLabel9.setBackground(new java.awt.Color(51, 204, 255));
        jLabel9.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Cifrado Polibyos");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoPlybios.add(jLabel9);
        jLabel9.setBounds(0, 10, 115, 20);

        pnlMenuPrincipalHover.add(pnlCifradoPlybios);
        pnlCifradoPlybios.setBounds(4, 220, 115, 40);

        pnlCifradoAtbash.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoAtbash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoAtbash.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoAtbash.setLayout(null);

        jLabel10.setBackground(new java.awt.Color(51, 204, 255));
        jLabel10.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Cifrado Atbash");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoAtbash.add(jLabel10);
        jLabel10.setBounds(0, 10, 115, 20);
        
        pnlMenuPrincipalHover.add(pnlCifradoAtbash);
        pnlCifradoAtbash.setBounds(4, 280, 115, 40);

        pnlCifradoVignere.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoVignere.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoVignere.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoVignere.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(51, 204, 255));
        jLabel11.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cifrado Vigneré");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        pnlCifradoVignere.setLayout(null);
        
        pnlCifradoVignere.add(jLabel11);
        jLabel11.setBounds(0, 10, 115, 20);

        pnlMenuPrincipalHover.add(pnlCifradoVignere);
        pnlCifradoVignere.setBounds(4, 340, 115, 40);

        pnlCifradoPlayFair.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoPlayFair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoPlayFair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoPlayFair.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(51, 204, 255));
        jLabel12.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Cifrado PlayFair");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.setBounds(0, 10, 115, 20);
        
        pnlCifradoPlayFair.add(jLabel12);

        pnlMenuPrincipalHover.add(pnlCifradoPlayFair);
        pnlCifradoPlayFair.setBounds(4, 400, 115, 40);

        pnlCifradoEscitala.setBackground(new java.awt.Color(17, 146, 238));
        pnlCifradoEscitala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlCifradoEscitala.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlCifradoEscitala.setLayout(null);

        jLabel13.setBackground(new java.awt.Color(51, 204, 255));
        jLabel13.setFont(new java.awt.Font("Georgia", 0, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Cifrado Scitala");
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        pnlCifradoEscitala.add(jLabel13);
        jLabel13.setBounds(0, 10, 115, 20);

        pnlMenuPrincipalHover.add(pnlCifradoEscitala);
        pnlCifradoEscitala.setBounds(4, 460, 115, 40);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("CIFRADOS");
        pnlMenuPrincipalHover.add(jLabel14);
        jLabel14.setBounds(10, 35, 100, 20);

        pnlInicioContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlInicioContainer.setLayout(null);
        
        pnlPrincipal.add(pnlMenuPrincipalHover);

        pnlPrincipal.add(pnlInicioContainer);
        
        pnlInicioContainer.setBounds(10, 10, 840, 520);
        
        jPanel1.setBounds(0, 0, 946, 552);
        
        jPanel1.add(pnlPrincipal);
        
        this.add(jPanel1);
        
        pnlPrincipal.setBackground(ColorApp.COLOR_ROJO_SUAVE);
        
        JLabel lblVersion = new JLabel("v1.0.1");
        
        lblVersion.setBounds(6, 455, 100, 20);
        lblVersion.setForeground(ColorApp.COLOR_ROJO_SUAVE);
        lblVersion.setFont(Fuente.GEORGIA_TITLE_BOLD);
        pnlMenuLateral.add(lblVersion);
        

    }// </editor-fold>                                                                 
    /*
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        
        java.awt.EventQueue.invokeLater(() -> {
            new JFramePrincipal().setVisible(true);
        });
    }
*/
    // Variables declaration - do not modify                     
    public javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    public javax.swing.JPanel pnlSalir;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblIntegrante1;
    private javax.swing.JLabel lblIntegrante2;
    private javax.swing.JLabel lblIntegrante3;
    private javax.swing.JLabel lblIntegrante4;
    private javax.swing.JLabel lblIntegrante5;
    public javax.swing.JPanel pnlCifradoAscci;
    public javax.swing.JPanel pnlCifradoCesar;
    public javax.swing.JPanel pnlCifradoPlybios;
    public javax.swing.JPanel pnlCifradoAtbash;
    public javax.swing.JPanel pnlCifradoVignere;
    public javax.swing.JPanel pnlCifradoPlayFair;
    public javax.swing.JPanel pnlCifradoEscitala;
    public javax.swing.JPanel pnlMenuLateral;
    public javax.swing.JPanel pnlMenuPrincipalHover;
    public javax.swing.JPanel pnlPrincipal;
    
}
