package clienteditor;

import javax.swing.JLabel;
import org.jdesktop.beansbinding.AbstractBindingListener;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.Binding.SyncFailure;

public class LoggingBindingListener extends AbstractBindingListener {
    private JLabel outputLabel;

    LoggingBindingListener(JLabel outputLabel) {    // outputLabel 값이 null이면 Exception을 발생하여 outputLabel에 저장시킨다.
        if (outputLabel == null) throw new IllegalArgumentException();
        this.outputLabel = outputLabel;
    }

    @Override
    public void syncFailed(Binding binding, SyncFailure fail) { // 싱크에 실패하였을 경우
        String description; // 상태 표시 변수 선언
        if ((fail != null) && (fail.getType() == Binding.SyncFailureType.VALIDATION_FAILED)) {  
            // fail이 null이 아니고, fail 타입이 VALIDATION_FAILED인 경우 description 변수에 해당 오류 내용을 저장한다.
            description = fail.getValidationResult().getDescription();
        } else {    
            // 그 외의 경우 싱크 실패 문구를 저장한다.
            description = "Sync failed!";
        }
        String msg = "[" + binding.getName() + "] " + description;  // binding 항목 이름과 description 내용을 저장한다.
        System.out.println(msg);    // 메세지 출력
        outputLabel.setText(msg);   // 라벨에 메세지를 설정하여 출력
    }

    @Override
    public void synced(Binding binding) {   // 싱크에 성공하였을 경우
        String bindName = binding.getName();    // binding 항목 이름을 불러와 bindName에 저장
        String msg = "[" + bindName + "] Synced";   // [bindName] Synced 형식으로 저장
        System.out.println(msg);        // 메세지 출력
        outputLabel.setText("");    // outputLabel 초기화
    }

}
