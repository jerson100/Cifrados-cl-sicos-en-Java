package vista.cifradoCesar;
import java.awt.Point;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import util.JPanelModificado;
import util.JeMovedViewPort;
import util.ROT;

/**
 *
 * @author Jerson
 */
public class JDialogCifradoCesar extends javax.swing.JDialog {

    private boolean isCifrado;
    private int rot;
    private String abc;
    
    public JDialogCifradoCesar(java.awt.Frame parent, boolean modal, String texto,boolean isCifrado, int rot) {
        super(parent, modal);
        
        if(rot == 47){
            
            this.abc = ROT.ABECEDARIO47;
            
        }else{
            
            this.abc = ROT.ABECEDARIO;
            
        }
        
        this.rot = rot;
        this.isCifrado = isCifrado;
        initComponents();
        lblRot.setText("ROT "+rot);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(
                new javax.swing.border.LineBorder(
                        new java.awt.Color(0, 0, 0), 1, true), isCifrado?"Texto Cifrado":"Texto descifrado"));
        
        lblTextoIngresado.setText(texto);
        pnlTutorial.setTexto(texto,isCifrado);
        pnlTutorial.setPanelStop(pnlStop);
        pnlTutorial.iniciarAnimacion();
        setSize(840, 610);
        setLocationRelativeTo(parent);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlTutorialContainer = new JPanelModificado(){
            @Override
            public JTextArea getLabelText(){
                return lblTextoCifrado;
            }

        };
        jScrollPane2 = new javax.swing.JScrollPane();
        pnlTutorial = new vista.cifradoCesar.PanelAnimacionCifradoCesar("",pnlTutorialContainer,rot,isCifrado,abc,pnlStop);
        lblTextoSubtitle = new javax.swing.JLabel();
        lblTextoIngresado = new javax.swing.JLabel();
        pnlMoved = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblRot = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lblTextoCifrado = new javax.swing.JTextArea();
        pnlStop = new javax.swing.JPanel();
        lblStopContinue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        pnlTutorialContainer.setBackground(new java.awt.Color(255, 255, 255));
        pnlTutorialContainer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        pnlTutorialContainer.setLayout(null);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        pnlTutorial.setBackground(new java.awt.Color(255, 255, 255));
        pnlTutorial.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pnlTutorial.setLayout(null);
        jScrollPane2.setViewportView(pnlTutorial);

        pnlTutorialContainer.add(jScrollPane2);
        jScrollPane2.setBounds(40, 80, 760, 420);

        lblTextoSubtitle.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblTextoSubtitle.setText("Texto de Ingresado:");
        pnlTutorialContainer.add(lblTextoSubtitle);
        lblTextoSubtitle.setBounds(40, 40, 230, 30);

        lblTextoIngresado.setFont(new java.awt.Font("Georgia", 0, 18)); // NOI18N
        lblTextoIngresado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pnlTutorialContainer.add(lblTextoIngresado);
        lblTextoIngresado.setBounds(510, 40, 290, 30);

        pnlMoved.setBackground(new java.awt.Color(102, 102, 102));
        pnlMoved.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        pnlMoved.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pnlMovedMouseDragged(evt);
            }
        });
        pnlMoved.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlMovedMousePressed(evt);
            }
        });
        pnlMoved.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/salir.png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        pnlMoved.add(jLabel1);
        jLabel1.setBounds(800, 0, 35, 30);

        jLabel2.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText("Mostrando la animaci�n");
        pnlMoved.add(jLabel2);
        jLabel2.setBounds(40, -6, 480, 40);

        lblRot.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        lblRot.setForeground(new java.awt.Color(51, 255, 51));
        lblRot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRot.setText("ROT N");
        pnlMoved.add(lblRot);
        lblRot.setBounds(280, 0, 220, 30);

        pnlTutorialContainer.add(pnlMoved);
        pnlMoved.setBounds(0, 0, 840, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Texto cifrado"));
        jPanel1.setLayout(null);

        jScrollPane1.setEnabled(false);

        lblTextoCifrado.setBackground(new java.awt.Color(102, 102, 102));
        lblTextoCifrado.setColumns(20);
        lblTextoCifrado.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblTextoCifrado.setForeground(new java.awt.Color(0, 255, 204));
        lblTextoCifrado.setRows(5);
        lblTextoCifrado.setCaretColor(new java.awt.Color(255, 255, 0));
        lblTextoCifrado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblTextoCifrado.setFocusable(false);
        lblTextoCifrado.setMargin(new java.awt.Insets(10, 10, 10, 10));
        jScrollPane1.setViewportView(lblTextoCifrado);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 20, 460, 60);

        pnlTutorialContainer.add(jPanel1);
        jPanel1.setBounds(300, 509, 500, 90);

        pnlStop.setBackground(new java.awt.Color(255, 255, 255));
        pnlStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlStopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlStopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlStopMouseExited(evt);
            }
        });
        pnlStop.setLayout(null);

        lblStopContinue.setBackground(new java.awt.Color(0, 153, 255));
        lblStopContinue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStopContinue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/png/restart.png"))); // NOI18N
        lblStopContinue.setText("stop");
        lblStopContinue.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlStop.add(lblStopContinue);
        lblStopContinue.setBounds(0, 0, 100, 40);

        pnlTutorialContainer.add(pnlStop);
        pnlStop.setBounds(33, 510, 100, 40);

        getContentPane().add(pnlTutorialContainer);
        pnlTutorialContainer.setBounds(0, 1, 840, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Point pulsado;
    
    private void pnlMovedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMovedMousePressed
        pulsado = evt.getPoint();
    }//GEN-LAST:event_pnlMovedMousePressed

    private void pnlMovedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMovedMouseDragged
        JeMovedViewPort.moveTo(this.getLocationOnScreen(), pulsado, evt, this);
    }//GEN-LAST:event_pnlMovedMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        pnlTutorial.terminarHilo();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void pnlStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStopMouseClicked
       
        if(lblStopContinue.getText().equals("stop")){
            
            lblStopContinue.setText("continue");
            
            lblStopContinue.setIcon(new ImageIcon(getClass().getResource("/img/png/continue.png")));
            
            pnlTutorial.stop();
            
        }else{
            
            lblStopContinue.setIcon(new ImageIcon(getClass().getResource(("/img/png/stop.png"))));
            
            pnlTutorial.reanudar();
            
            lblStopContinue.setText("stop");
            
        }
        
    }//GEN-LAST:event_pnlStopMouseClicked

    private void pnlStopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStopMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlStopMouseEntered

    private void pnlStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlStopMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlStopMouseExited

    /*
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogCifradoCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogCifradoCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogCifradoCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogCifradoCesar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogCifradoCesar dialog = new JDialogCifradoCesar(new javax.swing.JFrame(), true,"Texto de prueba 315");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblRot;
    private javax.swing.JLabel lblStopContinue;
    private javax.swing.JTextArea lblTextoCifrado;
    private javax.swing.JLabel lblTextoIngresado;
    private javax.swing.JLabel lblTextoSubtitle;
    private javax.swing.JPanel pnlMoved;
    public javax.swing.JPanel pnlStop;
    /*
    private javax.swing.JPanel pnlTutorial;
    */
    private vista.cifradoCesar.PanelAnimacionCifradoCesar pnlTutorial;
    /*
    private javax.swing.JPanel pnlTutorialContainer;
    */
    private util.JPanelModificado pnlTutorialContainer;
    // End of variables declaration//GEN-END:variables
}