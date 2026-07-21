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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count==n){
            return head.next;
        }
        int target = count-n + 2;
        temp = head;
        for(int a = 0 ; a<target-3;a++){
            temp=temp.next;
        }
        if(n!=1){
        temp.next=(temp.next).next;
        }
        else{
            temp.next=null;
        }
        return head;

    }
}