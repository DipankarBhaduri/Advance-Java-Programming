package com.advanceJava.array;

public class CheckArraySortedOrNot {
    public boolean check(int[] nums) {
        if(nums.length < 2) {
            return true;
        }
        for(int i = 1; i < nums.length; i++) {
            if(!(nums[i] >= nums[i-1])) {
                return false;
            }
        }
        return true;
    }
}
