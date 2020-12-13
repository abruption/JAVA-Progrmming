
public class RootFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();              // Create DB_MAN Class Object
    String strSQL = "select * from user";    // DB Query
    
    public RootFrame() {
        initComponents();
        setDefaultCloseOperation(MainFrame.EXIT_ON_CLOSE);
        try{
            DBM.dbOpen();               // DB Open
            setTableFromDB(strSQL);     // Car Table data -> jTable1
            DBM.dbClose();              // DB Close
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtGender = new javax.swing.JTextField();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        btnExecute = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        cboSearch = new javax.swing.JComboBox<>();
        txtSQL = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnSelect = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblSQL = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "아이디", "비밀번호", "이름", "성별", "이메일", "휴대전화"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        lblPhone.setText("휴대전화");

        lblEmail.setText("이메일");

        lblGender.setText("성별");

        btnExecute.setText("실행");

        lblSearch.setText("검색 기준");

        lblId.setText("아이디");

        btnDelete.setText("삭 제");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("회원정보 관리 프로그램");

        btnUpdate.setText("수 정");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        cboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "아이디", "이름", "성별", "이메일", "휴대전화" }));

        txtSQL.setText("select * from user");

        btnSelect.setText("검 색");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        lblName.setText("이름");

        lblSQL.setText("SQL문");

        lblPassword.setText("비밀번호");

        btnExit.setText("종료");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblGender)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail)
                                    .addComponent(txtGender))
                                .addGap(123, 123, 123))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblId)
                                        .addGap(37, 37, 37)
                                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPhone)
                                                .addGap(27, 27, 27))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblSQL)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPhone)
                                            .addComponent(txtSQL, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(btnExecute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(lblSearch)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblPassword)
                                            .addGap(26, 26, 26)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtName)
                                                .addComponent(txtPassword))
                                            .addGap(18, 18, 18)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblEmail)
                                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(367, 367, 367)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSearch)
                    .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhone)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSQL)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void getDBData(String strQuery) {
        String strOutput = "아이디\t비밀번호\t이름\t성별\t이메일\t휴대전화\n";
        //jTextArea1.setText(strOutput);
        try{
            DBM.rs = DBM.stat.executeQuery(strQuery);
            while(DBM.rs.next()){
                strOutput = "";
                strOutput += DBM.rs.getString("Id")+"\t";
                strOutput += DBM.rs.getString("Password")+"\t";
                strOutput += DBM.rs.getString("Name")+"\t";
                strOutput += DBM.rs.getString("Gender")+"\t";
                strOutput += DBM.rs.getString("Email")+"\t";
                strOutput += DBM.rs.getString("Phone")+"\n";
            }
            DBM.rs.close();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
    public String makeSQLWhere(String strQuery){
         switch(cboSearch.getSelectedIndex()){
             case 0:
                 strQuery += " Where Id = '" + txtId.getText() + "'";
                 break;
             case 1:
                 strQuery += " Where Name = '" + txtName.getText() + "'";
                 break;
             case 2:
                 strQuery += " Where Gender = '" + txtGender.getText() + "'";
                 break;
             case 3:
                 strQuery += " Where Email = '" + txtEmail.getText() + "'";
                 break;
             case 4:
                 strQuery += " Where Phone = '" + txtPhone.getText() + "'";
                 break;
             default:
                 strQuery = "Select * From user";
                 break;    
         }
         return strQuery;
     }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int iCntRow = 0;
        iCntRow = jTable1.getSelectedRow();

        txtId.setText(jTable1.getValueAt(iCntRow, 0).toString());
        txtPassword.setText(jTable1.getValueAt(iCntRow, 1).toString());
        txtName.setText(jTable1.getValueAt(iCntRow, 2).toString());
        txtGender.setText(jTable1.getValueAt(iCntRow, 3).toString());
        txtEmail.setText(jTable1.getValueAt(iCntRow, 4).toString());
        txtPhone.setText(jTable1.getValueAt(iCntRow, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        strSQL = "Delete From user";

        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.stat.executeUpdate(strSQL);
            getDBData(strSQL);
            for(int idx=0; idx<jTable1.getRowCount(); idx++){
                if(jTable1.getValueAt(idx, 0) == null) break;
                for(int iCol=0; iCol<jTable1.getColumnCount(); iCol++)
                jTable1.setValueAt("", idx, iCol);
            }

            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLExeption : " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        strSQL = "Select * From user ";
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.rs = DBM.stat.executeQuery(strSQL);
            while(DBM.rs.next()){
                txtId.setText(DBM.rs.getString("Id"));
                txtPassword.setText(DBM.rs.getString("Password"));
                txtName.setText(DBM.rs.getString("Name"));
                txtGender.setText(DBM.rs.getString("Gender"));
                txtEmail.setText(DBM.rs.getString("Email"));
                txtPhone.setText(DBM.rs.getString("Phone"));
            }
            DBM.rs.close();
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        strSQL = "Update user Set ";
        strSQL += "Id = '" + txtId.getText() + "', ";
        strSQL += "Password = '" + txtPassword.getText() + "', ";
        strSQL += "Name = '" + txtName.getText() + "', ";
        strSQL += "Gender = '" + txtGender.getText() + "', ";
        strSQL += "Email = '" + txtEmail.getText() + "', ";
        strSQL += "Phone = " + txtPhone.getText();
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.stat.executeUpdate(strSQL);
            strSQL = "Select * From user";
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed


    private void setTableFromDB(String strQuery) {
       int iCntRow = 0;
       try{
           DBM.rs = DBM.stat.executeQuery(strQuery);
           while(DBM.rs.next()){
               jTable1.setValueAt(DBM.rs.getString("Id"), iCntRow, 0);
               jTable1.setValueAt(DBM.rs.getString("Password"), iCntRow, 1);
               jTable1.setValueAt(DBM.rs.getString("Name"), iCntRow, 2);
               jTable1.setValueAt(DBM.rs.getString("Gender"), iCntRow, 3);
               jTable1.setValueAt(DBM.rs.getString("Email"), iCntRow, 4);
               jTable1.setValueAt(DBM.rs.getString("Phone"), iCntRow, 5);
               iCntRow++;
           }
           DBM.rs.close();
       } catch(Exception e){
           System.out.println("SQLException : " + e.getMessage());
       }
    }
    
    
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
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RootFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RootFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSQL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables
}
