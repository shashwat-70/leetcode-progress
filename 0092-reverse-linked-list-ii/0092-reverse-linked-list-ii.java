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
    /* 
    Before:
        dHead -> leftPre -> revStart -> Node1 -> Node2 -> prevNode -> currNode
    After:
        dHead -> leftPre -> prevNode -> Node2 -> Node1 -> revStart -> currNode

    */
    public ListNode reverseBetween(ListNode head, int left, int right) {

        ListNode dHead=new ListNode(0,head);//avoids edge case when left==1
        ListNode leftPre=dHead;

        //moving leftPre just before to the starting of nodes to be reversed
        for(int i=0;i<left-1;i++){
            leftPre=leftPre.next;
        }
        //revStart is the point from which list is to be reversed
        ListNode revStart=leftPre.next;

        //reversing list from revStart to (right-left+1)th node
        ListNode prevNode=null;
        ListNode currNode=leftPre.next;
        for(int i=0;i<right-left+1;i++){
            ListNode nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }


        //restoring the links once the list is reversed
        leftPre.next=prevNode;
        revStart.next=currNode;

        return dHead.next;
    }
}