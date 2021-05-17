public class SwapPairs2 {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode end = dummyHead;
        ListNode pre = dummyHead;
        while (end.next != null) {
            for (int i=0; i<2; i++) {
                end = end.next;
                if (end == null) return dummyHead.next;
            }
            ListNode start = pre.next;
            ListNode next = end.next;
            end.next = null;
            ListNode p = null;
            ListNode node = start;
            while (node != null) {
                ListNode n = node.next;
                node.next = p;
                p = node;
                node = n;
            }
            pre.next = end;
            start.next = next;
            end = start;
            pre = start;
            start = pre.next;
        }
        return dummyHead.next;
    }
}
