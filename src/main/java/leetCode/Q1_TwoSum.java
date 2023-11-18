package leetCode;

import java.util.HashMap;

public class Q1_TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int target = 11;
        int [] ans = getTwoSum(nums, target);
        System.out.println(ans[0]+" + "+ans[1]+" = "+target);
    }

    private static int[] getTwoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}
