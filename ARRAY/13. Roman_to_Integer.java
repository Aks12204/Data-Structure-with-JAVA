// 13. Roman to Integer
// https://leetcode.com/problems/roman-to-integer/

// Problem Statement:
// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
// Symbol       Value
// I            1
// V            5
// X            10
// L            50
// C            100
// D            500
// M            1000
//
// Roman numerals are usually written largest to smallest from left to right. 
// However, the numeral for four is not IIII. Instead, four is written as IV. 
// Because the one is before the five we subtract it making four. 
// The same principle applies to the number nine, which is written as IX. 
//
// There are six instances where subtraction is used:
// • I can be placed before V (5) and X (10) to make 4 and 9. 
// • X can be placed before L (50) and C (100) to make 40 and 90. 
// • C can be placed before D (500) and M (1000) to make 400 and 900.
//
// Given a roman numeral, convert it to an integer.

// Example 1:
//      Input: s = "III"
//      Output: 3
//      Explanation: III = 3.

// Example 2:
//      Input: s = "LVIII"
//      Output: 58
//      Explanation: L = 50, V = 5, III = 3.

// Example 3:
//      Input: s = "MCMXCIV"
//      Output: 1994
//      Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// Constraints:
// • 1 <= s.length <= 15
// • s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
// • It is guaranteed that s is a valid roman numeral in the range [1, 3999].

// __________________________________________________________________________________________________________
// ◽️ Approach: Left-to-Right Traversal with Subtraction Check
// __________________________________________________________________________________________________________
// Intuition:
// Normally, Roman numerals are written from largest to smallest, so values are added up.
// When a smaller value symbol appears *before* a larger value symbol (e.g., 'IV' where 1 comes before 5),
// it indicates subtraction. Thus, if current character's value < next character's value, we subtract
// current character's value from the total sum; otherwise, we add it.

// How it works:
// 1. Traverse the string `s` character by character from index 0 to `s.length() - 1`.
// 2. Obtain `currValue` for `s.charAt(i)` and `nextValue` for `s.charAt(i + 1)` (if `i + 1 < s.length()`).
// 3. If `currValue < nextValue`: subtract `currValue` from `total`.
// 4. Else: add `currValue` to `total`.
// 5. Return `total`.

// Visual Walkthrough:
// Input: s = "MCMXCIV"
//
// i = 0 ('M'): curr = 1000, next = 100  -> curr >= next => total = +1000 (1000)
// i = 1 ('C'): curr = 100,  next = 1000 -> curr < next  => total = -100  (900)
// i = 2 ('M'): curr = 1000, next = 10   -> curr >= next => total = +1000 (1900)
// i = 3 ('X'): curr = 10,   next = 100  -> curr < next  => total = -10   (1890)
// i = 4 ('C'): curr = 100,  next = 1    -> curr >= next => total = +100  (1990)
// i = 5 ('I'): curr = 1,    next = 5    -> curr < next  => total = -1    (1989)
// i = 6 ('V'): curr = 5,    next = 0    -> curr >= next => total = +5    (1994)
//
// Result: 1994

class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            int currentVal = getValue(s.charAt(i));

            // Look ahead to check if the next character has a larger value
            if (i + 1 < length && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }

        return total;
    }

    // Helper method to convert Roman character to integer value
    private int getValue(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}

// Complexity Analysis:
// • Time Complexity: O(n) - where n is the length of string `s`. Since n <= 15, this is O(1) in practice.
// • Space Complexity: O(1) - Constant extra space used.

// Step by Step Algorithm:
// 1. Initialize `total = 0`.
// 2. Iterate `i` from `0` to `s.length() - 1`:
//    - Get numerical value of `s.charAt(i)` using `getValue()`.
//    - If `i + 1 < s.length()` and `getValue(s.charAt(i)) < getValue(s.charAt(i + 1))`:
//      - Subtract current value from `total`.
//    - Else:
//      - Add current value to `total`.
// 3. Return `total`.
