//ObjectCopy2.java
package Chapter2;

public class Java2_25 {
    public static void main(String[] args) {

        Java2_21[] library = new Java2_21[5];
        Java2_21[] copyLibrary = new Java2_21[5];

        library[0] = new Java2_21("동해물과0", "백두산");
        library[1] = new Java2_21("동해물과1", "백두산");
        library[2] = new Java2_21("동해물과2", "백두산");
        library[3] = new Java2_21("동해물과3", "백두산");
        library[4] = new Java2_21("동해물과4", "백두산");

        copyLibrary[0] = new Java2_21();
        copyLibrary[1] = new Java2_21();
        copyLibrary[2] = new Java2_21();
        copyLibrary[3] = new Java2_21();
        copyLibrary[4] = new Java2_21();

        for(int i = 0; i < library.length; i++) {
            copyLibrary[i].setTitle(library[i].getTitle());
            copyLibrary[i].setAuthor(library[i].getAuthor());
        }


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
