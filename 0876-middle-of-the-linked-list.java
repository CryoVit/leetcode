/*
@id         876
@title      Middle of the Linked List
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
class Solution {
    public ListNode middleNode(ListNode head) {
        int n = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            n++;
        }
        n >>= 1;
        tmp = head;
        for (int i = 0; i < n; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }
}

// two pointers
class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null) { // even elements will stop here
            fast = fast.next;
            if (fast == null) {
                break;
            } // odd elements will stop here
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
}
