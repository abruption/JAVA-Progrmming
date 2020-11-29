package clienteditor;

public class ClientEditor extends javax.swing.JPanel {
    private Client client = Client.createTestClient();  // 객체 호출

    public ClientEditor() {
        initComponents();
        bindingGroup.addBindingListener(new LoggingBindingListener(validationMsgLabel));
    }


    public Client getClient() {     // Getter 설정
        return client;
    }


    public void setClient(Client client) {      // Setter 설정
        Client oldClient = this.client;         // 기 입력값을 oldClient 변수에 저장
        this.client = client;                   // 매개변수를 통해 전달받은 입력 값을 현재 변수에 저장
        firePropertyChange("client", oldClient, client);    // client가 바뀌면 firePropertyChange 메소드 호출
    }


    public static void main(String args[]) {

        try {
            javax.swing.UIManager.LookAndFeelInfo[] installedLookAndFeels=javax.swing.UIManager.getInstalledLookAndFeels();     // SDK로 인스톨이 끝난 LookAndFeel 구현에 관한 정보를 포함하는 객체를 리턴하여 배열에 저장시킨다.
            for (int idx=0; idx<installedLookAndFeels.length; idx++)        // 배열의 길이만큼 반복문을 수행한다.
                if ("Nimbus".equals(installedLookAndFeels[idx].getName())) {
                    javax.swing.UIManager.setLookAndFeel(installedLookAndFeels[idx].getClassName());    // 객체의 이름 중 Nimbus와 동일한 건이 있을 경우 해당 이름으로 LookAndFeel을 설정한다.
                    break;
                }
        } catch (ClassNotFoundException ex) {   // 만약 해당 클래스가 존재하지 않을 경우 Exception을 발생시킨다.
            java.util.logging.Logger.getLogger(ClientEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     // 해당 클래스의 로그 값을 가져온다.
        } catch (InstantiationException ex) {   // 지정된 객체에 인스턴스를 생성할 수 없는 경우 해당 Exception을 발생시킨다.
            java.util.logging.Logger.getLogger(ClientEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     // 해당 클래스의 로그 값을 가져온다.
        } catch (IllegalAccessException ex) {   // 접근할 수 없는 필드나 메소드에 접근하는 경우 해당 Exception을 발생시킨다.
            java.util.logging.Logger.getLogger(ClientEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     // 해당 클래스의 로그 값을 가져온다.
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {  // 지원하는 LookAndFeel이 아닌 경우 해당 Exception을 발생시킨다.
            java.util.logging.Logger.getLogger(ClientEditor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);     // 해당 클래스의 로그 값을 가져온다.
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                javax.swing.JFrame frame = new javax.swing.JFrame("Client Editor");
                frame.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                frame.getContentPane().add(new ClientEditor());
                frame.pack();
                frame.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private clienteditor.AgeConverter ageConverter;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private clienteditor.AgeValidator ageValidator;
    private javax.swing.JLabel clientInfoLabel;
    private javax.swing.JTabbedPane clientInfoPane;
    private javax.swing.JPanel contactPanel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private clienteditor.EmailValidator emailValidator;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel imLabel;
    private javax.swing.JTextField imTextField;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JComboBox maritalComboBox;
    private clienteditor.MaritalStatusConverter maritalStatusConverter;
    private javax.swing.JLabel maritalStatusLabel;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JTextField nicknameTextField;
    private javax.swing.JPanel personalPanel;
    private clienteditor.RequiredStringValidator requiredStringValidator;
    private javax.swing.ButtonGroup sexButtonGroup;
    private javax.swing.JLabel sexLabel;
    private javax.swing.JLabel surnameLabel;
    private javax.swing.JTextField surnameTextField;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel validationMsgLabel;
    private javax.swing.JLabel webLabel;
    private javax.swing.JTextField webTextField;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    
}
