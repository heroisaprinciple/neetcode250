# NeetCode 250

A set of solutions to the [NeetCode 250](https://neetcode.io/practice) problems.

There are **Java** and **Python** implementations.

---

## Chapter 1. Arrays and Hashing

### Q1. Concatenation of Array

You are given an integer array `nums` of length `n`.
Create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (0-indexed).

#### Java Solutions
- [ArrayConcat.java](./ArraysAndHashing/Java/ArrayConcatenation/ArrayConcat.java)
  Using loop once -> Time: O(n); Space: O(n)

- [ArrayConcatNestedLoops.java](./ArraysAndHashing/Java/ArrayConcatenation/ArrayConcatNestedLoops.java)
  Using nested loops -> Time: O(n); Space: O(n)

#### Python Solutions
- [concatenation_of_array.py](./ArraysAndHashing/Python/ConcatenationOfArray/concatenation_of_array.py)
  Using loop once -> Time: O(n); Space: O(n)

- [concatenation_of_array_nested_loops.py](./ArraysAndHashing/Python/ConcatenationOfArray/concatenation_of_array_nested_loops.py)
  Using nested loops -> Time: O(n); Space: O(n)

---

### Q2. Contains Duplicate

Given an integer array `nums`, return `true` if any value appears more than once in the array.

#### Java Solutions
- [Duplicate.java](./ArraysAndHashing/Java/ContainsDuplicate/Duplicate.java)
  HashMap implementation -> Time: O(n); Space: O(n)

- [DuplicateHashSetLength.java](./ArraysAndHashing/Java/ContainsDuplicate/DuplicateHashSetLength.java)
  Check length --> Time: O(n); Space: O(n)

#### Python Solutions
- [duplicate.py](./ArraysAndHashing/Python/ContainsDuplicate/duplicate.py)
  Set implementation -> Time: O(n); Space: O(n)

- [duplicate_hash_set_length.py](./ArraysAndHashing/Python/ContainsDuplicate/duplicate_hash_set_length.py)
  Check length -> Time: O(n); Space: O(n)

---

### Q3. Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a string that contains the exact same characters as another string, but the order of characters can differ.

Constraints:
- `s` and `t` consist of lowercase English letters only.

#### Java Solutions
- [Anagram.java](./ArraysAndHashing/Java/ValidAnagram/Anagram.java)
  HashMap frequency check -> Time: O(n + m); Space: O(1)

- [AnagramOptimizedSpace.java](./ArraysAndHashing/Java/ValidAnagram/AnagramOptimizedSpace.java)
  Fixed-size array (26 letters) -> Time: O(n); Space: O(1)

- [AnagramSortedStrings.java](./ArraysAndHashing/Java/ValidAnagram/AnagramSortedStrings.java)
  Sort and compare -> Time: O(n log n + m log m); Space: O(n + m)

#### Python Solutions
- [anagram_hash_maps.py](./ArraysAndHashing/Python/ValidAnagram/anagram_hash_maps.py)
  Hash map approach -> Time: O(n + m); Space: O(1)

- [anagram_optimized_space.py](./ArraysAndHashing/Python/ValidAnagram/anagram_optimized_space.py)
  Fixed-size array (26 letters) -> Time: O(n); Space: O(1)

- [anagram_sorted_strings.py](./ArraysAndHashing/Python/ValidAnagram/anagram_sorted_strings.py)
  Sort and compare -> Time: O(n log n + m log m); Space: O(n + m)

---

### Q4. Two Sum

Given an array of integers `nums` and an integer `target`, return the indices `i` and `j` such that `nums[i] + nums[j] == target` and `i != j`.

You may assume that every input has exactly one solution.

Return the answer with the **smaller index first**.

#### Java Solutions
- [TwoSumBruteForce.java](./ArraysAndHashing/Java/TwoSum/TwoSumBruteForce.java)
  Nested loops -> Time: O(n²); Space: O(1)

- [TwoSumHashmap.java](./ArraysAndHashing/Java/TwoSum/TwoSumHashmap.java)
  HashMap lookup -> Time: O(n); Space: O(n)

- [TwoSumTwoPtr.java](./ArraysAndHashing/Java/TwoSum/TwoSumTwoPtr.java)
  Sort + two pointers -> Time: O(n log n); Space: O(n)

#### Python Solutions
- [two_sum_hashmap.py](./ArraysAndHashing/Python/TwoSum/two_sum_hashmap.py)
  HashMap lookup -> Time: O(n); Space: O(n)

- [two_sum_sort.py](./ArraysAndHashing/Python/TwoSum/two_sum_sort.py)
  Sort + two pointers -> Time: O(n log n); Space: O(n)


---

### Q5. Longest Common Prefix

You are given an array of strings `strs`. Return the longest common prefix of all the strings.

If there is no common prefix, return an empty string `""`.

#### Java Solutions

- [LongestCommonPrefBruteForce.java](./ArraysAndHashing/Java/LongestCommonPrefix/LongestCommonPrefBruteForce.java)
  Brute-force horizontal scanning -> Time: O(n × m) average, O(n × m²) worst; Space: O(m + k)

- [LongestCommonPrefVerticalScanning.java](./ArraysAndHashing/Java/LongestCommonPrefix/LongestCommonPrefVerticalScanning.java)
  Vertical scanning -> Time: O(n × m); Space: O(k)

- [LongestCommonPrefSort.java](./ArraysAndHashing/Java/LongestCommonPrefix/LongestCommonPrefSort.java)
  Sort and compare first/last -> Time: O(n × m log n); Space: O(n + k)

#### Python Solutions

- [vertical_scanning.py](./ArraysAndHashing/Python/LongestCommonPrefix/vertical_scanning.py)
  Vertical scanning → Time: O(n × m); Space: O(k)

- [sort_approach.py](./ArraysAndHashing/Python/LongestCommonPrefix/sort_approach.py)
  Sort and compare → Time: O(n × m log n); Space: O(n + k)

---

### Q6. Group Anagrams

Given an array of strings `strs`, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

#### Java Solutions

- [GroupAnagrams.java](./ArraysAndHashing/Java/GroupAnagrams/GroupAnagrams.java)
  Brute-force/sort-based approach -> Time: O(n * m log n); Space: O(n * m)

- [GroupAnagramsOptimized.java](./ArraysAndHashing/Java/GroupAnagrams/GroupAnagramsOptimized.java)
  Frequency-array optimized approach -> Time: O(n * m); Space: O(n)

#### Python Solutions

- [sort_approach.py](./ArraysAndHashing/Python/GroupAnagrams/sort_approach.py)
  Sort-based approach -> Time: O(n * m log n); Space: O(n * m)

- [optimized_approach.py](./ArraysAndHashing/Python/GroupAnagrams/optimized_approach.py)
  Frequency-array optimized approach -> Time: O(n * m); Space: O(n)

---
