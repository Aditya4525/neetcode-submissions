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
        int size=0;
        ListNode start=head;
        while(start!=null){
            start=start.next;
            size++;
        }
        int index=size-n;

        if(index==0){
            head=head.next;
        }else{
            start=head;
            for(int i=0;i<index-1;i++){
                start=start.next;
            }
            start.next=start.next.next;
        }
        return head;
    }
}
