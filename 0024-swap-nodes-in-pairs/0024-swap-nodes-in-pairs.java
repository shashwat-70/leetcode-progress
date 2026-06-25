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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dHead=new ListNode(0,head);
        ListNode prev=dHead;
        ListNode curr=head;

        while(curr!=null && curr.next!=null){
            //swapping both the nodes and joining them again to their neighbouring nodes
            prev.next=curr.next;
            prev=prev.next;
            curr.next=prev.next;
            prev.next=curr;
            //moving to next nodes
            curr=curr.next;
            prev=prev.next;
        }
        return dHead.next;
    }
}