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
    public ListNode swapPairs(ListNode head) {
        ListNode prev=null;
        if(head==null){
            return null;
        }
        ListNode left=head;
        ListNode right=left;
         ListNode prevleft=null;
        ListNode nextleft=null;
        ListNode ans=null;
        int size=2;
        while(left!=null){
            right=left;
            for(int i=0;i<size-1;i++){
                if(right==null){
                    break;
                }
                else{
                    right=right.next;
                }
            }
            if(right!=null){
            nextleft=right.next;
            reverse(left,size);
            if(prevleft!=null){
                prevleft.next=right;
            }
            if(ans==null){
                ans=right;
            }
            prevleft=left;
            left=nextleft;
        }
        else{
            if(prevleft!=null){
                prevleft.next=left;
            }
            if(ans==null){
                ans=left;
            }
            break;
        }
    }
    return ans;
}
public void reverse(ListNode head,int size){
    ListNode curr=head;
    ListNode prev=null;
    while(size>0 && curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
        size--;
    }
}
}