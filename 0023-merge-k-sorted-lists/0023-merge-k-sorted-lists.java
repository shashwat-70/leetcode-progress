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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        if(lists.length==1){
            return lists[0];
        }
        ListNode ans=merge(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            ans=merge(ans,lists[i]);
        }
        return ans;
    }
    public ListNode merge(ListNode l1,ListNode l2){
        ListNode dHead=new ListNode(0,null);
        ListNode l3=dHead;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                l3.next=l1;
                l3=l3.next;
                l1=l1.next;
            }
            else{
                l3.next=l2;
                l3=l3.next;
                l2=l2.next;
            }
        }
        if(l1!=null){
            l3.next=l1;
        }
        if(l2!=null){
            l3.next=l2;
        }
        return dHead.next;
    }
}