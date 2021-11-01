package Chapter1;

import java.util.Scanner;

public class Java1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;
        input = scanner.nextInt();

        while(input != 0) {
            sum += input;
            input = scanner.nextInt();
        }

        System.out.println(sum);
    }
}
