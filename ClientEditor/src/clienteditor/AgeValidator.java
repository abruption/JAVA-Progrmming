package clienteditor;

import org.jdesktop.beansbinding.Validator;

public class AgeValidator extends Validator<Integer> {

    public Validator.Result validate(Integer arg) {        
        if ((arg < 1) || (arg > 199)) {
            return new Result(null, "Age range is 1-199");  // 나이 범위 값이 1-199 사이가 아닐경우 나이범위 안내문구 발생하여 반환한다.
        }
        
        return null;    // 나이 범위 값이 1-199 사이일 경우 null 반환
    }
}
