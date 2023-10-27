package linkedList;

public class Main {
    public static void main(String[] args) {
        SwapNodesInPairs swapNodesInPairs = new SwapNodesInPairs();
        AddInLinkedList addInLinkedList = new AddInLinkedList();
        int [] nums = {2, 3, 4, 5, 6, 7};
        ListNode root = null;
        for(int i = 0; i < nums.length; i++) {
            root = addInLinkedList.addLast(nums[i], root);
        }
        PrintLinkedList printLinkedList = new PrintLinkedList();
        printLinkedList.print(root);
        root = swapNodesInPairs.swapPairs(root);
        printLinkedList.print(root);
    }
}
