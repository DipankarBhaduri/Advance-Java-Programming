package dataStructureAndAlgorithms.recursion;

public class ElementSearch {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6,7,8,99,1098,99,765,546,875,3454,67645,45634,776};
        int target = 8757;
        boolean ans = searchTarget(arr, target, 0);
        System.out.println(ans);
    }

    private static boolean searchTarget(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return false;
        }

        if (arr[index] == target) {
            return true;
        } else {
            return searchTarget(arr, target, ++index);
        }
    }
}
