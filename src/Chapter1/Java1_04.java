package Chapter1;

public class Java1_04 {
    public static void main(String[] args) {
        /*
        byte bNum = 10;
        int iNum = bNum;

        System.out.println(bNum);
        System.out.println(iNum);

        int iNum2 = 20;
        float fNum = iNum2;

        System.out.println(fNum);

        double dNum;
        dNum = fNum + iNum;

        System.out.println(dNum);
        */

        int i = 1000;
        byte bNum = (byte)i;
        System.out.println(bNum);

        double dNum1 = 1.2;
        float fNum = 0.9F;

        int iNum1 = (int)dNum1 + (int)fNum;
        int iNum2 = (int)(dNum1 + fNum);

        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
