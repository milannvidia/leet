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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        int len = 0;
        for (ListNode curr = head; curr != null; curr = curr.next) {
            len++;
        }
        // get hold of mid of linked list
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        if (len % 2 != 0)
            slow = slow.next;
        ListNode secondHlfHead = reverse(slow);
        while (head != null && secondHlfHead != null) {
            if (head.val != secondHlfHead.val)
                return false;
            head = head.next;
            secondHlfHead = secondHlfHead.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        ListNode curr = head, prev = null;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}