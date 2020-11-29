package clienteditor;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Client {

    // 변수 설정
    private String firstName;
    private String surname;
    private String nickname;
    private int age;
    private int sex;
    private String email;
    private String web;
    private String im;
    // 변수 설정 완료
    
    // 멤버변수로 PropertyChangeSupport changeSupport를 선언 후 해당 클래스는 집어넣는다.
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    // PropertyChangeSupport.addPropertyChangeListener 매핑
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }
    // PropertyChangeSupport.removePropertyChangeListener 매핑
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }    

    // Getter, Setter 설정
    public String getFirstName() {  
        return firstName;
    }
    
    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }
    
    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getWeb() {
        return web;
    }

    public String getIm() {
        return im;
    }

    public int getSex() {
        return sex;
    }
    
    public int getMaritalStatus() {
        return maritalStatus;
    }
    // Getter, Setter 설정 완료

    public void setfireName(String firstName) {                                
        String oldFirstName = this.firstName;                                   // 현재 입력 값을 oldFirstName 변수에 저장
        this.firstName = firstName;                                             // 입력된 firstName을 현재 firstName에 저장
        changeSupport.firePropertyChange("firstName", oldFirstName, firstName); // firstName이 바뀌면 fireProperyChange 메소드를 호출한다.
    }
    
    public void setSurname(String surname) {
        String oldSurname = this.surname;                                       // 현재 입력 값을 oldSurName 변수에 저장
        this.surname = surname;                                                 // 입력된 surname을 현재 surname에 저장
        changeSupport.firePropertyChange("surname", oldSurname, surname);       // surname이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setNickname(String nickname) {
        String oldNickname = this.nickname;                                     // 현재 입력 값을 oldNickname 변수에 저장
        this.nickname = nickname;                                               // 입력된 nickname을 현재 nickname에 저장
        changeSupport.firePropertyChange("nickname", oldNickname, nickname);    // nickname이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setAge(int age) {                                               
        int oldAge = this.age;                                                  // 현재 입력 값을 oldAge 변수에 저장
        this.age = age;                                                         // 입력된 age을 현재 agee에 저장
        changeSupport.firePropertyChange("age", oldAge, age);                   // age이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setEmail(String email) {
        String oldEmail = this.email;                                           // 현재 입력 값을 oldEmail 변수에 저장
        this.email = email;                                                     // 입력된 email을 현재 email에 저장
        changeSupport.firePropertyChange("email", oldEmail, email);             // email이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setWeb(String web) {
        String oldWeb = this.web;                                               // 현재 입력 값을 oldWeb 변수에 저장
        this.web = web;                                                         // 입력된 web을 현재 web애 저장
        changeSupport.firePropertyChange("web", oldWeb, web);                   // web이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setIm(String im) {
        String oldIm = this.im;                                                 // 현재 입력 값을 oldIm 변수에 저장
        this.im = im;                                                           // 입력된 im을 현재 im에 저장
        changeSupport.firePropertyChange("im", oldIm, im);                      // im이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    public void setSex(int sex) {
        int oldSex = this.sex;                                                  // 현재 입력 값을 oldSex 변수에 저장
        this.sex = sex;                                                         // 입력된 sex를 현재 sex에 저장
        changeSupport.firePropertyChange("sex", oldSex, sex);                   // sex이 바뀌면 fireProperyChange 메소드를 호출한다.
    }
    
    public void setMaritalStatus(int maritalStatus) {
        int oldMaritalStatus = this.maritalStatus;                                              // 현재 입력 값을 oldMaritalStatus 변수에 저장
        this.maritalStatus = maritalStatus;                                                     // 입력된 maritalStatus를 현재 maritalStatus에 저장
        changeSupport.firePropertyChange("maritalStatus", oldMaritalStatus, maritalStatus);     // maritalStatus이 바뀌면 fireProperyChange 메소드를 호출한다.
    }

    
    public static Client createTestClient() {
        Client client = new Client();                       // 객체 생성
        client.setFirstName("George");                      // FirstName 객세 초기값 설정
        client.setSurname("Foo");                           // Surname 객체 초기값 설정
        client.setNickname("Juraj");                        // Nickname 객체 초기값 설정
        client.setAge(30);                                  // Age 객체 초기값 설정
        
        client.setEmail("g.foo@foo.org");                   // Email 객체 초기값 설정
        client.setWeb("https://beansbinding.dev.java.net"); // Web 객체 초기값 설정
        client.setIm("ICQ: 53 25 89 76");                   // Im 객체 초기값 설정
        
        client.setSex(1);                                   // Sex 객체 초기값 설정
        client.setMaritalStatus(2);                         // MaritalStatus 객체 초기값 설정

        return client;                                      // 객체 반환
    }
}
