package Chapter2;

public class Java2_01 {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting); //출력만하고 반환은 하지않는다
    }

    public static int calcSum() {

        int sum =0;
        int i;

        for(i = 0; i<=100; i++) {
            sum += i;
        }
        return sum;  //매개변수 필요없이 리턴만 있다
    }

    public static void main(String[] args) {

        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);

        sayHello("감사합니다");
        int num = calcSum();

        System.out.println(total);
        System.out.println(num);
    }
}
