import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromanUnsortedLinkedList {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> st = new HashSet<>();
        if (head == null) {
            return head;
        }
        ListNode cur = head;
        st.add(cur.val);
        while (cur.next != null) {
            if (!st.contains(cur.next.val)) {
                st.add(cur.next.val);
                cur = cur.next;
            } else {
                cur.next = cur.next.next;
            }
        }
        return head;
    }
}
