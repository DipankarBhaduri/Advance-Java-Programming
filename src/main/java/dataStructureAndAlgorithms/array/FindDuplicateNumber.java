package dataStructureAndAlgorithms.array;

public class FindDuplicateNumber {
    public int findDuplicate(int[] nums) {
        int average = 0;
        int actualAverage = ((nums.length - 1) * nums.length/2);
        for(int i = 0; i < nums.length; i++) {
            average += nums[i];
        }
        return (average - actualAverage) + 1;
    }
}
