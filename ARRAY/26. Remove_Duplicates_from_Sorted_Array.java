// 26. Remove Duplicates from Sorted Array
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// Problem Statement:
// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place 
// such that each unique element appears only once. The relative order of the elements 
// should be kept the same. Then return the number of unique elements in nums.

// Consider the number of unique elements of nums to be k, to get accepted, 
// you need to do the following things:
// 1. Change the array nums such that the first k elements of nums contain the unique elements 
//    in the order they were present in nums initially. The remaining elements of nums are not 
//    important as well as the size of nums.
// 2. Return k.

// Custom Judge:
//      int[] nums = [...]; // Input array
//      int[] expectedNums = [...]; // The expected answer with correct length
//
//      int k = removeDuplicates(nums); // Calls your implementation
//
//      assert k == expectedNums.length;
//      for (int i = 0; i < k; i++) {
//          assert nums[i] == expectedNums[i];
//      }

// Example 1:
//      Input: nums = [1,1,2]
//      Output: 2, nums = [1,2,_]
//      Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//      It does not matter what you leave beyond the returned k (hence they are underscores).

// Example 2:
//      Input: nums = [0,0,1,1,1,2,2,3,3,4]
//      Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
//      Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
//      It does not matter what you leave beyond the returned k (hence they are underscores).

// Constraints:
// • 1 <= nums.length <= 3 * 10^4
// • -100 <= nums[i] <= 100
// • nums is sorted in non-decreasing order.

// __________________________________________________________________________________________________________
// ◽️ Approach: Two-Pointer Technique
// __________________________________________________________________________________________________________
// Since the array is already sorted in non-decreasing order, all identical elements will be adjacent to each other.
// We can use a two-pointer approach:
// 1. Slow pointer (`k`): Tracks the position of the next unique element to be stored.
// 2. Fast pointer (`i`): Scans through the array to find new unique elements.

// Visual Walkthrough:
// Input: nums = [0, 0, 1, 1, 1, 2]
//
// Initial state:
// k = 1 (since nums[0] is always unique and placed at index 0)
//
// Step 1: i = 1, compare nums[1] (0) with nums[0] (0) -> Duplicate, skip.
// Step 2: i = 2, compare nums[2] (1) with nums[1] (0) -> Unique element (1)!
//         Place nums[k] = nums[2] => nums[1] = 1, increment k to 2.
//         nums array becomes: [0, 1, 1, 1, 1, 2]
// Step 3: i = 3, compare nums[3] (1) with nums[2] (1) -> Duplicate, skip.
// Step 4: i = 4, compare nums[4] (1) with nums[3] (1) -> Duplicate, skip.
// Step 5: i = 5, compare nums[5] (2) with nums[4] (1) -> Unique element (2)!
//         Place nums[k] = nums[5] => nums[2] = 2, increment k to 3.
//         nums array becomes: [0, 1, 2, 1, 1, 2]
//
// End of loop. Return k = 3. First 3 elements are [0, 1, 2].

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // k points to the location where the next unique element should be inserted
        int k = 1;

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Compare current element with previous element
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Store unique element at index k
                k++;               // Move k to next position
            }
        }

        return k;
    }
}

// Complexity Analysis:
// • Time Complexity: O(n) - We traverse the array of length n exactly once.
// • Space Complexity: O(1) - In-place modification using constant extra memory.

// Step by Step Algorithm:
// 1. Check edge case: If `nums` is null or empty, return 0.
// 2. Initialize pointer `k = 1` (the first element `nums[0]` is always unique and remains at index 0).
// 3. Loop through array with index `i` from `1` to `nums.length - 1`:
//    - If `nums[i] != nums[i - 1]`, we found a new unique element.
//    - Assign `nums[k] = nums[i]`.
//    - Increment `k`.
// 4. Return `k` as the number of unique elements.
