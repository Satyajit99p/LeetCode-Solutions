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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null ||  k == 0)
            return head;
        ListNode n = head;
        int c =0;
        while(n != null)
        {
            c++;
            n=n.next;
        }
        k = k%c;
        while(k>0)
        {
            ListNode temp = head;
            while(temp.next.next != null)
                temp = temp.next;

            ListNode dum = new ListNode();
            dum = temp.next;
            temp.next = null;
            dum.next = head;
            head = dum;
            
            k--;
        }
        return head;
    }
}