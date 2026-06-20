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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dHead=new ListNode(0,head);
        ListNode prevHead=dHead;
        ListNode revStart=head;
        while(checkK(revStart,k)){
            ListNode prevNode=null;
            ListNode currNode=revStart;
            for(int i=0;i<k;i++){
                ListNode nextNode=currNode.next;
                currNode.next=prevNode;
                prevNode=currNode;
                currNode=nextNode;
            }
            prevHead.next=prevNode;
            revStart.next=currNode;
            prevHead=revStart;
            revStart=currNode;
        }
        return dHead.next;
    }
    public boolean checkK(ListNode head,int k){
        int count=0;
        while(head!=null && count<k){
            head=head.next;
            count++;
        }
        return count==k;
    }
}