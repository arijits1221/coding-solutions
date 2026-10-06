# Traffic Signal Color

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given an integer `timer` representing the remaining time (in seconds) on a traffic signal.

The signal follows these rules:

- If timer == 0, the signal is "Green"
- If timer == 30, the signal is "Orange"
- If 30 < timer <= 90, the signal is "Red"

Return the current state of the signal. If none of the above conditions are met, return `"Invalid"`.

 

 **Example 1:** 

 **Input:**  timer = 60

 **Output:**  "Red"

 **Explanation:** 

Since `timer = 60`, and `30 < timer <= 90`, the answer is `"Red"`.

 **Example 2:** 

 **Input:**  timer = 5

 **Output:**  "Invalid"

 **Explanation:** 

Since `timer = 5`, it does not satisfy any of the given conditions, the answer is `"Invalid"`.

 

 **Constraints:** 

- 0 <= timer <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.4 MB (beats 68.80%)  
**Submitted:** 2026-10-06T04:26:43.018Z  

```java
class Solution {
    public String trafficSignal(int timer) {
        if(timer==0){
            return "Green";
        }
        else if(timer==30){
            return "Orange";
        }
        else if(timer>30 && timer<=90){
            return "Red";
        }
        else{
            return "Invalid";
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/traffic-signal-color/)