package com.advanceJava.recursion;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int ans = sumOfDigit(num);
        System.out.println("The sum of "+num+"'s all Digit is : "+ans);
    }

    private static int sumOfDigit(int num) {
        if (num < 10) {
            return num;
        }

        return num % 10 + sumOfDigit(num/ 10);
    }
}
