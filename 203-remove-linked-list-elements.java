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
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;
        while (head.val == val && head != null) {
            head = head.next;
            if (head == null)
                return null;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val != val) {
                prev = prev.next;
                continue;
            }
            prev.next = prev.next.next;
        }
        return head;
    }
}