package array;

public class FindMaxElement {
    public int findMax(int[] nums) {
        int maxElement = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            maxElement = Math.max(nums[i], maxElement);
        }
        return maxElement;
    }
}
