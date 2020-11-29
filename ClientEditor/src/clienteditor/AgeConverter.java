package clienteditor;

import org.jdesktop.beansbinding.Converter;

public class AgeConverter extends Converter<Integer, String> {

    public String convertForward(Integer arg) {
        return String.valueOf(arg);     // 매개변수 arg로 전달받은 정수값을 String으로 캐스팅 한 뒤 반환
    }

    public Integer convertReverse(String arg) {
        int value;  // 반환 변수 선언
        try {
            value = (arg == null) ? 0 : Integer.parseInt(arg);  //arg 값이 null이면 value=0, 아니면 arg 값을 정수형으로 캐스팅 한 뒤 value 변수에 저장
        } catch (NumberFormatException ex) {
            value = 0;      // 캐스팅 오류 발생 시 value 변수에 0을 저장
        }
        return value;   // value 값 반환
    }

}
