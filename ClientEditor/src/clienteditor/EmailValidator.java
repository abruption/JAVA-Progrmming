package clienteditor;

import org.jdesktop.beansbinding.Validator;

public class EmailValidator extends Validator<String> {

    public Validator.Result validate(String arg) {
        if ((arg.length() < 4) || !arg.contains("@") || !arg.contains(".")) {   // 매개변수 arg의 길이가 4 미만이거나, 문자열 안에 @가 미포함되어있거나, 문자열 안에 .이 미포함되어있는 경우
            return new Result(null, "Please enter a valid email");  // 유효하지 않은 이메일이라는 문구를 발생하여 반환한다.
        }
        return null;    // 이상이 없을경우 null을 반환한다.
    }
}
