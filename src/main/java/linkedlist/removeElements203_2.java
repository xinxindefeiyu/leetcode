package linkedlist;

public class removeElements203_2 {

    public static class ListNode {
        int value;
        ListNode next;

        ListNode() {}
        ListNode(int value) { this.value = value; }
        ListNode(int value, ListNode next) { this.value = value; this.next = next; }

    }

    public static ListNode removeElements(ListNode head, int val) {
       while (head != null && head.value == val) {
           head = head.next;
       }
       if (head == null) {
           return head;
       }
       ListNode curr = head;
       while (curr.next != null) {
           if (curr.next.value == val) {
               curr.next = curr.next.next;
           } else {
               curr = curr.next;
           }
       }
       return head;

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
