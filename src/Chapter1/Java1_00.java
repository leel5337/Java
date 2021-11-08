package Chapter1;

public class Java1_00 {
    // 작업 파일에는 거의 하난의 class만 존재하지만 다른 class가 존재해도 된다
    // 단 public 키워드를 가진 class는 하나만 있어야된다

    int studentID; //멤버변수
    String studentName; //멤버변수
    String address; //멤버변수

    public void showStudentInfo() { // void는 반환하는 값의 데이터타입, 반환하는 값이 없을때는 void
        // 메서드 뒤 괄호 안에는 매개변수
        System.out.println();
    }

    public static void main(String[] args) {
        Java1_00 studentLee = new Java1_00();
      // 클래스     변수선언     생성의미  클래스와동일하게
        studentLee.studentName = "이삼사";
        studentLee.address = "광주";
      // 변수선언    멤버변수
    }
}
