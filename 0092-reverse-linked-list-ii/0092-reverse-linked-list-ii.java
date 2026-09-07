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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null||left==right){
            return head;
        }
            ListNode temp=head;
            ListNode before=null;
            int position=1;
            while(position<left){
             
                    before=temp;
                    temp=temp.next;
                    position++;
                    continue;
                
            }
                ListNode curr=temp;
                ListNode prev=null;
                int time=right-left+1;
                while(time>0){
                    ListNode next=curr.next;
                    curr.next=prev;
                    prev=curr;
                    curr=next;
                    time--;
                }
                temp.next=curr;
                if(before!=null){
                    before.next=prev;
                }
                else{
                    head=prev;
                }
            
        
        return head;
    }
}