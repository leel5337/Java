package Chapter2;
// StudentTest.java
public class Java2_08 {
    public static void main(String[] args) {

        Java2_06 studentLee = new Java2_06(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 95);

        Java2_06 studentKim = new Java2_06(101, "Kim");
        studentKim.setKoreaSubject("국어", 80);
        studentKim.setMathSubject("수학", 99);

        studentLee.showStudentScore();
        studentKim.showStudentScore();

    }
}
