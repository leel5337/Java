// TakeTransTest
package Chapter2;

public class Java2_16 {
    public static void main(String[] args) {
        Java2_13 studentLee = new Java2_13("Lee", 5000);
        Java2_13 studentKim = new Java2_13( "Kim", 10000);

        Java2_14 bus160 = new Java2_14(160);
        Java2_14 bus999 = new Java2_14(999);
        Java2_15 subwayGreen = new Java2_15(2);
        Java2_15 subwayBlue = new Java2_15(3);

        studentLee.takeBus(bus160);
        studentKim.takeSubway(subwayBlue);

        studentLee.showInfo();
        studentKim.showInfo();

        bus160.showBusInfo();
        bus999.showBusInfo();

        subwayBlue.showSubwayInfo();
    }
}
