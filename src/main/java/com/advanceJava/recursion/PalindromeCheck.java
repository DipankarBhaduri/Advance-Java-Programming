package com.advanceJava.recursion;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Boolean ans = checkPalindrome(string.toCharArray(), 0, string.length() - 1);
        System.out.println(string+" is a palindrome String : "+ans);
    }

    private static Boolean checkPalindrome(char[] charArray, int start, int end) {
        if(start >= end) {
            return true;
        }

        if(charArray[start] == charArray[end]) {
            return checkPalindrome(charArray, ++start, --end);
        } else {
            return false;
        }
    }
}
