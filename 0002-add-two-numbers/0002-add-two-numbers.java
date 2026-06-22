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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dHead=new ListNode(0,null);
        ListNode l3=dHead;
        int carry=0;

        while(l1!=null && l2!=null){
            int sum=l1.val+l2.val+carry;
            l1=l1.next;
            l2=l2.next;
            int add=sum%10;
            l3.next=new ListNode(add);
            l3=l3.next;
            carry=sum/10;
        }
        while(l1!=null){
            int sum=l1.val+carry;
            l1=l1.next;
            int add=sum%10;
            l3.next=new ListNode(add);
            l3=l3.next;
            carry=sum/10;
        }
        while(l2!=null){
            int sum=l2.val+carry;
            l2=l2.next;
            int add=sum%10;
            l3.next=new ListNode(add);
            l3=l3.next;
            carry=sum/10;
        }
        if(carry!=0){
            l3.next=new ListNode(carry);
            l3=l3.next;
        }

        return dHead.next;
    }
}