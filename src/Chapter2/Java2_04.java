package Chapter2;

public class Java2_04 {
    // 나이가 40살, 이름이 James라는 남자가 있다 이 남자는 결혼을 하였고 자식이 셋 있다
    int age;
    String name;
    Boolean isMarried;
    int numberofChildren;

    public static void main(String[] args) {

        Java2_04 person = new Java2_04();
        person.age = 40;
        person.name = "James";
        person.isMarried = true;
        person.numberofChildren = 3;

        System.out.println("나이 :" + person.age);
        System.out.println("이름 :" + person.name);
        System.out.println("결혼 여부 :" + person.isMarried);
        System.out.println("자녀 수 :" + person.numberofChildren);

    }
}
