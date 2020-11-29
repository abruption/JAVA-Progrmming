package clienteditor;

import org.jdesktop.beansbinding.Converter;

public class MaritalStatusConverter extends Converter<Integer, String> {

    public String convertForward(Integer arg) {
        String value = null;    // 반환 변수 선언
        switch (arg) {  
            case 0: value="Single"; break;      // 매개변수의 값이 0이면 변수에 Single 저장
            case 1: value="Married"; break;     // 매개변수의 값이 1이면 변수에 Married 저장
            case 2: value="Separated"; break;   // 매개변수의 값이 2이면 변수에 Separated 저장
            case 3: value="Divorced"; break;    // 매개변수의 값이 3이면 변수에 Divorced 저장
        }
        return value;   // 값 반환
    }

    public Integer convertReverse(String arg) {
        int value = 0;      // 반환 변수 선언
        if ("Single".equals(arg)) {             // 매개변수의 값이 Single이면 변수에 0 저장
            value = 0; 
        } else if ("Married".equals(arg)) {     // 매개변수의 값이 Married이면 변수에 1 저장
            value = 1;
        } else if ("Separated".equals(arg)) {   // 매개변수의 값이 Separated이면 변수에 2 저장
            value = 2;
        } else if ("Divorced".equals(arg)) {    // 매개변수의 값이 Divorced이면 변수에 3 저장
            value = 3;
        }
        return value;   // 값 반환
    }

}
