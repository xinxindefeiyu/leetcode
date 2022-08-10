package linkedlist;


public class removeNthFromEnd19 {
    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;
        slow.next = head;
        while(fast.next != null) {
            if (n > 1) {
                fast = fast.next;
                n--;
            } else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
