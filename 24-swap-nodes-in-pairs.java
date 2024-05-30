
class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode node = head;
        ListNode next = head != null && head.next != null ? head.next : head;
        ListNode prev = null;
        while (node != null) {
            if (node.next != null) {
                if (prev != null) {
                    prev.next = node.next;
                }
                prev = node;
                ListNode list = node.next.next;
                node.next.next = node;
                node.next = list;
                node = list;
            } else {
                node = null;
            }
        }
        return next;
    }
}