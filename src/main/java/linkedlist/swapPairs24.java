package linkedlist;

public class swapPairs24 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null ) {
            return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode pre = head;
        head = head.next;
        while (odd != null && even != null) {
            odd.next = even.next;
            even.next = odd;
            pre = odd;
            odd = odd.next;
            if (odd != null) {
                even = odd.next;
                if (even != null) {
                    pre.next = even;
                }

            }
        }
        return head;


    }
}
