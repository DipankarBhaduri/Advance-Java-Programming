package com.advanceJava.array;

public class FindSecondLargest {
    public int secondLargest(int[] nums) {
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if(val > firstLargest) {
                secondLargest = firstLargest;
                firstLargest = val;
            } else if (val > secondLargest) {
                secondLargest = val;
            }
        }
        return secondLargest;
    }
}
