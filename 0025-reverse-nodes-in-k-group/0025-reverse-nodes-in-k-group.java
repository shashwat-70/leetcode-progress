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
        return reverse(head,k);
    }
    public ListNode reverse(ListNode head,int k){
        if(head==null || head.next==null){
            return head;
        }
        if(!kNodes(head,k)){
            return head;
        }
        ListNode preNode=null;
        ListNode currNode=head;
        for(int i=0;i<k && currNode!=null;i++){
            ListNode nextNode=currNode.next;
            currNode.next=preNode;
            preNode=currNode;
            currNode=nextNode;
        }
        head.next=reverse(currNode,k);
        return preNode;
    }
    public boolean kNodes(ListNode head,int k){
        ListNode temp=head;
        int count=0;
        while(temp!=null && count<k){
            temp=temp.next;
            count++;
        }
        return count==k;
    }
}