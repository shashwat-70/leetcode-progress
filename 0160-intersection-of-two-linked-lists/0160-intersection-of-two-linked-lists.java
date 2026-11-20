/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int sizeA=size(headA);
        int sizeB=size(headB);

        ListNode tempA=headA;
        ListNode tempB=headB;

        if(sizeA<sizeB){
            int diff=sizeB-sizeA;
            while(diff!=0){
                diff--;
                tempB=tempB.next;
            }
            while(tempA!=tempB){
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return tempA;
        }

        else{
            int diff=sizeA-sizeB;
            while(diff!=0){
                diff--;
                tempA=tempA.next;
            }
            while(tempA!=tempB){
                tempA=tempA.next;
                tempB=tempB.next;
            }
            return tempA;
        }
    }

    private static int size(ListNode head){
        int s=0;
        while(head!=null){
            s++;
            head=head.next;
        }
        return s;
    }
}