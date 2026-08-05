# ☕ Data Structures & Algorithms with Java

[![Java](https://img.shields.io/badge/Java-17%2B-orange.svg)](https://www.oracle.com/java/)
[![LeetCode Solutions](https://img.shields.io/badge/LeetCode-Solutions-blue.svg)](https://leetcode.com/)
[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](LICENSE)

A comprehensive, clean, and well-structured repository containing Data Structures and Algorithms (DSA) problem solutions in **Java**. Each solution includes detailed problem statements, intuition, code walkthroughs, edge cases, and time/space complexity analysis.

---

## 📌 Table of Contents

- [Overview](#-overview)
- [Repository Structure](#-repository-structure)
- [Problem Index](#-problem-index)
  - [Array Problems](#array-problems)
  - [Two Pointers Problems](#two-pointers-problems)
- [Solution Blueprint](#-solution-blueprint)
- [Getting Started](#-getting-started)
- [Topics & Roadmap](#-topics--roadmap)
- [Contributing & License](#-contributing--license)

---

## 🔍 Overview

This repository serves as a practical guide for mastering DSA using Java. Solutions are organized topically to aid learning and interview preparation. 

Key features of each solution:
- 📝 **Full Problem Statement & Constraints**: Sourced from platforms like LeetCode.
- 💡 **Multiple Approaches**: Ranging from brute-force to optimal solutions.
- ⏱️ **Time & Space Complexity**: Detailed Big-O analysis for each approach.
- 💻 **Clean Java Code**: Production-grade, well-commented code following Java best practices.

---

## 📂 Repository Structure

```text
DATA STRUCTURE WITH JAVA/
│
├── 📂 ARRAY/
│   ├── 📄 13. Roman_to_Integer.java
│   ├── 📄 26. Remove_Duplicates_from_Sorted_Array.java
│   ├── 📄 27. Remove_Element.java
│   ├── 📄 121. Best_Time_to_Buy_and_Sell_Stock.java
│   ├── 📄 150. Merge_Sort_Array.java
│   └── 📄 169. Majority_Element.java
│
├── 📂 TWO_POINTERS/
│   └── 📄 27. Remove_Element.java
│
└── 📄 README.md
```

---

## 📊 Problem Index

### Array Problems

| # | Problem Title | Difficulty | Optimal Approach | Time Complexity | Space Complexity | Solution File |
|---|---------------|------------|------------------|-----------------|------------------|---------------|
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | 🟢 Easy | Left-to-Right Scan with Subtraction Check | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/13.%20Roman_to_Integer.java) |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | 🟢 Easy | Two-Pointer Technique | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/26.%20Remove_Duplicates_from_Sorted_Array.java) |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | 🟢 Easy | Two Pointers (In-place) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/27.%20Remove_Element.java) |
| 88 / 150 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | 🟢 Easy | Three Pointers (Backward Merge) | $\mathcal{O}(M + N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/150.%20Merge_Sort_Array.java) |
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | 🟢 Easy | Single Pass (Min Price Tracking) | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/121.%20Best_Time_to_Buy_and_Sell_Stock.java) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | 🟢 Easy | Boyer-Moore Voting Algorithm | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/ARRAY/169.%20Majority_Element.java) |

### Two Pointers Problems

| # | Problem Title | Difficulty | Optimal Approach | Time Complexity | Space Complexity | Solution File |
|---|---------------|------------|------------------|-----------------|------------------|---------------|
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | 🟢 Easy | Two-Pointer In-Place Filtering | $\mathcal{O}(N)$ | $\mathcal{O}(1)$ | [Code](file:///c:/Users/ans98/OneDrive/Desktop/DATA%20STRUCTURE%20WITH%20JAVA/TWO_POINTERS/27.%20Remove_Element.java) |

---

## 🛠️ Solution Blueprint

Each Java solution file in this repository follows a consistent, standardized layout:

1. **Header & Metadata**: Problem number, title, and LeetCode link.
2. **Problem Description & Examples**: Full text along with sample inputs/outputs and constraints.
3. **Approach Explanation**: Step-by-step intuition behind the algorithm.
4. **Complexity Analysis**: Explicit Time and Space bounds.
5. **Java Implementation**: Executable code snippet with test driver main methods.

---

## 🚀 Getting Started

### Prerequisites

Ensure you have Java JDK 11 or higher installed.

```bash
java -version
javac -version
```

### Running Solutions Locally

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/Aks12204/Data-Structure-with-JAVA.git
   cd Data-Structure-with-JAVA
   ```

2. **Compile and Run a Specific Problem**:
   ```bash
   # Example: Compile and run Remove Duplicates solution
   javac "ARRAY/26. Remove_Duplicates_from_Sorted_Array.java"
   java "ARRAY/26. Remove_Duplicates_from_Sorted_Array"
   ```

---

## 🗺️ Topics & Roadmap

- [x] **Array**
- [x] **Two Pointers**
- [ ] **Sliding Window**
- [ ] **Linked List**
- [ ] **Stack & Queue**
- [ ] **Binary Search**
- [ ] **Trees & Binary Search Trees**
- [ ] **Graphs**
- [ ] **Dynamic Programming**

---

## 📜 License

This repository is licensed under the [MIT License](LICENSE).
