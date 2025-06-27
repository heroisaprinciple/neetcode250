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
