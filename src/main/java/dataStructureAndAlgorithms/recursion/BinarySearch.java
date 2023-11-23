package dataStructureAndAlgorithms.recursion;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];
        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt();
        int index = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(target+" is find in the index of : "+index);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
        int mid = start + end;
        if(arr[mid] == target) {
            return mid;
        }

        if(arr[mid] > target) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}
