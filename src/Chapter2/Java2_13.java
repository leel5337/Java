// Student.java
package Chapter2;

public class Java2_13 {
    String studentName;
    int grade;
    int money;

    public Java2_13(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    public void takeBus(Java2_14 bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Java2_15 subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName + "님이 남은 돈은" + money + "원 입니다.");
    }
}
