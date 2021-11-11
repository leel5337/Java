//ObjectCopy.java
package Chapter2;

public class Java2_24 {
    public static void main(String[] args) {

        Java2_21[] library = new Java2_21[5];
        Java2_21[] copyLibrary = new Java2_21[5];

        library[0] = new Java2_21("동해물과0", "백두산");
        library[1] = new Java2_21("동해물과1", "백두산");
        library[2] = new Java2_21("동해물과2", "백두산");
        library[3] = new Java2_21("동해물과3", "백두산");
        library[4] = new Java2_21("동해물과4", "백두산");

        System.arraycopy(library, 0, copyLibrary, 0, 5);

        //향상된 for문 type선언 : 변수선언(copyLibrary 전체를 돌며 꺼내올때마다 book변수에 집어넣는다) */
        /*for(Java2_21 book : copyLibrary) {
            book.showBookInfo();
        }*/


        library[0].setTitle("나무");
        library[0].setAuthor("박완서");

        for( Java2_21 book : library) {
            book.showBookInfo();
        }

        System.out.println("--------------");

        for( Java2_21 book : copyLibrary) {
            book.showBookInfo();
        }
    }
}
