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
    public void reorderList(ListNode head) {
        ListNode slow =head;
        ListNode fast=head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode l2=slow.next;
        slow.next=null;
        ListNode prev=null;
        ListNode temp=null;
        while(l2!=null){
            temp=l2.next;
            l2.next=prev;
            prev=l2;
            l2=temp;
        }
        l2=prev;
        ListNode l1=head;
        ListNode temp2=null;
        while(l2!=null){
            temp=l1.next;
            temp2=l2.next;
            l1.next=l2;
            l2.next=temp;
            l2=temp2;
            l1=temp;
        }
    }
}
