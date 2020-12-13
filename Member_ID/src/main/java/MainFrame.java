import java.awt.event.*;     // VK_BACK_SPACE, VK_ENTER Key 값 사용
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class MainFrame extends javax.swing.JFrame {


    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        PW = new javax.swing.JLabel();
        PW_CHECK = new javax.swing.JLabel();
        NAME = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pw = new javax.swing.JPasswordField();
        pw_check = new javax.swing.JPasswordField();
        name = new javax.swing.JTextField();
        check = new javax.swing.JButton();
        join = new javax.swing.JButton();
        MEMBER = new javax.swing.JLabel();
        member = new javax.swing.JRadioButton();
        amember = new javax.swing.JRadioButton();
        smember = new javax.swing.JRadioButton();
        CATEGORY = new javax.swing.JLabel();
        swim = new javax.swing.JCheckBox();
        game = new javax.swing.JCheckBox();
        golf = new javax.swing.JCheckBox();
        ski = new javax.swing.JCheckBox();
        book = new javax.swing.JCheckBox();
        tennis = new javax.swing.JCheckBox();
        JOB = new javax.swing.JLabel();
        PAY = new javax.swing.JLabel();
        job = new javax.swing.JComboBox<>();
        pay = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("회원가입");

        ID.setText("아이디");

        PW.setText("비밀번호");

        PW_CHECK.setText("비밀번호 확인");

        NAME.setText("성 명");

        id.setToolTipText("");

        check.setText("중복 확인");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        join.setText("회원 가입");
        join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinActionPerformed(evt);
            }
        });

        MEMBER.setText("회원 구분");

        buttonGroup1.add(member);
        member.setText("정회원");

        buttonGroup1.add(amember);
        amember.setText("준회원");

        buttonGroup1.add(smember);
        smember.setText("학생회원");

        CATEGORY.setText("관심 분야");

        swim.setText("수영");

        game.setText("게임");

        golf.setText("골프");

        ski.setText("테니스");

        book.setText("독서");

        tennis.setText("스키");

        JOB.setText("직 업");

        PAY.setText("결제 방법");

        job.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "학생", "회사원(연구 개발)", "회사원(사무직)", "회사원(마케팅)", "자영업자", "공무원", "기타" }));

        pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "현금", "카드", "포인트" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(MEMBER)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(member, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(amember, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(game, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(golf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(smember, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ski, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CATEGORY)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tennis, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(swim, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(144, 144, 144)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JOB))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(PAY)
                                .addGap(18, 18, 18)
                                .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(join))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ID)
                                    .addComponent(PW))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(id)
                                    .addComponent(pw)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PW_CHECK)
                                    .addComponent(NAME, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name)
                                    .addComponent(pw_check))))
                        .addGap(18, 18, 18)
                        .addComponent(check)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(check))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pw_check, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(PW_CHECK))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NAME)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MEMBER)
                    .addComponent(member)
                    .addComponent(amember)
                    .addComponent(smember))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CATEGORY)
                    .addComponent(swim)
                    .addComponent(game)
                    .addComponent(golf))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ski)
                    .addComponent(book)
                    .addComponent(tennis))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JOB)
                    .addComponent(job, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PAY)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(join)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
      
        
    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
   
        try{
            File f = new File("/Users/yeonguk/Downloads/OneDrive - 인하공업전문대학/인하공업전문대학/2학년 2학기/Java 프로그래밍/JavaProject/Member_ID/member.txt");
            if(f.exists() == false){
                f.createNewFile();
        } else{
            BufferedReader br = new BufferedReader(new FileReader("/Users/yeonguk/Downloads/OneDrive - 인하공업전문대학/인하공업전문대학/2학년 2학기/Java 프로그래밍/JavaProject/Member_ID/member.txt"));
            String s = null;
        
            while((s = br.readLine()) != null){
                if(s.contains(id.getText())) 
                    JOptionPane.showMessageDialog(null, "현재 사용중인 아이디입니다.");
                
                else
                    JOptionPane.showMessageDialog(null, "사용 가능한 아이디입니다.");
                
                }
            }
        }catch(Exception ex){ex.printStackTrace();}
    }//GEN-LAST:event_checkActionPerformed

    private void joinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinActionPerformed
        String password = new String(pw.getPassword());
        String password_c = new String(pw_check.getPassword());
        String Member = null;
        int Bit = 0;
              
        if(member.isSelected())
            Member = member.getText();
        else if(amember.isSelected())
            Member = amember.getText();
        else
            Member = smember.getText();
        
        if(swim.isSelected()) Bit += 2 << 4;    // 0x20
        if(game.isSelected()) Bit += 2 << 3;
        if(golf.isSelected()) Bit += 2 << 2;  
        if(ski.isSelected())  Bit += 2 >> 1;  
        if(book.isSelected()) Bit += 2 << 0;
        if(tennis.isSelected()) Bit += 2 << 1;  
        
        String Job = job.getSelectedItem().toString();
        String Pay = pay.getSelectedItem().toString();
            
        
        if(password.equals(password_c) != true)
            JOptionPane.showMessageDialog(null, "입력하신 비밀번호가 다릅니다.");
         else{    
            try{
                FileWriter fw = new FileWriter("/Users/yeonguk/Downloads/OneDrive - 인하공업전문대학/인하공업전문대학/2학년 2학기/Java 프로그래밍/JavaProject/Member_ID/member.txt", true);
                fw.write(id.getText()+" ");
                fw.write(password+" ");
                fw.write(name.getText()+" ");
                fw.write(Member+" ");
                fw.write(Bit+" ");  // 관심 분야의 bit 연산 값 저장 
                fw.write(Job+" ");
                fw.write(Pay+"\r\n");
                fw.close();
                JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.");
          } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
        }
      }
    }//GEN-LAST:event_joinActionPerformed


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
    private javax.swing.JLabel CATEGORY;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel JOB;
    private javax.swing.JLabel MEMBER;
    private javax.swing.JLabel NAME;
    private javax.swing.JLabel PAY;
    private javax.swing.JLabel PW;
    private javax.swing.JLabel PW_CHECK;
    private javax.swing.JRadioButton amember;
    private javax.swing.JCheckBox book;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton check;
    private javax.swing.JCheckBox game;
    private javax.swing.JCheckBox golf;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> job;
    private javax.swing.JButton join;
    private javax.swing.JRadioButton member;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> pay;
    private javax.swing.JPasswordField pw;
    private javax.swing.JPasswordField pw_check;
    private javax.swing.JCheckBox ski;
    private javax.swing.JRadioButton smember;
    private javax.swing.JCheckBox swim;
    private javax.swing.JCheckBox tennis;
    // End of variables declaration//GEN-END:variables
}
