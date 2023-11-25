package advanceJava.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int ans = fact(number);
        System.out.println(ans);
    }

    private static int fact(int number) {
        if(number == 1 ) {
            return 1;
        }

        return  number * fact(number - 1);
    }
}
