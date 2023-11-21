package topInterview150Leetcode;

import java.util.Arrays;

public class mergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] nums2 = {1, 2, 3};
        int n = 3;
        mergeShortedArray(nums1, m, nums2, n);
        Arrays.stream(nums1).forEach(System.out::print);
    }
    private static void mergeShortedArray(int[] nums1, int l1, int[] nums2, int l2) {
        int index = 0;
        while(l1 < nums1.length) {
            nums1[l1++] = nums2[index++];
        }
        Arrays.sort(nums1);
    }
}


