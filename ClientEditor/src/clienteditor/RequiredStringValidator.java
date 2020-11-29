package clienteditor;

import org.jdesktop.beansbinding.Validator;

public class RequiredStringValidator extends Validator<String> {

    public Validator.Result validate(String arg) {
        if ((arg == null) || (arg.length() == 0)) {     // 입력란이 null이거나 길이가 0인 경우
            return new Validator.Result(null, "Empty value");   // Empty value라는 문구를 발생시켜 반환한다.
        }
        return null;    // 이상이 없을경우 null을 반환한다.
    }
}
