package dataStructureAndAlgorithms.linkedList;

import java.util.ArrayList;
import java.util.List;

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        List<ListNode> list = new ArrayList<>();
        if(head == null || head.next == null) {
            return head;
        }
        ListNode curr = head;
        while(curr != null) {
            if(curr.next != null) {
                list.add(curr.next);
            }
            list.add(curr);
            curr = curr.next.next;
        }
        ListNode node1 = new ListNode(0);
        ListNode dummy = node1;
        for(ListNode node : list) {
            node1.next = node;
            node1 = node1.next;
        }
        node1.next = null;
        return dummy.next;
    }
}
