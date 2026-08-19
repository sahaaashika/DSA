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
    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null ){
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast!=null)
        slow=slow.next;
        ListNode head2=rev(slow);
        while(head2!=null){
            if(head.val!=head2.val)
            return false;
            head=head.next;
            head2=head2.next;
        }
            return true;

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