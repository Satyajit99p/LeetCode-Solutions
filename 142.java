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
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        ListNode s = head;
        ListNode f = head;
        ListNode temp = head;
        while(f.next != null && f.next.next != null )
        {
            s=s.next;
            f = f.next.next;   
            if(s == f)
                {
                while(temp != s)
                {
                    temp = temp.next;
                    s = s.next;
                }
                return temp;
                }
            
        }
        return null;
        
        
    }
}