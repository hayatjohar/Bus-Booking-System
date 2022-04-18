/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package busbookingsystem;

public class UserLogin extends javax.swing.JFrame {

    /**
     * Creates new form UserLogin
     */
    public UserLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BttnLogin = new javax.swing.JButton();
        IpUsername = new javax.swing.JTextField();
        LblPassword = new javax.swing.JLabel();
        LblUsername = new javax.swing.JLabel();
        IpPassword = new javax.swing.JPasswordField();
        BttnCreateAccount = new javax.swing.JButton();
        LblUserLogin = new javax.swing.JLabel();
        BttnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BttnLogin.setText("Login");
        BttnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnLoginActionPerformed(evt);
            }
        });

        IpUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpUsernameActionPerformed(evt);
            }
        });

        LblPassword.setText("Password");

        LblUsername.setText("Username");

        BttnCreateAccount.setText("Create Account");
        BttnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnCreateAccountActionPerformed(evt);
            }
        });

        LblUserLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        LblUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblUserLogin.setText("User Login");
        LblUserLogin.setToolTipText("");
        LblUserLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LblUserLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblUserLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        BttnReset.setText("Reset");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BttnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                            .addComponent(LblUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(BttnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(IpUsername))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IpPassword)))
                .addGap(70, 70, 70))
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(BttnCreateAccount)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(LblUserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(LblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(IpUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BttnLogin)
                    .addComponent(BttnReset))
                .addGap(18, 18, 18)
                .addComponent(BttnCreateAccount)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BttnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnLoginActionPerformed
       
    }//GEN-LAST:event_BttnLoginActionPerformed

    private void IpUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IpUsernameActionPerformed

    private void BttnCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BttnCreateAccountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BttnCreateAccountActionPerformed

    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BttnCreateAccount;
    private javax.swing.JButton BttnLogin;
    private javax.swing.JButton BttnReset;
    private javax.swing.JPasswordField IpPassword;
    private javax.swing.JTextField IpUsername;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblUserLogin;
    private javax.swing.JLabel LblUsername;
    // End of variables declaration//GEN-END:variables
}
