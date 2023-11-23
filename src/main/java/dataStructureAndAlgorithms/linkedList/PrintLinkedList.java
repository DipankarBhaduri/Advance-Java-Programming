package dataStructureAndAlgorithms.linkedList;

public class PrintLinkedList {
    public void print(ListNode head) {
        ListNode curr = head;
        while(curr != null) {
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
    }

    public int count(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            curr = curr.next;
            count++;
        }
        return count;
    }
}
