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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head;
        }
        int size=size(head);
        int breakPoint=size-k%size;
        int count=1;
        ListNode temp=head;
        while(count<breakPoint){
            temp=temp.next;
            count++;
        }
        ListNode nHead=temp.next;
        temp.next=null;
        return nHead;
    }
    public int size(ListNode head){
        ListNode temp=head;
        int count=1;
        while(temp.next!=null){
            temp=temp.next;
            count++;
        }
        temp.next=head;
        return count;
    }
}