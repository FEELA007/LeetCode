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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head ==null || k==1 ){
            return head;
        }
        ListNode c=head;
        for(int i=0;i<k;i++){
            if(c==null) return head;
            c=c.next;
        }
        c=head;
        ListNode p=null;
        for(int i=0;i<k;i++){
            ListNode next =c.next;
            c.next=p;
            p=c;
            c=next;
        }
         if (c != null) {
            head.next = reverseKGroup(c, k);
        }
        return p;
    }
}