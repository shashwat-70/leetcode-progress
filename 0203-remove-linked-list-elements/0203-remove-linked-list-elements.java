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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return head;
        }
        ListNode dHead=new ListNode(0,head);
        ListNode temp=dHead;
        while(temp!=null && temp.next!=null){
            while(temp!=null && temp.next!=null && temp.next.val==val){
                temp.next=temp.next.next;
            }
            temp=temp.next;
        }
        return dHead.next;
    }
}