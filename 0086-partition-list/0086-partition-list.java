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
        ListNode l1=new ListNode(0,null);
        ListNode l2=new ListNode(0,null);
        ListNode less=l1;
        ListNode great=l2;

        while(head!=null){
            if(head.val<x){
                less.next=head;
                less=less.next;
            }
            else{
                great.next=head;
                great=great.next;
            }
            head=head.next;
        }
        
        if(l1.next==null){
            //edge case when all val are greater than x
            return l2.next;
        }

        l1=l1.next;
        l2=l2.next;
        less.next=l2;
        great.next=null;

        return l1;
    }
}