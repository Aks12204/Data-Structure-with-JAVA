// 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/

// Problem Statement:
// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
//      Input: s = "Hello World"
//      Output: 5
//      Explanation: The last word is "World" with length 5.

// Example 2:
//      Input: s = "   fly me   to   the moon  "
//      Output: 4
//      Explanation: The last word is "moon" with length 4.

// Example 3:
//      Input: s = "luffy is still joyboy"
//      Output: 6
//      Explanation: The last word is "joyboy" with length 6.

// Constraints:
// • 1 <= s.length <= 10^4
// • s consists of only English letters and spaces ' '.
// • There will be at least one word in s.

// __________________________________________________________________________________________________________
// ◽️ Approach: Reverse Traversal (Right-to-Left Scan)
// __________________________________________________________________________________________________________
// Intuition:
// Since we only need the length of the *last* word, scanning the string from right to left is optimal.
// We can accomplish this in two simple steps:
// 1. Trim trailing spaces at the end of the string.
// 2. Count non-space characters until we hit a space or the start of the string.

// How it works:
// 1. Initialize pointer `i = s.length() - 1` and `length = 0`.
// 2. Loop while `i >= 0` and `s.charAt(i) == ' '`: decrement `i` (skips trailing spaces).
// 3. Loop while `i >= 0` and `s.charAt(i) != ' '`: increment `length` and decrement `i`.
// 4. Return `length`.

// Visual Walkthrough:
// Input: s = "   fly me   to   the moon  "
//
// Initial: i = 26 (pointing to trailing ' ')
//
// Step 1: Skip trailing spaces:
// i = 26 (' ') -> skip
// i = 25 (' ') -> skip
// i = 24 ('n') -> stop trailing space loop
//
// Step 2: Count characters of last word ("moon"):
// i = 24 ('n'): length = 1
// i = 23 ('o'): length = 2
// i = 22 ('o'): length = 3
// i = 21 ('m'): length = 4
// i = 20 (' '): stop counting loop
//
// Result: length = 4

class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int length = 0;

        // Step 1: Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        // Step 2: Count non-space characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}

// Complexity Analysis:
// • Time Complexity: O(n) - We traverse the string from the end at most once.
// • Space Complexity: O(1) - Constant extra space used (no extra string allocations or arrays).

// Step by Step Algorithm:
// 1. Initialize `i = s.length() - 1` and `length = 0`.
// 2. Skip any trailing whitespace by decrementing `i` while `i >= 0` and `s.charAt(i) == ' '`.
// 3. Count the last word's characters by incrementing `length` and decrementing `i` while `i >= 0` and `s.charAt(i) != ' '`.
// 4. Return `length`.
