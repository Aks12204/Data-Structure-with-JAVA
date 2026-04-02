// Merge Sort Array
// https://leetcode.com/problems/merge-sorted-array/
// Problem statement
//You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n, representing the number of elements in nums1 and nums2 respectively.

//Merge nums1 and nums2 into a single array sorted in non-decreasing order.

//The final sorted array should not be returned by the function, but instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged, and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
//Example 1:

//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

//solution
//Approach
//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//__________________________________________________________________________________________________________
//◽️ Question
//How should we iterate through the input arrays?
//________________________________________________________________________________________________________
//My answer is to iterate through from the end. Why?

//That's because we have some numbers at index 0, 1 and 2 in nums1. The smallest number is 1 in nums1, the second smallest is 2 in nums1.

//the next smallest is 2 in nums2. In that case,

//[1,2,2,0,0,0]
//temp = 3     
//We have to keep 3 with variable or something, because we use 3 later. That is tough a bit right?

//But if we start from end, we have kind of available positions which are index 3, 4 and 5 in nums1. We can simply put the numbers without keeping numbers.

//We know that nums1 and nums2 are sorted in non-decreasing order. All we have to do is to compare the last numbers in both arrays.

// Let's see one by one!

//              ↓     r
// nums1 = [1,2,3,0,0,0], m = 3,
// nums2 = [2,5,6], n = 3　　　　　　　　　　　
//              ↑

// r is right position where we should put the next biggest number.
// First of all, compare 3 with 6. 6 is bigger than 3. Put 6 at right position and mvoe r and the pointer in nums2 to the next.

//      ↓   r
// [1,2,3,0,0,6]
// [2,5,6]
//    ↑
// We will speed up.

// Compare 3 with 5.

//      ↓ r
// [1,2,3,0,5,6]
// [2,5,6]
//    ↑
// Compare 3 with 2.

//    ↓ r
// [1,2,3,3,5,6]
// [2,5,6]
//  ↑
// Compare 2 with 2. Let me put 2 from nums2.

//    ↓ r
// [1,2,2,3,5,6]
// [2,5,6]
// ↑
// Now the pointer for nums2 reached -1 index, so stop iteration. We successfully created [1,2,2,3,5,6].

// ◽️ Question

// One more important question is that how many times do we have to iterate though nums1 and nums2.

// ...😩

// ...😅

// ...😄

// My answer is "until the pointer in nums2 reached -1."

// Let's see this example.

//      ↓     r
// [7,8,9,0,0,0]
// [2,5,6]
//      ↑
// All numbers in nums1 are greather than all numbers in nums2. In that case, 3 numbers in nums1 go to the last 3 positions.

// ↓     r
//  [7,8,9,7,8,9]
//  [2,5,6]
//       ↑
// Now the pointer for nums1 reached -1, but we have to put all numbers in nums1. That's why we continue iteration until the pointer in nums2 reached -1.

// ↓   r
//  [7,8,6,7,8,9]
//  [2,5,6]
//     ↑
// -------------------
// ↓ r
//  [7,5,6,7,8,9]
//  [2,5,6]
//   ↑
// -------------------
// r
// ↓ 
//  [2,5,6,7,8,9]
//  [2,5,6]
// ↑
// Let's see one more example. All numbers in nums2 are greater than all numbers in nums1.

//      ↓     r
// [1,2,3,0,0,0]
// [5,6,8]
//      ↑
// In that case,

//      ↓     r
// [1,2,3,0,0,8]
// [5,6,8]
//    ↑
// --------------
//      ↓ r
// [1,2,3,0,6,8]
// [5,6,8]
//  ↑
// --------------
//       r
//       ↓ 
//  [1,2,3,5,6,8]
//  [5,6,8]
// ↑
// Now, we the pointer for nums2 reached -1. Actually finish iteration, because we know that numbers in nums1 are sorted in non-decreasing order, so we don't have to care about the rest of numbers in nums1.

// Easy!😄
// Let's see solution codes!

// Complexity
// •Time complexity: O(m+n)
// •Space complexity: O(1)