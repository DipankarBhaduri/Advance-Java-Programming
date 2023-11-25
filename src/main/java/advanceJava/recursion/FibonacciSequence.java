package advanceJava.recursion;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = fibo(num);
        System.out.println(num+"th fibonacci number is : "+ans);
    }

    private static int fibo(int num) {
        if(num == 0 || num == 1) {
            return num;
        }

        return fibo(num - 1) + fibo(num - 2);
    }
}
