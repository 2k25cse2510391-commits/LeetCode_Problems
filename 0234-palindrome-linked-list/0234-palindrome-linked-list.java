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
    public boolean isPalindrome(ListNode head) {
        int n =0;
        ListNode temp = head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        if(n==1){
            return true;
        }
        if(n==2){
            if(head.val==head.next.val){
                return true;
            }
            return false;
        }
        if(n==3){
            if(head.val==head.next.next.val){
                return true;
            }
            return false;
        }
        int mid =0;
        if(n%2==0){
            mid = (n/2);
        }
        else{
            mid = (n/2);
        }
        ListNode temp1 = head;
        for(int a =0;a<mid;a++){
            temp1=temp1.next;
        }
        ListNode temp3 = temp1;
        //temp1=temp1.next;
        ListNode temp2 = reverse(temp1);
        while(head!=temp3&&temp2!=null){
            if(head.val!=temp2.val){
                return false;
            }
            head=head.next;
            temp2=temp2.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head){
        ListNode tail = head;
        while(tail.next!=null){
            tail=tail.next;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        if(temp2.next==null) {
        temp1.next=null;
        temp2.next=temp1;
        head = temp2;
        tail = temp1;
        return head;
        }
        ListNode temp3 = head.next.next;
        while(temp3 != null){
            temp2.next=temp1;
            temp1=temp2;
            temp2=temp3;
            temp3=temp3.next;

        }
        temp2.next=temp1;
        ListNode temp = head;
        head=tail;
        tail=temp;
        tail.next=null;
        return head;
    }
}