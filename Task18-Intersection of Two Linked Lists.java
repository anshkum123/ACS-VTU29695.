public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            // When a reaches the end, switch to list B
            if (a == null) {
                a = headB;
            } else {
                a = a.next;
            }

            // When b reaches the end, switch to list A
            if (b == null) {
                b = headA;
            } else {
                b = b.next;
            }
        }

        return a;
    }
}