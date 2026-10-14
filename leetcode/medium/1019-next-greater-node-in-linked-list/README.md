# Next Greater Node In Linked List

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a linked list with `n` nodes.

For each node in the list, find the value of the  **next greater node**. That is, for each node, find the value of the first node that is next to it and has a  **strictly larger**  value than it.

Return an integer array `answer` where `answer[i]` is the value of the next greater node of the `ith` node (**1-indexed**). If the `ith` node does not have a next greater node, set `answer[i] = 0`.

 

 **Example 1:** 

```
Input: head = [2,1,5]
Output: [5,5,0]

```

 **Example 2:** 

```
Input: head = [2,7,4,3,5]
Output: [7,0,5,5,0]

```

 

 **Constraints:** 

- The number of nodes in the list is n.
- 1 <= n <= 104
- 1 <= Node.val <= 109

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-10-14T05:53:11.229Z  

```java
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
```

---

[View on LeetCode](https://leetcode.com/problems/next-greater-node-in-linked-list/)