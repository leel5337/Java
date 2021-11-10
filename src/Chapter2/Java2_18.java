// StudentTest.java
package Chapter2;

public class Java2_18 {
    public static void main(String[] args) {

        Java2_17 studentLee = new Java2_17("lee");
        System.out.println(studentLee.serialNum);

        Java2_17 studentKim = new Java2_17("kim");
        System.out.println(studentKim.serialNum);
        System.out.println(studentLee.serialNum);

        System.out.println(studentLee.getStudentID());
        System.out.println(studentKim.getStudentID());
    }
}
