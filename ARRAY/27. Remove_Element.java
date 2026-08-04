// Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

// Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

// Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
// Return k.
// Custom Judge:

// The judge will test your solution with the following code:

//      int[] nums = [...]; // Input array
//      int val = ...; // Value to remove
//      int[] expectedNums = [...]; // The expected answer with correct length.
//                                  // It is sorted with no values equaling val.

//      int k = removeElement(nums, val); // Calls your implementation

//      assert k == expectedNums.length;
//      sort(nums, 0, k); // Sort the first k elements of nums
//      for (int i = 0; i < actualLength; i++) {
//          assert nums[i] == expectedNums[i];
//      }
// If all assertions pass, then your solution will be accepted.

 

// Example 1:

//      Input: nums = [3,2,2,3], val = 3
//      Output: 2, nums = [2,2,_,_]
//      Explanation: Your function should return k = 2, with the first two elements of nums being 2.
//      It does not matter what you leave beyond the returned k (hence they are underscores).
// Example 2:

//      Input: nums = [0,1,2,2,3,0,4,2], val = 2
//      Output: 5, nums = [0,1,4,0,3,_,_,_]
//      Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
//      Note that the five elements can be returned in any order.
//      It does not matter what you leave beyond the returned k (hence they are underscores).
 

// Constraints:

// • 0 <= nums.length <= 100
// • 0 <= nums[i] <= 50
// • 0 <= val <= 100

// Solution
// Approach
// Input: nums = [3,2,2,3], val = 3
// __________________________________________________________________________________________________________
// ◽️ Question
// How should we iterate through the input array?  
// __________________________________________________________________________________________________________
// My answer is to iterate through from the beginning. Why?
// That's because we have some numbers at index 0, 1, 2 and 3 in nums. The smallest number is 2 in nums, the second smallest is also 2 in nums. The next smallest is 3 in nums. In that case,
// [2,2,2,3]
// We have to keep 2 with variable or something, because we use 2 later. That is tough a bit right?
// But if we start from end, we have kind of available positions which are index 0, 1, 2 and 3 in nums. We can simply put the numbers without keeping numbers.
// We know that nums is sorted in non-decreasing order. All we have to do is to compare the first numbers in nums with val.
// Let's see one by one!
//      ↓
// nums = [3,2,2,3], val = 3
//      ↑
// First of all, compare 3 with 3. 3 is equal to 3. Move the pointer in nums to the next.
//      ↓
// nums = [3,2,2,3], val = 3
//        ↑
// We will speed up.
// Compare 2 with 3.
//      ↓
// nums = [2,2,2,3], val = 3
//          ↑
// Compare 2 with 3.
//      ↓
// nums = [2,2,2,3], val = 3
//            ↑
// Compare 2 with 3.
//      ↓
// nums = [2,2,2,3], val = 3
//              ↑
// Compare 3 with 3. 3 is equal to 3. Move the pointer in nums to the next.
//      ↓           
// nums = [2,2,2,3], val = 3
//                ↑
// We have to return the number of elements in nums which are not equal to val. That is 3 in this case. So, we can return 3.
// Let's see the code!  
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}

// Time Complexity: O(n) where n is the length of nums. We iterate through the input array once.
// Space Complexity: O(1) because we are using only constant extra space.

// Did this code successfully run on Leetcode? Yes
// Any problem you faced while coding this? No

