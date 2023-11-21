package topInterview150Leetcode;

import java.util.HashMap;

public class maxPairSumInAnArray {
    public static void main(String[] args) {
        int[] nums = {51,71,17,24,42};
        Solution solution = new Solution();
        int ans = solution.maxSum(nums);
        System.out.println(ans);
    }
}


class Solution {
    public int maxSum(int[] nums) {
        int maxNumber = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            String str = String.valueOf(nums[i]);
            int num = getDigitSum(nums[i]);
            if(!map.containsKey(num)) {
                map.put(num, nums[i]);
            } else {
                int temp = nums[i] + map.get(num);
                maxNumber = temp > maxNumber ? temp : maxNumber;
            }
        }
        return maxNumber;
    }

    public static int getDigitSum(int num) {
        int ans = 0;
        while(num > 0) {
            int rem = num % 10;
            ans += rem;
            num = num / 10;
        }
        return ans;
    }
}