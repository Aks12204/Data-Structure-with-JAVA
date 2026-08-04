// 169. Majority Element
// https://leetcode.com/problems/majority-element/

// Problem Statement:
// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

// Example 1:
//      Input: nums = [3,2,3]
//      Output: 3

// Example 2:
//      Input: nums = [2,2,1,1,1,2,2]
//      Output: 2

// Constraints:
// • n == nums.length
// • 1 <= n <= 5 * 10^4
// • -10^9 <= nums[i] <= 10^9

// Follow-up: Could you solve the problem in linear time O(n) and in O(1) space?

// __________________________________________________________________________________________________________
// ◽️ Approach: Boyer-Moore Voting Algorithm
// __________________________________________________________________________________________________________
// Intuition:
// Since the majority element appears more than ⌊n / 2⌋ times, its frequency is greater than 
// the combined frequency of all other elements in the array.
// If we pair off different elements, the majority element will always remain as the survivor.

// How it works:
// 1. Maintain a `candidate` element and a `count`.
// 2. Iterate through `nums`:
//    - If `count == 0`, set current element as the new `candidate`.
//    - If current element == `candidate`, increment `count++`.
//    - Else, decrement `count--`.
// 3. Since the majority element exists more than n/2 times, `candidate` at the end of the loop is the answer.

// Visual Walkthrough:
// Input: nums = [2, 2, 1, 1, 1, 2, 2]
//
// Initial: candidate = 0, count = 0
//
// Step 1: num = 2 -> count == 0 => candidate = 2, count = 1
// Step 2: num = 2 -> num == candidate => count = 2
// Step 3: num = 1 -> num != candidate => count = 1
// Step 4: num = 1 -> num != candidate => count = 0
// Step 5: num = 1 -> count == 0 => candidate = 1, count = 1
// Step 6: num = 2 -> num != candidate => count = 0
// Step 7: num = 2 -> count == 0 => candidate = 2, count = 1
//
// Result: candidate = 2 (Majority Element)

class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        for (int num : nums) {
            // If count drops to 0, pick the current element as the new candidate
            if (count == 0) {
                candidate = num;
            }

            // Increment count if current element matches candidate, else decrement
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}

// Complexity Analysis:
// • Time Complexity: O(n) - We traverse the array of length n exactly once.
// • Space Complexity: O(1) - Uses only constant extra space for variables `candidate` and `count`.

// Step by Step Algorithm:
// 1. Initialize `candidate = 0` and `count = 0`.
// 2. Loop through each number `num` in the array `nums`:
//    - If `count == 0`, assign `candidate = num`.
//    - If `num == candidate`, increment `count` by 1.
//    - Otherwise, decrement `count` by 1.
// 3. Return `candidate`.
