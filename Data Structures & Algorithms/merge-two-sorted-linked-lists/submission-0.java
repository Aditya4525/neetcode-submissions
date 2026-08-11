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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=null;
        ListNode start=null;
        while(list1!=null && list2!=null){
            if(start==null){
                start=new ListNode();
                head=start;
            }else{
                start.next=new ListNode();
                start=start.next;
            }
            if(list1.val<=list2.val){
                start.val=list1.val;
                list1=list1.next;
            }else{
                start.val=list2.val;
                list2=list2.next;
            }
        }
        if(list1==null && list2!=null){
            if(start==null){
                head=list2;
            }else{
                start.next=list2;
            }
        }

        if(list1!=null&& list2==null){
            if(start==null){
                head=list1;
            }else{
                start.next=list1;
            }
        }
        return head;
        
    }
}