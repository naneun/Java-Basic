import java.util.*;

public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        Set<Integer> st = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            if (!st.contains(node.val)) {
                list.add(node.val);
                st.add(node.val);
            }
            node = node.next;
        }
        int len = list.size();
        if (len == 0) {
            return null;
        }
        ListNode[] nodes = new ListNode[len];
        for (int idx = 0; idx < len; ++idx) {
            nodes[idx] = new ListNode(list.get(idx));
            if (idx > 0) {
                nodes[idx - 1].next = nodes[idx];
            }
        }
        return nodes[0];
    }
}
