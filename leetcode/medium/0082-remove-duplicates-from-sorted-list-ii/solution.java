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
        Map<Integer,Integer> map = new LinkedHashMap<>();
        ListNode temp= head;
        while(temp!=null){
            map.put(temp.val,map.getOrDefault(temp.val,0)+1);
            temp=temp.next;
        }
        ListNode headA= new ListNode(0);
        temp=headA;
        for(int n : map.keySet() ){
            if(map.get(n)==1){
                temp.next = new ListNode(n);
                temp=temp.next;
            }
        }
        return headA.next;
    }
}