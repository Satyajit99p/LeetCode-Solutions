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
        
        ListNode dum = head;
        int c = 0;
        while(dum != null)
        {
            dum =dum.next;
            c++;
        }
        int x = c/2+1;
        while(x>1)
        {
            head = head.next;
            x--;
        }
        ListNode temp = head;
        
        return temp;
        
    }
}