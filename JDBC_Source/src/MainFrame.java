public class MainFrame extends javax.swing.JFrame {

    DB_MAN DBM = new DB_MAN();              // Create DB_MAN Class Object
    String strSQL = "Select * From Car";    // DB Query

    public MainFrame() {
        initComponents();
        try{
            DBM.dbOpen();               // DB Open
            //getDBData(strSQL);        // Car table data -> jTextArea1
            setTableFromDB(strSQL);     // Car Table data -> jTable1
            DBM.dbClose();              // DB Close
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
    
     private void getDBData(String strQuery) {
        String strOutput = "번호\t차종\t배기량\t연비\t가격\n";
        //jTable1.append(strOutput);
        try{
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
            while(DBM.DB_rs.next()){
                strOutput = "";
                strOutput += DBM.DB_rs.getString("NO")+"\t";
                strOutput += DBM.DB_rs.getString("Type")+"\t";
                strOutput += DBM.DB_rs.getString("Displacement")+"\t";
                strOutput += DBM.DB_rs.getString("Performance")+"\t";
                strOutput += DBM.DB_rs.getString("Price")+"\n";
                //jTextArea1.append(strOutput);
            }
            DBM.DB_rs.close();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }
     
     public String makeSQLWhere(String strQuery){
         switch(cboSearch.getSelectedIndex()){
             case 0:
                 strQuery += " Where No = '" + txtNo.getText() + "'";
                 break;
             case 1:
                 strQuery += " Where Type = '" + txtCarType.getText() + "'";
                 break;
             case 2:
                 strQuery += " Where Displacement = '" + txtCC.getText() + "'";
                 break;
             case 3:
                 strQuery += " Where Performance = '" + txtKM.getText() + "'";
                 break;
             case 4:
                 strQuery += " Where Price = '" + txtPrice.getText() + "'";
                 break;
             default:
                 strQuery = "Select * From Car";
                 break;    
         }
         return strQuery;
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblNo = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        lblCarType = new javax.swing.JLabel();
        lblCC = new javax.swing.JLabel();
        lblKM = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        lblSQL = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnExecute = new javax.swing.JButton();
        txtNo = new javax.swing.JTextField();
        txtCarType = new javax.swing.JTextField();
        txtCC = new javax.swing.JTextField();
        txtKM = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        txtSQL = new javax.swing.JTextField();
        cboSearch = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("자동차 정보 관리");

        lblNo.setText("번호");

        lblSearch.setText("검색 기준");

        lblCarType.setText("배기량");

        lblCC.setText("연비");

        lblKM.setText("가격");

        lblPrice.setText("SQL문");

        lblSQL.setText("차종");

        btnSelect.setText("검 색");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnInsert.setText("추 가");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("수 정");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("삭 제");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("종료");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnExecute.setText("실행");
        btnExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExecuteActionPerformed(evt);
            }
        });

        txtSQL.setText("SELECT * FROM Car");

        cboSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "번호", "차종", "배기량", "연비", "가격" }));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "번 호", "차 종", "배기량", "연 비", "가 격"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane2.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(119, 119, 119)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCarType)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCC, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCC)
                                        .addGap(19, 19, 19)
                                        .addComponent(txtKM, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblKM)
                                        .addGap(19, 19, 19)
                                        .addComponent(txtPrice, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPrice)
                                        .addGap(8, 8, 8)
                                        .addComponent(txtSQL, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSQL)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCarType))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblNo)
                                .addGap(18, 18, 18)
                                .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete)
                            .addComponent(btnExit)
                            .addComponent(btnExecute)
                            .addComponent(btnSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDelete, btnExecute, btnExit, btnInsert, btnSelect, btnUpdate});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNo)
                        .addComponent(lblSearch)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblSQL)
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtCarType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarType)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCC)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtKM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblKM)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice)
                    .addComponent(btnExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSQL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        strSQL = "Select * From Car ";
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            while(DBM.DB_rs.next()){
                txtNo.setText(DBM.DB_rs.getString("NO"));
                txtCarType.setText(DBM.DB_rs.getString("Type"));
                txtCC.setText(DBM.DB_rs.getString("Displacement"));
                txtKM.setText(DBM.DB_rs.getString("Performance"));
                txtPrice.setText(DBM.DB_rs.getString("Price"));
            }
            DBM.DB_rs.close();
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        strSQL = "Insert Into Car Values (";
        strSQL += "'" + txtNo.getText() + "', ";
        strSQL += "'" + txtCarType.getText() + "', ";
        strSQL += "'" + txtCC.getText() + "', ";
        strSQL += "'" + txtKM.getText() + "', ";
        strSQL += "'" + txtPrice.getText() + "')";
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * From Car";
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException :" + e.getMessage());
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        strSQL = "Update Car Set ";
        strSQL += "Type = '" + txtCarType.getText() + "', ";
        strSQL += "Displacement = '" + txtCC.getText() + "', ";
        strSQL += "Performance = '" + txtKM.getText() + "', ";
        strSQL += "Price = " + txtPrice.getText();
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            strSQL = "Select * From Car";
            getDBData(strSQL);
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        strSQL = "Delete From Car";
        
        strSQL = makeSQLWhere(strSQL);
        try{
            DBM.dbOpen();
            DBM.DB_stmt.executeUpdate(strSQL);
            //getDBData(strSQL);
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

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExecuteActionPerformed
        String strData = "Select * From Car";
        strSQL = txtSQL.getText();
        strSQL = strSQL.toUpperCase();
        try{
            DBM.dbOpen();
            if(strSQL.contains("SELECT"))
                getDBData(strSQL);
            else
                DBM.DB_stmt.executeUpdate(strSQL);
            DBM.dbClose();
        } catch (Exception e){
            System.out.println("SQLExcetpion : " + e.getMessage());
        }
    }//GEN-LAST:event_btnExecuteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int iCntRow = 0;
        iCntRow = jTable1.getSelectedRow();
        
        txtNo.setText(jTable1.getValueAt(iCntRow, 0).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked

    private void setTableFromDB(String strQuery) {
       int iCntRow = 0;
       try{
           DBM.DB_rs = DBM.DB_stmt.executeQuery(strQuery);
           while(DBM.DB_rs.next()){
               jTable1.setValueAt(DBM.DB_rs.getString("No"), iCntRow, 0);
               jTable1.setValueAt(DBM.DB_rs.getString("Type"), iCntRow, 1);
               jTable1.setValueAt(DBM.DB_rs.getString("Displacement"), iCntRow, 2);
               jTable1.setValueAt(DBM.DB_rs.getString("Performance"), iCntRow, 3);
               jTable1.setValueAt(DBM.DB_rs.getString("Price"), iCntRow, 4);
               iCntRow++;
           }
           DBM.DB_rs.close();
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
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExecute;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSelect;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboSearch;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblCC;
    private javax.swing.JLabel lblCarType;
    private javax.swing.JLabel lblKM;
    private javax.swing.JLabel lblNo;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSQL;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtCarType;
    private javax.swing.JTextField txtKM;
    private javax.swing.JTextField txtNo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtSQL;
    // End of variables declaration//GEN-END:variables

   

}
