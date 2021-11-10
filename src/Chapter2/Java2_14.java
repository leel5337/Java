//Bus.java
package Chapter2;

public class Java2_14 {

    int busNumber;
    int passengerCount;
    int money;

    public Java2_14(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {  /* 승객을 태우는 메서드 = 승차 메서드 */
        this.money += money;
        passengerCount++;
    }

    public  void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객은 " + passengerCount + "명 이고 수입은 " + money + "원 입니다");
    }
}
