/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        int lengthA = 0;
        int lengthB = 0;
        ListNode currA = headA;
        ListNode currB = headB;
        while (true) {
            if (currA.next == null && currB.next == null) {
                if (currA != currB)
                    return null;
                break;
            }
            if (currA.next != null) {
                currA = currA.next;
                lengthA++;
            }
            if (currB.next != null) {
                currB = currB.next;
                lengthB++;
            }
        }
        currA = headA;
        currB = headB;
        if (lengthA > lengthB) {
            for (int i = 0; i < lengthA - lengthB; i++) {
                currA = currA.next;
            }
        } else {
            for (int i = 0; i < lengthB - lengthA; i++) {
                currB = currB.next;
            }
        }
        while (true) {
            if (currA == currB)
                return currA;
            else {
                currA = currA.next;
                currB = currB.next;
            }
        }
    }
}