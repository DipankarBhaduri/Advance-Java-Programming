package linkedList;

public class AddInLinkedList {
    public ListNode addLast(int num, ListNode head) {
        if(head == null) {
            return new ListNode(num);
        }
        ListNode curr = head;
        while(curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(num);
        return head;
    }

    public ListNode addFirst(int num, ListNode head) {
        if(head == null) {
            return new ListNode(num);
        }
        ListNode newListNode = new ListNode(num);
        newListNode.next = head;
        head = newListNode;
        return head;
    }

    public ListNode addInKthPositionFromStart(int value, int k, ListNode head) {
        if(k == 1) {
            ListNode newListNode = new ListNode(value);
            newListNode.next = head;
            head = newListNode;
            return head;
        }

        ListNode curr = head;
        ListNode prev = null;
        int counter = 1;
        while(counter != k) {
            prev = curr;
            curr = curr.next;
            counter++;
        }
        ListNode newListNode = new ListNode(value);
        prev.next = newListNode;
        newListNode.next = curr;
        return head;
    }
}
