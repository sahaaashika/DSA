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
    public int pairSum(ListNode head) {
        int sum=0;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode h2=rev(slow);
        while(h2!=null && h2!=head){
            sum=Math.max(sum,(head.val+h2.val));
            h2=h2.next;
            head=head.next;
        }
        return sum;
    }
        public ListNode rev(ListNode head) {
        if (head==null) return head;
        ListNode prev=null;
        ListNode curr=head;
        ListNode nextl=head.next;
        while(nextl!=null){
            curr.next=prev;
            prev=curr;
            curr=nextl;
            nextl=nextl.next;
        }
        curr.next=prev;
        return curr;
    }

}