package recursion;

import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int power = scanner.nextInt();
        int ans = calculatePower(num, power);
        System.out.println("The "+power+"th power of "+num+" is : "+ans);
    }
    private static int calculatePower(int num, int power) {
        if (power == 0) {
            return 1;
        }

        return num * calculatePower(num, power - 1);
    }
}
