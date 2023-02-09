/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

/**
 *
 * @author angiecarolinagomezacosta
 */
public class JFrameRegisterForm extends javax.swing.JFrame {

    /**
     * Creates new form JFrameLogin
     */
    public JFrameRegisterForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSup = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanelCen = new javax.swing.JPanel();
        jTFNombre = new javax.swing.JTextField();
        jTFApellidos = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        jTFPassword = new javax.swing.JTextField();
        jTFUsuario = new javax.swing.JTextField();

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
        jLabel4.setText("Admin");
        jPanelSup.add(jLabel4, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanelSup, java.awt.BorderLayout.PAGE_START);

        jTFNombre.setText("Nombres");
        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jTFApellidos.setText("Apellidos");
        jTFApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFApellidosActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        btnRegistrar.setText("Registrar");

        jTFPassword.setText("Contraseña");
        jTFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFPasswordActionPerformed(evt);
            }
        });

        jTFUsuario.setText("Usuario");
        jTFUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelCenLayout = new javax.swing.GroupLayout(jPanelCen);
        jPanelCen.setLayout(jPanelCenLayout);
        jPanelCenLayout.setHorizontalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCenLayout.setVerticalGroup(
            jPanelCenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCenLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanelCen, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jTFApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFApellidosActionPerformed

    private void jTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFPasswordActionPerformed

    private void jTFUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFUsuarioActionPerformed

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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanelCen;
    private javax.swing.JPanel jPanelSup;
    private javax.swing.JTextField jTFApellidos;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFPassword;
    private javax.swing.JTextField jTFUsuario;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
