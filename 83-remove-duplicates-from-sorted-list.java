// //  Definition for singly-linked list.
// class ListNode {
//     int val;
//     ListNode next;

//     ListNode() {
//     }

//     ListNode(int val) {
//         this.val = val;
//     }

//     ListNode(int val, ListNode next) {
//         this.val = val;
//         this.next = next;
//     }
// }

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode current = head.next;
        ListNode prev = head;
        while (current != null) {
            if (prev.val == current.val) {
                while (current != null && prev.val == current.val)
                    current = current.next;
                prev.next = current;
            } else {
                prev = current;
                current = current.next;
            }
        }
        return head;
    }
}