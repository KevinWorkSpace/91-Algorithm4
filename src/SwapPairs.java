public class SwapPairs {

    public ListNode swapPairs(ListNode head) {
        if (head == null) return head;
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode pre = dummyHead;
        ListNode node = head;
        ListNode node2 = node.next;
        while (node2 != null) {
            ListNode next = node2.next;
            pre.next = node2;
            node2.next = node;
            node.next = next;
            pre = node;
            node = next;
            if (next == null) return dummyHead.next;
            node2 = next.next;
        }
        return dummyHead.next;
    }
}
