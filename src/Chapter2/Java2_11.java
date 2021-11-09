//Person.java
package Chapter2;

public class Java2_11 {

    String name;
    int age;

    public Java2_11() {
        this("이름없음", 1);
    }

    public Java2_11(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showInfo() {
        System.out.println(name + ", " + age );
    }
}
