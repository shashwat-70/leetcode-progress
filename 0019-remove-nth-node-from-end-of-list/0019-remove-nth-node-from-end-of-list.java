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
        ListNode dHead=new ListNode(0,head);
        ListNode temp=dHead;
        ListNode end=dHead;
        
        //move end n times ahead of temp
        for(int i=0;i<n;i++){
            end=end.next;
        }

        while(end.next!=null){
            end=end.next;
            temp=temp.next;
        }
        temp.next=temp.next.next;
        return dHead.next;
    }
}