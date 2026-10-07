# Remove Duplicates from Sorted List II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given the `head` of a  **sorted**  linked list.

Delete all nodes that have  **duplicate**  numbers, leaving only  **distinct**  numbers from the original list.

Return the linked list  **sorted**  as well.

 

 **Example 1:** 

```
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

```

 **Example 2:** 

```
Input: head = [1,1,1,2,3]
Output: [2,3]

```

 

 **Constraints:** 

- The number of nodes in the list is in the range [0, 300].
- -100 <= Node.val <= 100
- The list is guaranteed to be sorted in ascending order.

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.6 MB  
**Submitted:** 2026-10-07T05:25:29.493Z  

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
```

---

[View on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/)