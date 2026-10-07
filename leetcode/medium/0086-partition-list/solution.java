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
        ListNode temp=head;
        ListNode headA =new ListNode(0);
        ListNode left = headA;
        ListNode headB = new ListNode(0);
        ListNode right=headB;
        while(temp!=null){
            if(temp.val<x){
                left.next=new ListNode(temp.val);
                left=left.next;
            }
            else{
                right.next=new ListNode(temp.val);
                right=right.next;
            }
            temp=temp.next;
        }
        left.next=headB.next;
        return headA.next;
    }
}