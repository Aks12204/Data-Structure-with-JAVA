// 14. Longest Common Prefix
// https://leetcode.com/problems/longest-common-prefix/

// Problem Statement:
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
//      Input: strs = ["flower","flow","flight"]
//      Output: "fl"

// Example 2:
//      Input: strs = ["dog","racecar","car"]
//      Output: ""
//      Explanation: There is no common prefix among the input strings.

// Constraints:
// • 1 <= strs.length <= 200
// • 0 <= strs[i].length <= 200
// • strs[i] consists of only lowercase English letters.

// __________________________________________________________________________________________________________
// ◽️ Approach: Horizontal Scanning (Prefix Reduction)
// __________________________________________________________________________________________________________
// Intuition:
// Assume the prefix is the entire first string `strs[0]`.
// Compare this `prefix` with each subsequent string `strs[i]`. As long as `strs[i]` does not start
// with `prefix`, trim the last character off `prefix`. If `prefix` becomes empty, no common prefix exists.

// How it works:
// 1. Edge Case: If `strs` is null or empty, return `""`.
// 2. Initialize `prefix = strs[0]`.
// 3. Loop through array from `i = 1` to `strs.length - 1`:
//    - While `strs[i]` does not start with `prefix` (`strs[i].indexOf(prefix) != 0`):
//      - Trim `prefix = prefix.substring(0, prefix.length() - 1)`.
//      - If `prefix` becomes empty `""`, return `""`.
// 4. Return `prefix`.

// Visual Walkthrough:
// Input: strs = ["flower", "flow", "flight"]
//
// Initial: prefix = "flower"
//
// i = 1 ("flow"):
//   - "flow".indexOf("flower") != 0 -> trim -> "flowe"
//   - "flow".indexOf("flowe")  != 0 -> trim -> "flow"
//   - "flow".indexOf("flow")   == 0 -> matched! prefix = "flow"
//
// i = 2 ("flight"):
//   - "flight".indexOf("flow") != 0 -> trim -> "flo"
//   - "flight".indexOf("flo")  != 0 -> trim -> "fl"
//   - "flight".indexOf("fl")   == 0 -> matched! prefix = "fl"
//
// Result: "fl"

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            // Trim prefix until strs[i] starts with prefix
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                // Early exit if no common prefix exists
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

// Complexity Analysis:
// • Time Complexity: O(S) - where S is the sum of all characters in all strings.
//   In the worst case, comparing N strings of length M takes O(N * M) operations.
// • Space Complexity: O(1) - Constant extra space used (excluding memory for substring prefix).

// Step by Step Algorithm:
// 1. Check edge case: If `strs` is null or empty, return `""`.
// 2. Set `prefix = strs[0]`.
// 3. For each string `strs[i]` from index 1 to length - 1:
//    - While `strs[i]` does not start with `prefix` (`indexOf(prefix) != 0`):
//      - Shorten `prefix` by 1 character from the end.
//      - If `prefix` is empty, return `""`.
// 4. Return `prefix`.
