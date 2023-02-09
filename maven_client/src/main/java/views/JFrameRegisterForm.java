package views;

import javax.swing.JOptionPane;
import models.ClientModel;
import servicios.ClientServices;

/**
 * @author juanruiz
 * @author mafemartinez
 * @author angiecgomez
 */
public class JFrameRegisterForm extends javax.swing.JFrame {


    ClientServices clientServices = new ClientServices();
    
    /**
     * Creates new form JFrameLogin
     */
    public JFrameRegisterForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    
    private void initComponents() {

        jPanelSup = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelCen = new javax.swing.JPanel();
        jTFNombres = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        btnRegister = new javax.swing.JButton();
        jTFUser = new javax.swing.JTextField();
        jTFCorreo = new javax.swing.JTextField();
        jTFTelefono = new javax.swing.JTextField();
        jTFPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanelSup.setLayout(new java.awt.BorderLayout());

        title.setBackground(new java.awt.Color(204, 204, 204));
        title.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Register");
        title.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        title.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jPanelSup.add(title, java.awt.BorderLayout.CENTER);

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cliente");
        jPanelSup.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanelSup, java.awt.BorderLayout.PAGE_START);

        jTFNombres.setText("Nombres");
        jTFNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombresActionPerformed(evt);
            }
        });

        jTFApellidos.setText("Apellidos");
        jTFApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidosActionPerformed(evt);
            }
        });

        btnRegister.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnRegister.setText("Registrar");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });

        jTFUser.setText("Usuario");
        jTFUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUserActionPerformed(evt);
            }
        });

        jTFCorreo.setText("Correo");
        jTFCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCorreoActionPerformed(evt);
            }
        });

        jTFTelefono.setText("Teléfono");
        jTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonoActionPerformed(evt);
            }
        });

        jTFPassword.setText("Contraseña");
        jTFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCenLayout = new javax.swing.GroupLayout(jPanelCen);
        jPanelCen.setLayout(jPanelCenLayout);
        jPanelCenLayout.setHorizontalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenLayout.setVerticalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTFNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFUser, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelCen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombresActionPerformed

    private void jTFApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidosActionPerformed

    private void jTFUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUserActionPerformed

    private void jTFCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCorreoActionPerformed

    private void jTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefonoActionPerformed

    private void jTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPasswordActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {
        if(!jTFNombres.getText().isEmpty() && !jTFApellidos.getText().isEmpty() &&
        !jTFCorreo.getText().isEmpty() && !jTFPassword.getText().isEmpty() &&
        !jTFTelefono.getText().isEmpty() && !jTFUser.getText().isEmpty()){
            if(jTFUser.getText().length() > 10 && jTFUser.getText().length() < 20){
                if(jTFPassword.getText().length() > 10 && jTFApellidos.getText().length() < 20){
                    if(jTFNombres.getText().length() > 5 && jTFNombres.getText().length() < 50){
                        if(jTFApellidos.getText().length() > 5 && jTFApellidos.getText().length() < 50){
                            char num = jTFTelefono.getText().charAt(0);
                            int number = Character.getNumericValue(num);
                            if(number == 5 && jTFTelefono.getText().length() == 10){
                                ClientModel newClient = new ClientModel(
                                jTFNombres.getText(), 
                                jTFApellidos.getText(), 
                                jTFCorreo.getText(), 
                                jTFTelefono.getText(), 
                                jTFUser.getText(), 
                                jTFPassword.getText());
                                ClientModel client = clientServices.registerClient(newClient);
        
                                if(client != null){
                                    JOptionPane.showMessageDialog(this, "Registro exitoso");
                                }else{
                                    JOptionPane.showMessageDialog(this, "Error al registrarse");
                                }
                            }else{
                                JOptionPane.showMessageDialog(this, "El teléfono debe ser de 10 digitos y debe iniciar en 5");
                                jTFTelefono.setText("");
                                jTFTelefono.requestFocus();
                            }
                        }else{
                            JOptionPane.showMessageDialog(this, "El apellido debe contener entre 5 y 50 caracteres");
                            jTFApellidos.setText("");
                            jTFApellidos.requestFocus();
                        }
                    }else{
                        JOptionPane.showMessageDialog(this, "El nombre debe contener entre 5 y 50 caracteres");
                        jTFNombres.setText("");
                        jTFNombres.requestFocus();
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "El contraseña debe contener entre 10 y 20 caracteres");
                    jTFPassword.setText("");
                    jTFPassword.requestFocus();
                }
            }else{
                JOptionPane.showMessageDialog(this, "El usuario debe contener entre 10 y 20 caracteres");
                jTFUser.setText("");
                jTFUser.requestFocus();
            }

            
        }else{
            JOptionPane.showMessageDialog(this, "Complete todos los campos pls");
        }


    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameRegisterForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameRegisterForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCen;
    private javax.swing.JPanel jPanelSup;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFCorreo;
    private javax.swing.JTextField jTFNombres;
    private javax.swing.JTextField jTFPassword;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTextField jTFUser;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
