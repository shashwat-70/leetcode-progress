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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=findMid(head);
        ListNode l1=head;
        ListNode l2=reverse(mid.next);
        mid.next=null;
        while(l1!=null && l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1=l1.next;
            l2=l2.next;
        }
        return true;
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
    public ListNode findMid(ListNode head){
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        return s;
    }
}