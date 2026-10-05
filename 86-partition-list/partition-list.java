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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy=new ListNode(-1);
        ListNode dummy_2=new ListNode(-1);
        ListNode temp_1=dummy;
        ListNode temp_2=dummy_2;
        ListNode temp=head;
        while(temp!=null){
           if(temp.val<x){
            temp_1.next=temp;
            temp_1=temp_1.next;
            temp=temp.next;
           }else{
            temp_2.next=temp;
            temp_2=temp_2.next;
            temp=temp.next;
           }
        }
        temp_2.next=null;
        temp_1.next=dummy_2.next;
        return dummy.next;
    }
}