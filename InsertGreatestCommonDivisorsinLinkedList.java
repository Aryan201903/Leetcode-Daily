/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head.next == null)
            return head;
        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node2 != null) {
            int val = gcd(node1.val, node2.val);
            ListNode temp = new ListNode(val);
            node1.next = temp;
            temp.next = node2;

            node1 = node2;
            node2 = node2.next;
        }
        return head;
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
