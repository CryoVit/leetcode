/*
@id         206
@title      Reverse Linked List
@tag        Linked List, Two Pointers
@author     CryoVit
@date       2023/06/08
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// iterative solution
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode prev = null;
        ListNode cur = head;
        while (cur.next != null) {
            ListNode next = cur.next;
            // can't modify next.next here
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        cur.next = prev;
        return cur;
    }
}

// recursive solution
class Solution2 {
    private ListNode rev(ListNode cur, ListNode prev) {
        if (cur.next == null) {
            cur.next = prev;
            return cur;
        }
        ListNode next = cur.next;
        cur.next = prev;
        return rev(next, cur);
    }
    public ListNode reverseList(ListNode head) {
        return head == null ? null : rev(head, null);
    }
}
