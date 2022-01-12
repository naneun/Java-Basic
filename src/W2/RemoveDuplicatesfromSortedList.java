import java.util.*;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode prv = head;
        ListNode cur = head.next;
        while (cur != null) {
            if (prv.val == cur.val) {
                prv.next = cur.next;
            } else {
                prv = prv.next;
            }
            cur = cur.next;
        }
        return head;
    }
}
