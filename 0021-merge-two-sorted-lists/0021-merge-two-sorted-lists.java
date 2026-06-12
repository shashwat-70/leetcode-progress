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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode l1=list1;
        ListNode l2=list2;
        ListNode l3=new ListNode();
        ListNode tail=l3;
        while(l1!=null && l2!=null){
            if(l1.val<=l2.val){
                tail=add(tail,l1.val);
                l1=l1.next;
            }
            else if(l1.val>l2.val){
                tail=add(tail,l2.val);
                l2=l2.next;
            }
        }
        while(l2!=null){
            tail=add(tail,l2.val);
            l2=l2.next;
        }
        while(l1!=null){
            tail=add(tail,l1.val);
            l1=l1.next;
        }
        l3=l3.next;
        return l3;
    }
    public ListNode add(ListNode l,int val){
        ListNode temp=new ListNode(val);
        l.next=temp;
        return temp;
    }
}