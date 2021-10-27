package Chapter1;

public class Java1_07 {
    public static void main(String[] args) {
        char gender = 'F';

        if ( gender == 'F') {
            System.out.println("여성입니다");
        }
        else {
            System.out.println("여성이 아닙니다");
        }

        //Scanner scanner = new Scanner(System.in);
        //int age = scanner.nextInt();
        //입력을 받고 싶을 때 scanner를 사용

        int age = 9;

        int charge = 0;

        if (age < 9) {
            charge = 1000;
        }
        else if(age < 14) {
            charge = 1500;
        }
        else if (age <20) {
            charge = 2000;
        }
        else {
            charge = 2000;
        }

        System.out.println("나이 :" + age);
        System.out.println("요금 :" + charge);

    }
}
