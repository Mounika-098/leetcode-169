# leetcode-169
# Majority Element

This is a solution to the "Majority Element" problem, where we need to find the element that appears more than ⌊n / 2⌋ times in an array.

## Problem Description

Given an array `nums` of size `n`, we are tasked with finding the majority element. The majority element is defined as the element that appears more than ⌊n / 2⌋ times. We can assume that the majority element always exists in the array.

### Example

Input:
nums = [2,2,1,1,1,2,2]
Output:
2

## Solution Approach

The solution approach used in this code is known as the "Boyer-Moore Voting Algorithm." It is an efficient algorithm that finds the majority element in linear time complexity, without using any additional data structures.

The main idea of the algorithm is to keep a counter and a candidate value. We initialize the counter to 0 and the candidate value to an arbitrary element from the array. Then, we iterate through the array, and for each element, we update the counter and candidate as follows:

- If the counter is 0, we set the candidate to the current element and increment the counter.
- If the candidate is the same as the current element, we increment the counter.
- If the candidate is different from the current element, we decrement the counter.

At the end of the iteration, the candidate will hold the majority element.

## How to Use

1. Provide an input array `nums` in the code. Modify the line `int[] nums = {3, 2, 3};` to include your own array elements.
2. Compile and run the code.
3. The output will be the majority element in the given array.

Note: This solution assumes that the majority element always exists in the array.

## Complexity Analysis

- Time Complexity: The algorithm traverses the array once, resulting in a time complexity of O(n), where n is the size of the input array `nums`.
- Space Complexity: The algorithm uses a constant amount of additional space, resulting in a space complexity of O(1).

## Related Problems

- [Majority Element II](https://leetcode.com/problems/majority-element-ii/): A variation of this problem where the majority element appears more than ⌊n / 3⌋ times.

Feel free to modify the code as needed and use it in your projects.


