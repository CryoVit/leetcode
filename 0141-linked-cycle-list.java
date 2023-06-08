/*
@id         141
@title      Linked List Cycle
@tag        Linked List, Two Pointers
@author     CryoVit
@date       2023/06/08
*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && slow != null) {
            fast = fast.next;
            if (fast == null) {
                return false;
            }
            fast = fast.next;
            slow = slow.next;
            if (fast == null) {
                return false;
            }
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
