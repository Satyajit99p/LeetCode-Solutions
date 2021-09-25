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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode temp = new ListNode();
        temp.next = head;
        ListNode f = temp;;
        while(n>0)
        {
            f = f.next;
            n--;
        }
        ListNode s =temp;
        while(f.next != null)
        {
            s = s.next;
            f = f.next;
        }
        //ListNode no = t.next;
        s.next = s.next.next;
        return temp.next;
    }
}