package dataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String ans = reverseString(string.toCharArray(), 0, string.length() - 1);
        System.out.println("The reverse of "+string+" is : "+ans);
    }

    private static String reverseString(char[] chars, int start, int end) {
        if(start >= end) {
            return new String(chars);
        }

        char ch = chars[start];
        chars[start] = chars[end];
        chars[end] = ch;
        return reverseString(chars, ++start, --end);
    }
}
