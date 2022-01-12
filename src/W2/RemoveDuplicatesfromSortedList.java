import java.util.*;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        ListNode nxt = head.next;
        while (nxt != null) {
            if (cur.val != nxt.val) {
                cur = cur.next;
            } else {
                nxt = cur.next = nxt.next;
            }
        }
        return head;
    }
}
