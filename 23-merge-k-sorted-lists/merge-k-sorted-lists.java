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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;

        // Priority Queue stores nodes, ordered by their integer value
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(a.val, b.val)
        );

        // Add the head of each list to the PQ
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (!pq.isEmpty()) {
            // Get the smallest node currently available
            ListNode smallest = pq.poll();
            tail.next = smallest;
            tail = tail.next;

            // If this list has more nodes, add the next one to the PQ
            if (smallest.next != null) {
                pq.offer(smallest.next);
            }
        }

        return dummy.next;
    }
}