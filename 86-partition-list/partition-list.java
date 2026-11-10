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
    public ListNode partition(ListNode head, int x) {
        ListNode curr=head,ss=null,s=null,ls=null,l=null;
        if(curr==null ||curr.next==null){
            return head;
        }
        while(curr!=null){
            if(curr.val<x){
                if(ss==null){
                    ss=curr;
                    s=curr;
                }
                else{
                s.next=curr;
                s=curr;
                }
            }
            else{
                if(ls==null){
                    ls=curr;
                    l=curr;
                }
                else{
                l.next=curr;
                l=curr;
                }
            }
            curr=curr.next;
        }
           if (l != null) {
            l.next = null;
        }

        if (ss == null) {
            return ls;
        }

        s.next=ls;
        return ss;
    }
}