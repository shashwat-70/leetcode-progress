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
    public ListNode mergeNodes(ListNode head) {
        ListNode dHead=new ListNode(0,null);
        ListNode ptr=dHead;
        int sum=0;

        ListNode temp=head.next;
        while(temp!=null){
            sum+=temp.val;
            if(temp.val==0){
                ptr.next=new ListNode(sum,null);
                ptr=ptr.next;
                sum=0;
            }
            temp=temp.next;
        }
        return dHead.next;
    }
}