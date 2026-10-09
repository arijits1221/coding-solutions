# Count Number of Distinct Integers After Reverse Operations

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an array `nums` consisting of  **positive**  integers.

You have to take each integer in the array,  **reverse its digits**, and add it to the end of the array. You should apply this operation to the original integers in `nums`.

Return  *the number of  **distinct**  integers in the final array*.

 

 **Example 1:** 

```
Input: nums = [1,13,10,12,31]
Output: 6
Explanation: After including the reverse of each number, the resulting array is [1,13,10,12,31,1,31,1,21,13].
The reversed integers that were added to the end of the array are underlined. Note that for the integer 10, after reversing it, it becomes 01 which is just 1.
The number of distinct integers in this array is 6 (The numbers 1, 10, 12, 13, 21, and 31).
```

 **Example 2:** 

```
Input: nums = [2,2,2]
Output: 1
Explanation: After including the reverse of each number, the resulting array is [2,2,2,2,2,2].
The number of distinct integers in this array is 1 (The number 2).

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 106

## Solution

**Language:** Java  
**Runtime:** 55 ms (beats 79.73%)  
**Memory:** 105.5 MB (beats 75.17%)  
**Submitted:** 2026-10-09T18:01:10.436Z  

```java
class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int n: nums){
            st.add(n);
        }
        for(int i = 0;i<nums.length;i++){
            int n=nums[i];
            int rev=0;
            while(n>0){
                rev = rev*10+n%10;
                n=n/10;
            }
            st.add(rev);
        }
        return st.size();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-number-of-distinct-integers-after-reverse-operations/)