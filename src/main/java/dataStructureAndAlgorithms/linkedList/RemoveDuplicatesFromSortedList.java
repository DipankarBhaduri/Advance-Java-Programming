package dataStructureAndAlgorithms.linkedList;

import java.util.HashMap;

public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(curr != null) {
            if(map.containsKey(curr.data)) {
                map.put(curr.data, 1);
            } else {
                map.put(curr.data, map.get(curr.data) + 1);
            }
            curr = curr.next;
        }
        ListNode next = new ListNode(0);
        ListNode dummy = next;
        while(head != null) {
            if(map.get(head.data) == 1) {
                ListNode node = new ListNode(head.data);
                next.next = node;
                next = next.next;
            }
            head = head.next;
        }
        return dummy.next;
    }
}
