package Chapter2;

public class Java2_03 {
    public static void main(String[] args) {
        Java2_02 studentson = new Java2_02();
        studentson.studentName = "손흥민";
        studentson.address = "런던";

        studentson.showStudentInfo();

        Java2_02 studentHwang = new Java2_02();
        studentHwang.studentName = "황희찬";
        studentHwang.address = "울브스";

        studentHwang.showStudentInfo();

        System.out.println(studentson); //참조변수 출력
        System.out.println(studentHwang); //참조변수 출력
    }
}
