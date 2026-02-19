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
    public ListNode deleteMiddle(ListNode head) {

        // if list has only one node
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode previous = null;

        while (fastPointer != null && fastPointer.next != null) {
            previous = slowPointer;
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // delete middle node
        previous.next = slowPointer.next;

        return head;
    }
}
