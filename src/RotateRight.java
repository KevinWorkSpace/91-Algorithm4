public class RotateRight {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        int cnt = 0;
        ListNode n = head;
        while (n != null) {
            cnt ++;
            n = n.next;
        }
        if (k % cnt == 0) return head;
        ListNode node = head;
        for (int i=0; i<k%cnt; i++) {
            node = node.next;
        }
        ListNode pre = null;
        ListNode tmp = head;
        ListNode last = null;
        while (node != null) {
            pre = tmp;
            tmp = tmp.next;
            last = node;
            node = node.next;
        }
        last.next = head;
        pre.next = null;
        return tmp;
    }
}

class ListNode {
    int val;
    ListNode next;
}
