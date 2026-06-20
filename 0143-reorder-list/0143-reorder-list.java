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
    public void reorderList(ListNode head) {
        ListNode mid=getMid(head);
        ListNode l1=head;
        ListNode l2=reverse(mid.next);
        mid.next=null;
        ListNode dHead=new ListNode(0,null);
        ListNode l3=dHead;
        while(l1!=null && l2!=null){
            l3.next=l1;
            l3=l3.next;
            l1=l1.next;
            l3.next=l2;
            l3=l3.next;
            l2=l2.next;
        }
        while(l1!=null){
            l3.next=l1;
            l3=l3.next;
            l1=l1.next;
        }
        while(l2!=null){
            l3.next=l2;
            l3=l3.next;
            l2=l2.next;
        }
        // return dHead.next;
    }
    public ListNode reverse(ListNode head){
        ListNode prevNode=null;
        ListNode currNode=head;
        while(currNode!=null){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        return prevNode;
    }
    public ListNode getMid(ListNode head){
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}