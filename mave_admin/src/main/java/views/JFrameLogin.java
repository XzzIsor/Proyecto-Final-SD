package views;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import models.Admin;
import servicios.AdminServices;

/**
 * @author juanruiz
 * @author mafemartinez
 * @author angiecarolinagomezacosta
 */
public class JFrameLogin extends javax.swing.JFrame {

    AdminServices adminServices = new AdminServices();
    ArrayList<Admin> adminList = new ArrayList<>();

    /**
     * Creates new form JFrameLogin
     */
    public JFrameLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanelSup = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelInf = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnRegister = new javax.swing.JButton();
        jPanelCen = new javax.swing.JPanel();
        jTFUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelSup.setLayout(new java.awt.BorderLayout());

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Login");
        title.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        title.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelSup.add(title, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Admin");
        jPanelSup.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanelSup, java.awt.BorderLayout.PAGE_START);

        jPanelInf.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jLabel3.setText("¿No tiene un usuario?");
        jPanelInf.add(jLabel3);

        btnRegister.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnRegister.setText("Registrarse");
        btnRegister.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        jPanelInf.add(btnRegister);

        getContentPane().add(jPanelInf, java.awt.BorderLayout.PAGE_END);

        jTFUser.setText("Usuario");
        jTFUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUserActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel1.setText("¿Olvidaste tu contraseña?");

        btnLogin.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCenLayout = new javax.swing.GroupLayout(jPanelCen);
        jPanelCen.setLayout(jPanelCenLayout);
        jPanelCenLayout.setHorizontalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenLayout.setVerticalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(33, 33, 33)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUserActionPerformed

    private void jTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        String pass = jPasswordField1.getText();
        String user = jTFUser.getText();

        if(!pass.isEmpty() && !user.isEmpty()){
                Admin objClient = adminServices.loginAdmin(user, pass);
                if(objClient != null){
                    JOptionPane.showMessageDialog(this, "Ha ingresado con éxito");
                    this.dispose();

                    JFrameMain jFrameMain = new JFrameMain();
                    jFrameMain.setVisible(true);

                }else{
                    JOptionPane.showMessageDialog(this, "No existe un cliente asociado a esas credenciales");
                }

        }else{
            JOptionPane.showMessageDialog(this, "Complete todos los campos");

        }
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        JFrameRegisterForm jFrameRegisterForm = new JFrameRegisterForm();
        jFrameRegisterForm.setVisible(true);
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCen;
    private javax.swing.JPanel jPanelInf;
    private javax.swing.JPanel jPanelSup;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTFUser;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
