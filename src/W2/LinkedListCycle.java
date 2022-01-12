import java.util.HashSet;
import java.util.Set;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        int NON = 999999;
        ListNode node = head;
        while (node != null && node.val != NON) {
            node.val = NON;
            node = node.next;
        }
        return node != null;
    }
}
