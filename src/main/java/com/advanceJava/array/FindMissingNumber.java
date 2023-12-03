package com.advanceJava.array;

public class FindMissingNumber {
    public int findMissingNumber(int[] nums) {
        int average = 0;
        int actualAverage = (nums.length*(nums.length+1))/2;
        for(int i = 0; i < nums.length; i++) {
            average += nums[i];
        }
        return actualAverage - average;
    }
}
