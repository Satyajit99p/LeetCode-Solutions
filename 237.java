/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode temp = new ListNode();
        temp.val = node.next.val;
        node.val = temp.val;
        node.next = node.next.next;
    }
}