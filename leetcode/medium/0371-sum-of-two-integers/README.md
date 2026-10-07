# Sum of Two Integers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given two integers `a` and `b`, return  *the sum of the two integers without using the operators*  `+`  *and*  `-`.

 

 **Example 1:** 

```
Input: a = 1, b = 2
Output: 3

```

 **Example 2:** 

```
Input: a = 2, b = 3
Output: 5

```

 

 **Constraints:** 

- -1000 <= a, b <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42.3 MB  
**Submitted:** 2026-10-07T13:05:18.529Z  

```java
class Solution {
    public int getSum(int a, int b) {
        int sum=a;
        int carry=b;
        while(b != 0){
            sum = a^b;
            carry = (a&b)<<1;
            a= sum;
            b= carry;
        }
        return sum;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/sum-of-two-integers/)