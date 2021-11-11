//Book.java
package Chapter2;

public class Java2_21 {

    private String title;
    private String author;

    public Java2_21() {}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public  Java2_21(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void showBookInfo() {
        System.out.println(title + "," + author);
    }
}
