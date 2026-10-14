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
    public int[] nextLargerNodes(ListNode head) {
       ListNode temp=head;
       int count=0;
       int maxm = 0;
       while(temp!=null){
        count++;
        maxm = Math.max(maxm,temp.val);
        temp=temp.next;
       }
       temp = head;
       int[] arr = new int[count];
       for(int i =0;i<count;i++){
        arr[i]= temp.val;
        temp=temp.next;
       }
       int[] brr = new int[count];
       brr[count-1]=0;
       if(count==1) return brr;
       brr[count-2]=arr[count-1];
       if(count == 2) return brr;
       for(int i = count-2;i>0;i--){
        if(brr[i]<arr[i]){
            brr[i-1] = arr[i];
        }
        else{
            brr[i-1]=brr[i];
        }
        if(arr[i]==maxm){
            brr[i]=0;
        }
       }
       return brr;
    }
}