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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0 ){
            return head;
        }
        int n=1;
        ListNode last=head;
        while(last.next!=null){
            last=last.next;
            n++;
        }
        k=k%n;
        if(k==0){
            return head;
        }
        last.next=head;
        for(int i=0;i<n-k;i++){
            last=last.next;
        }
        head=last.next;
        last.next=null;
        return head;
    }
}