import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;




public class MainFrame extends javax.swing.JFrame {


    public MainFrame() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        lblTitle = new javax.swing.JLabel();
        lblOrder = new javax.swing.JLabel();
        lblMovie = new javax.swing.JLabel();
        lblGallery = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        txtMovie = new javax.swing.JTextField();
        txtGallery = new javax.swing.JTextField();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSorting = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jScrollPane2.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Table 예제");

        lblOrder.setText("순      위");

        lblMovie.setText("영화 제목");

        lblGallery.setText("관객 동원");

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSorting.setText("Sorting");
        btnSorting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortingActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), "로마의 휴일",  new Integer(1000000)},
                { new Integer(2), "타이타닉",  new Integer(800000)},
                { new Integer(3), "죽은 시인의 사회",  new Integer(600000)},
                { new Integer(4), "쉬리",  new Integer(400000)},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "순위", "영화 제목", "관객 동원"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblOrder)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblMovie)
                                            .addComponent(lblGallery))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtMovie)
                                            .addComponent(txtGallery))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(btnSorting))))
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOrder)
                            .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnInsert))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMovie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMovie)
                            .addComponent(btnUpdate))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblGallery)
                            .addComponent(txtGallery, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(btnSorting)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int iCntRow = 0;
        iCntRow = jTable1.getSelectedRow(); // 선택한 행 번호 반환
        
        txtOrder.setText(jTable1.getValueAt(iCntRow, 0).toString());    // 선택한 행의 순위 반환
        txtMovie.setText(jTable1.getValueAt(iCntRow, 1).toString());    // 선택한 행의 영화 제목 반환
        txtGallery.setText(jTable1.getValueAt(iCntRow, 2).toString());    // 선택한 행의 관객 동원 반환
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        int iCntRow = 0;
        
        iCntRow = jTable1.getRowCount();
        for(int idx=0; idx<jTable1.getRowCount(); idx++){     
            if(txtMovie.getText().equals(jTable1.getValueAt(idx, 1))) {    
                JOptionPane.showMessageDialog(this, "입력하신 영화 제목이 존재합니다.");    // 실습1: 동일한 데이터 삽입 제한
                return;
            }
            if(jTable1.getValueAt(idx, 0) == null) {    // 각 행의 0열 값 조사
                iCntRow = idx;
                break;
            }
             
        }
             
        jTable1.setValueAt(txtOrder.getText(), iCntRow, 0);
        jTable1.setValueAt(txtMovie.getText(), iCntRow, 1);
        jTable1.setValueAt(txtGallery.getText(), iCntRow, 2);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int iCntRow = 0;
        iCntRow = jTable1.getSelectedRow(); // 선택한 행 번호 반환
        
        jTable1.setValueAt(txtOrder.getText(), iCntRow, 0);
        jTable1.setValueAt(txtMovie.getText(), iCntRow, 1);
        jTable1.setValueAt(txtGallery.getText(), iCntRow, 2);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
       
        int iCntRow = 0;
       iCntRow = jTable1.getSelectedRow(); // 선택한 행 번호 반환
       
       for(int idx=0; idx<jTable1.getColumnCount(); idx++)
           jTable1.setValueAt(null, iCntRow, idx);
       
       txtOrder.setText(null);      // txtOrder 초기화
       txtMovie.setText(null);      // txtMovie 초기화
       txtGallery.setText(null);    // txtGallery 초기화
           
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSortingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortingActionPerformed
        /* Solution 1
        makeRowData objRowData;
        Vector myVC = new Vector();
        
        // 1. jTable1 → myVC
        for(int iRow=0; iRow<jTable1.getRowCount(); iRow++){
            if(jTable1.getValueAt(iRow, 0) != null){
                objRowData = new makeRowData();
                objRowData.strMovie = jTable1.getValueAt(iRow, 1).toString();
                objRowData.iGallery = Integer.parseInt(jTable1.getValueAt(iRow, 1).toString());
                myVC.add(objRowData);
            } else{
                break;
            }
        }
        
        // 2. Sorting
        Collections.sort(myVC, new GalleryDescCompare());
        
        // 3. myVC → jTable1
        for(int idx = 0; idx < myVC.size(); idx++){
            objRowData = (makeRowData) myVC.get(idx);
            jTable1.setValueAt(idx+1, idx, 0);
            jTable1.setValueAt(objRowData.strMovie, idx, 1);
            jTable1.setValueAt(objRowData.iGallery, idx, 2);                    
        }
        */
        
        
        //Solution 2
        TableRowSorter<TableModel> objSorter = new TableRowSorter<TableModel>(jTable1.getModel());
        jTable1.setRowSorter(objSorter);
        List<RowSorter.SortKey> SortKeys = new ArrayList<>();
        
        int columnIndexToSort = 2;
        SortKeys.add(new RowSorter.SortKey(columnIndexToSort, SortOrder.DESCENDING));
        objSorter.setSortKeys(SortKeys);
        objSorter.sort();
        
        for(int idx=0; idx < jTable1.getRowCount(); idx++){
            if(jTable1.getValueAt(idx, 0) != null)
                jTable1.setValueAt(idx+1, idx, 0);
            else
                break; 
        }            
    }//GEN-LAST:event_btnSortingActionPerformed
           
    /*        
    public class makeRowData {
        String strMovie;
        int iGallery;
    }
    
    class GalleryDescCompare implements Comparator {
        public int compare(Object arg0, Object arg1){
            if(((makeRowData)arg0).iGallery > ((makeRowData)arg1).iGallery)
                return -1;
            if(((makeRowData)arg0).iGallery == ((makeRowData)arg1).iGallery)
                return Integer.compare(((makeRowData)arg0).iGallery,((makeRowData)arg1).iGallery);
            else
                return 1;
        }
    }
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
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnSorting;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel lblGallery;
    private javax.swing.JLabel lblMovie;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtGallery;
    private javax.swing.JTextField txtMovie;
    private javax.swing.JTextField txtOrder;
    // End of variables declaration//GEN-END:variables

}
