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
        while (head.val == val && head != null) {
            head = head.next;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        if (curr == null)
            return null;
        while (curr != null) {
            if (curr.val != val) {
                prev = curr;
                curr = curr.next;
                continue;
            }
            curr = curr.next;
            prev.next = curr;
        }
        return head;
    }
}