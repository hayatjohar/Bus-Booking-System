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
        getContentPane().setLayout(null);

        BttnLogin.setText("Login");
        BttnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(BttnLogin);
        BttnLogin.setBounds(102, 190, 57, 21);

        IpUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpUsernameActionPerformed(evt);
            }
        });
        getContentPane().add(IpUsername);
        IpUsername.setBounds(200, 64, 83, 19);

        LblPassword.setText("Password");
        getContentPane().add(LblPassword);
        LblPassword.setBounds(83, 136, 61, 24);

        LblUsername.setText("Username");
        getContentPane().add(LblUsername);
        LblUsername.setBounds(83, 68, 76, 22);
        getContentPane().add(IpPassword);
        IpPassword.setBounds(201, 136, 83, 19);

        BttnCreateAccount.setText("Create Account");
        BttnCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BttnCreateAccountActionPerformed(evt);
            }
        });
        getContentPane().add(BttnCreateAccount);
        BttnCreateAccount.setBounds(116, 229, 103, 21);

        LblUserLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblUserLogin.setText("User Login");
        LblUserLogin.setToolTipText("");
        LblUserLogin.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        LblUserLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LblUserLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(LblUserLogin);
        LblUserLogin.setBounds(83, 17, 200, 21);

        BttnReset.setText("Reset");
        getContentPane().add(BttnReset);
        BttnReset.setBounds(200, 190, 59, 21);

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
