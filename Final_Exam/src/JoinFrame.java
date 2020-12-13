
import javax.swing.JOptionPane;


public class JoinFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();              // Create DB_MAN Class Object
    String strSQL = "select * from user;";    // DB Query
     
    public JoinFrame() {
        initComponents();
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
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

        female = new javax.swing.JRadioButton();
        male = new javax.swing.JRadioButton();
        lblsex = new javax.swing.JLabel();
        lblpww = new javax.swing.JLabel();
        lblpw = new javax.swing.JLabel();
        btnjoin = new javax.swing.JButton();
        txtpww = new javax.swing.JPasswordField();
        btnduplication = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        txtemail = new javax.swing.JTextField();
        txtphone = new javax.swing.JTextField();
        txtpw = new javax.swing.JPasswordField();
        lblemail = new javax.swing.JLabel();
        lblphone = new javax.swing.JLabel();
        lbljoin = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        female.setText("여자");

        male.setText("남자");

        lblsex.setText("성별");

        lblpww.setText("비밀번호 재입력");

        lblpw.setText("비밀번호");

        btnjoin.setText("회원가입");
        btnjoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjoinActionPerformed(evt);
            }
        });

        btnduplication.setText("중복 확인");
        btnduplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnduplicationActionPerformed(evt);
            }
        });

        lblid.setText("아이디");

        lblemail.setText("이메일");

        lblphone.setText("휴대전화");

        lbljoin.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lbljoin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbljoin.setText("회원가입");

        lblname.setText("이름");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblphone)
                            .addComponent(lblpw)
                            .addComponent(lblsex)
                            .addComponent(lblname)
                            .addComponent(lblpww)
                            .addComponent(lblid)
                            .addComponent(lblemail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(male, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(female))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtpw, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(txtpww, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtid))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnduplication))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtemail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                    .addComponent(txtphone, javax.swing.GroupLayout.Alignment.LEADING)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lbljoin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnjoin, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(146, 146, 146))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbljoin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblid)
                    .addComponent(btnduplication))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpw)
                    .addComponent(txtpw, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblpww)
                    .addComponent(txtpww, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblname)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblsex)
                    .addComponent(female)
                    .addComponent(male))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblemail)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblphone)
                    .addComponent(txtphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnjoin)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjoinActionPerformed
        String strSQL = "insert into user values (";
        String password = new String(txtpw.getPassword());
        String password_c = new String(txtpww.getPassword());

        try{
            if(txtid.getText().equals(null) || password.equals(null) || txtname.getText().equals(null) || txtemail.getText().equals(null) || txtphone.getText().equals(null)){
                JOptionPane.showMessageDialog(null, "입력하지 않은 정보가 존재합니다.");
            }

            if(password.equals(password_c)){
                strSQL += "'" + txtid.getText() + "', ";
                strSQL += "'" + password + "', ";
                strSQL += "'" + txtname.getText() + "', ";
                if(male.isSelected())
                    strSQL += "'" + male.getText() + "', ";
                else
                    strSQL += "'" + female.getText() + "', ";
                strSQL += "'" + txtemail.getText() + "', ";
                strSQL += "'" + txtphone.getText() + "')";
                
                JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
                dispose();
            } else{
                JOptionPane.showMessageDialog(null, "입력하신 비밀번호가 일치하지 않습니다.");
            }
            DBM.dbOpen();
            DBM.stat.executeUpdate(strSQL);
            strSQL = "Select * From user";            
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException :" + e.getMessage());
        }
    }//GEN-LAST:event_btnjoinActionPerformed

    private void btnduplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnduplicationActionPerformed
        String id = txtid.getText();
        String sql = "select * from user where Id='"+id+"'";
        String id_c = null;

        try{
            DBM.dbOpen();
            DBM.rs = DBM.stat.executeQuery(sql);

            if(DBM.rs.next()){
                id_c = DBM.rs.getString("Id");
            }

            if(id.equals(id_c))
            JOptionPane.showMessageDialog(null, "현재 사용중인 아이디입니다.");
            else
            JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException :" + e.getMessage());
        }
    }//GEN-LAST:event_btnduplicationActionPerformed

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
            java.util.logging.Logger.getLogger(JoinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JoinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JoinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JoinFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JoinFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnduplication;
    private javax.swing.JButton btnjoin;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel lblemail;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lbljoin;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblphone;
    private javax.swing.JLabel lblpw;
    private javax.swing.JLabel lblpww;
    private javax.swing.JLabel lblsex;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtphone;
    private javax.swing.JPasswordField txtpw;
    private javax.swing.JPasswordField txtpww;
    // End of variables declaration//GEN-END:variables
}
