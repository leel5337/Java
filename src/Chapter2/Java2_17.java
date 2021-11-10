// Student.java
package Chapter2;

public class Java2_17 {

    public static int serialNum = 1000; // 계속 증가
    private int studentID; // 증가된 값 하나만ㄴ
    public String studentName;
    public String address;

    public  Java2_17(String name) {
        studentName = name;
        serialNum++;
        studentID = serialNum;
    }

    public Java2_17(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소 없음";
        serialNum++;
        studentID = serialNum;
    }

    public  void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }
}
