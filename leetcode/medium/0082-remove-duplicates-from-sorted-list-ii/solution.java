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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        ListNode headA= new ListNode(0);
        ListNode ptr= headA;
        Set<Integer> st = new HashSet<>();
        while(temp2!=null){
            if(temp1.val==temp2.val){
                st.add(temp1.val);
            }
            if(!st.contains(temp1.val) && temp1.val != temp2.val){
                ptr.next= new ListNode(temp1.val);
                ptr=ptr.next;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(!st.contains(temp1.val)){
            ptr.next = new ListNode(temp1.val);
        }
        return headA.next;
    }
}