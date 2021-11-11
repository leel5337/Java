//BookArrayTest.java
package Chapter2;

public class Java2_22 {
    public static void main(String[] args) {

        Java2_21[] library = new Java2_21[5];

        library[0] = new Java2_21("동해물과0", "백두산");
        library[1] = new Java2_21("동해물과1", "백두산");
        library[2] = new Java2_21("동해물과2", "백두산");
        library[3] = new Java2_21("동해물과3", "백두산");
        library[4] = new Java2_21("동해물과4", "백두산");

        for(int i =0; i< library.length; i++) {
            System.out.println(library[i]);
            library[i].showBookInfo();
        }
    }
}
