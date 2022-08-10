package linkedlist;



public class getIntersectionNode07 {

    class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // List<ListNode> list = new ArrayList<>();
        // while (headA != null) {
        //     list.add(headA);
        //     headA = headA.next;
        // }
        // while (headB != null) {
        //     if (!list.contains(headB)) {
        //         headB = headB.next;
        //     } else {
        //         break;
        //     }
        // }
        // return headB;


        int lenA = 0, lenB = 0;
        ListNode headA_new = headA, headB_new = headB;
        while (headA != null) {
            lenA++;
            headA = headA.next;
        }
        while (headB != null) {
            lenB++;
            headB = headB.next;
        }
        for (int i = 0; i < Math.abs(lenB - lenA); i++) {
            if (lenA > lenB) {
                headA_new = headA_new.next;
            } else {
                headB_new = headB_new.next;
            }
        }
        for (int i = 0; i < lenA; i++) {
            if (headA_new == headB_new) {
                return headA_new;
            }
            else {
                headA_new = headA_new.next;
                headB_new = headB_new.next;
            }
        }
        return null;


    }
}