package Chapter2;

public class Java2_02 {

    public  int studentID;
    public String studentName;
    public String address;

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }
    public String getStudentName() {
        return studentName;
    }

    /*public static void main(String[] args) {
        Java2_02 studentPark = new Java2_02();
        studentPark.studentName = "박지성";
        studentPark.showStudentInfo();
    }*/
    //class 안에 main을 넣어 사용도 하지만 혼동되는 경우가 있어 사용을 잘 하지않는다
}
