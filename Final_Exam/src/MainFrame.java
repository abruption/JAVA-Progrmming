
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainFrame extends javax.swing.JFrame {

     DB_MAN DBM = new DB_MAN();              // Create DB_MAN Class Object
     String strSQL = "select * from user;";    // DB Query

    public MainFrame() {
        initComponents();
        try{
            DBM.dbOpen();               // DB Open
            DBM.dbClose();              // DB Close
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginFrame = new javax.swing.JFrame();
        LoginDialog = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblPW = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtMain = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        btnJoin = new javax.swing.JButton();
        txtPW = new javax.swing.JPasswordField();

        javax.swing.GroupLayout LoginFrameLayout = new javax.swing.GroupLayout(LoginFrame.getContentPane());
        LoginFrame.getContentPane().setLayout(LoginFrameLayout);
        LoginFrameLayout.setHorizontalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
        );
        LoginFrameLayout.setVerticalGroup(
            LoginFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("로그인에 성공하였습니다.");

        javax.swing.GroupLayout LoginDialogLayout = new javax.swing.GroupLayout(LoginDialog.getContentPane());
        LoginDialog.getContentPane().setLayout(LoginDialogLayout);
        LoginDialogLayout.setHorizontalGroup(
            LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginDialogLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );
        LoginDialogLayout.setVerticalGroup(
            LoginDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginDialogLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblID.setText("아이디");

        lblPW.setText("비밀번호");

        txtMain.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtMain.setText("로그인 화면");

        btnLogin.setText("로그인");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnJoin.setText("회원가입");
        btnJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJoinActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(txtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnJoin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPW)
                                    .addComponent(lblID))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPW)
                                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(txtMain, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPW)
                    .addComponent(txtPW, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnJoin))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJoinActionPerformed
        JoinFrame join = new JoinFrame();
        join.setVisible(true);
    }//GEN-LAST:event_btnJoinActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String id = txtID.getText();
        String password = new String(txtPW.getPassword());
        
        String id_c = null;
        String pw_c = null;
        String sql = "select * from user where Id='"+id+"'";
        
        try{
            DBM.dbOpen();
            //DBM.stat = DBM.conn.prepareStatement(sql);
            DBM.rs = DBM.stat.executeQuery(sql);
            
            if(DBM.rs.next()){
                id_c = DBM.rs.getString("Id");
                pw_c = DBM.rs.getString("Password"); 
               
            }
            if(id.equals(id_c) && password.equals(pw_c)){     
                if(id.equals("root")){
                JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
                
                RootFrame login = new RootFrame();
                login.setVisible(true);
                dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "로그인에 성공하였습니다.");
                
                    UserFrame user = new UserFrame();
                    user.setVisible(true);
                    dispose();
                }
            } else{
                JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 일치하지 않습니다.");
            }
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException :" + e.getMessage());
            JOptionPane.showMessageDialog(null, ".");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

 
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog LoginDialog;
    private javax.swing.JFrame LoginFrame;
    private javax.swing.JButton btnJoin;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPW;
    private javax.swing.JTextField txtID;
    private javax.swing.JLabel txtMain;
    private javax.swing.JPasswordField txtPW;
    // End of variables declaration//GEN-END:variables
}
