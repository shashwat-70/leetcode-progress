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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode lHead=head;
        ListNode rHead=mid.next;
        mid.next=null;
        lHead=sortList(lHead);
        rHead=sortList(rHead);
        return merge(rHead,lHead);

    }
    public static ListNode merge(ListNode l1,ListNode l2){
        ListNode l3=new ListNode();
        ListNode tail=l3;
        while(l1!=null && l2!=null){
            if(l1.val <= l2.val){
                tail.next=l1;
                tail=tail.next;
                l1=l1.next;
            }
            else{
                tail.next=l2;
                tail=tail.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            tail.next=l1;
            // l1=l1.next;
            // tail=tail.next;
        }
        if(l2!=null){
            tail.next=l2;
            // l2=l2.next;
            // tail=tail.next;
        }
        return l3.next;
    }
    public static ListNode getMid(ListNode head){
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
}