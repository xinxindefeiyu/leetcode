package linkedlist;

public class removeElements203 {

    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {}
        ListNode(int value) { this.value = value; }
        ListNode(int value, ListNode next) { this.value = value; this.next = next; }

    }

    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode();
        ListNode pre = dummy;
        ListNode cur = head;
        dummy.next = head;
        while (cur != null) {
            if (cur.value == val) {
                pre.next = cur.next;
            } else {
                pre = pre.next;
            }
            cur = cur.next;
        }
        return dummy.next;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,6,3,4,5,6};
        int val = 6;
        ListNode head = new ListNode();
        ListNode cur = head;
        int length = nums.length;
        //head = [1,2,6,3,4,5,6]
        for (int i = 0; i < length; i++) {
            cur.value = nums[i];
            cur.next = new ListNode();
            cur = cur.next;
        }

        ListNode res = removeElements(head, val);
        while (res.next != null) {
            System.out.print(res.value + ",");
            res = res.next;
        }

    }
}
