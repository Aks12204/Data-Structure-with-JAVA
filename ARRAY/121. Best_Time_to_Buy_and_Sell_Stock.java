// 121. Best Time to Buy and Sell Stock
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

// Problem Statement:
// You are given an array prices where prices[i] is the price of a given stock on the i-th day.
// You want to maximize your profit by choosing a single day to buy one stock and choosing 
// a different day in the future to sell that stock.
// Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.

// Example 1:
//      Input: prices = [7,1,5,3,6,4]
//      Output: 5
//      Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6 - 1 = 5.
//      Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

// Example 2:
//      Input: prices = [7,6,4,3,1]
//      Output: 0
//      Explanation: In this case, no transactions are done and max profit = 0.

// Constraints:
// • 1 <= prices.length <= 10^5
// • 0 <= prices[i] <= 10^4

// __________________________________________________________________________________________________________
// ◽️ Approach: Single Pass (Greedy / One-Pointer)
// __________________________________________________________________________________________________________
// Intuition:
// To maximize profit, we want to buy at the lowest possible price (`minPrice`) so far 
// and sell at the current price if the profit (`price - minPrice`) is higher than `maxProfit`.

// How it works:
// 1. Initialize `minPrice = Integer.MAX_VALUE` (or `prices[0]`) and `maxProfit = 0`.
// 2. Iterate through each price in `prices`:
//    - If the current price is smaller than `minPrice`, update `minPrice`.
//    - Otherwise, calculate profit = `price - minPrice`. If profit > `maxProfit`, update `maxProfit`.
// 3. Return `maxProfit`.

// Visual Walkthrough:
// Input: prices = [7, 1, 5, 3, 6, 4]
//
// Initial: minPrice = ∞, maxProfit = 0
//
// Day 1 (Price = 7): minPrice = 7, maxProfit = 0
// Day 2 (Price = 1): minPrice = 1, maxProfit = 0
// Day 3 (Price = 5): Profit = 5 - 1 = 4 => maxProfit = 4
// Day 4 (Price = 3): Profit = 3 - 1 = 2 => maxProfit = 4
// Day 5 (Price = 6): Profit = 6 - 1 = 5 => maxProfit = 5
// Day 6 (Price = 4): Profit = 4 - 1 = 3 => maxProfit = 5
//
// Result: maxProfit = 5

class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update the lowest price seen so far
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maximum profit
            }
        }

        return maxProfit;
    }
}

// Complexity Analysis:
// • Time Complexity: O(n) - Single pass through the array of length n.
// • Space Complexity: O(1) - Uses only constant extra space for variables `minPrice` and `maxProfit`.

// Step by Step Algorithm:
// 1. Check edge case: If `prices` is null or length <= 1, return 0.
// 2. Initialize `minPrice = Integer.MAX_VALUE` and `maxProfit = 0`.
// 3. Loop through each price `price` in array `prices`:
//    - If `price < minPrice`, set `minPrice = price`.
//    - Else if `price - minPrice > maxProfit`, set `maxProfit = price - minPrice`.
// 4. Return `maxProfit`.
