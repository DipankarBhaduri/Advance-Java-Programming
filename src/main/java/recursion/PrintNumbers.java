package recursion;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNumber(n);
        System.out.println();
    }

    private static void printNumber(int n) {
        if(n == 0) {
            return;
        }

        printNumber(n-1);
        System.out.print(n+", ");
    }
}
