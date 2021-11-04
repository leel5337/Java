package Chapter2;
// Student.java
public class Java2_06 {
    int studentID;
    String studentName;

    Java2_07 korea;
    Java2_07 math;

    public Java2_06(int id, String name) {
        studentID = id;
        studentName = name;

        korea = new Java2_07();
        math = new Java2_07();
    }

    public void setKoreaSubject(String name, int score) {
        korea.subjectName = name;
        korea.score = score;
    }

    public void setMathSubject(String name, int score) {
        math.subjectName = name;
        math.score = score;
    }

    public  void showStudentScore() {
        int total = korea.score + math.score;
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다");
    }

}
