/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    /**
     * @param head a ListNode
     * @oaram v1 an integer
     * @param v2 an integer
     * @return a new head of singly-linked list
     */
    public ListNode swapNodes(ListNode head, int v1, int v2) {
        if (head == null) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode v1Prev = null, v2Prev = null;
        ListNode current = dummy;
        boolean found = false;
        while (current.next != null) {
            if (current.next.val == v1) {
                v1Prev = current;
            }
            if (current.next.val == v2) {
                v2Prev = current;
            }
            if (v1Prev != null && v2Prev != null) {
                found = true;
                break;
            } else {
                current = current.next;
            }
        }
        
        if (found && v1Prev != v2Prev) {
            if (v2Prev.next == v1Prev) {
                ListNode tmp = v1Prev;
                v1Prev = v2Prev;
                v2Prev = tmp;
            }
            
            
            ListNode node1 = v1Prev.next;
            ListNode node2 = v2Prev.next;
            ListNode node2Next = node2.next;
            if (v1Prev.next == v2Prev) {
                v1Prev.next = node2;
                node2.next = node1;
                node1.next = node2Next;
            } else {
                v1Prev.next = node2;
                node2.next =  node1.next;
                v2Prev.next = node1;
                node1.next = node2Next;
            }
        }
        return dummy.next;
    }
}