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


### Q7. Remove Element

You are given an integer array `nums` and an integer `val`. Your task is to remove all occurrences of `val` from `nums` **in-place**.

After removing all occurrences of `val`, return the number of remaining elements, say `k`, such that the first `k` elements of `nums` do not contain `val`.

````
Input: nums = [0,1,2,2,3,0,4,2], val = 2

Output: [0,1,3,0,4]
````

#### Java Solution

- [RemoveEl.java](./ArraysAndHashing/Java/RemoveElement/RemoveEl.java)
  Two-pointer approach → Time: O(n); Space: O(1)

#### Python Solution

- [remove_element.py](./ArraysAndHashing/Python/RemoveElement/remove_element.py)
  Two-pointer approach → Time: O(n); Space: O(1)

-----

### Q8. Majority Element

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times in the array. You may assume that the majority element always exists in the array.

````
Input: nums = [5,5,1,1,1,5,5]

Output: 5
````

#### Java Solutions

- [MajorityElMooreVoting.java](./ArraysAndHashing/Java/MajorityElement/MajorityElMooreVoting.java)
  Moore's Voting Algo -> Time: O(n), Space: O(1).

- [MajorityElBitwise.java](./ArraysAndHashing/Java/MajorityElement/MajorityElBitwise.java)
  Bitwise Counting Approach -> Time: O(n), Space: O(1).

- [MajorityElHashMap.java](./ArraysAndHashing/Java/MajorityElement/MajorityElHashMap.java)
  HashMap Frequency Count -> Time: O(n), Space: O(n).

- [MajorityElHashMapBasic.java](./ArraysAndHashing/Java/MajorityElement/MajorityElHashMapBasic.java)
  Basic HashMap frequency implementation -> Time: O(n), Space: O(n).

- [MajorityElSort.java](./ArraysAndHashing/Java/MajorityElement/MajorityElSort.java)
  Sorting Approach -> Time: O(n log n), Space: O(n)

#### Python Solutions

- [majority_el_bitwise.py](./ArraysAndHashing/Python/MajorityElement/majority_el_bitwise.py)
  Bitwise Counting Approach -> Time: O(n), Space: O(1).

- [majority_el_hashmaps.py](./ArraysAndHashing/Python/MajorityElement/majority_el_hashmaps.py)
  HashMap Frequency Count -> Time: O(n), Space: O(n).

---

### Q9. Implement Hahset

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

````
void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
````

#### Java Solutions

- [MyHashSet.java](./ArraysAndHashing/Java/DesignHashset/MyHashSet.java)
  Brute-Force Solution -> Time: O(n), Space: O(n).

- [MyHashSetLinkedLists.java](./ArraysAndHashing/Java/DesignHashset/MyHashSetLinkedList.java)
  A Linked List Solution -> Time: O(n / k), Space: O(m + k);
  - n -> total num of keys
  - k -> the size of set
  - m -> the num of unique keys

**Insight: Always ask interviewer if ArrayList<LinkedList<Integer>> is allowed to use.
Otherwise -> do linked lists from scratch.**

---

### Q10. Implement HashMap

Design a HashMap without using any built-in hash table libraries.
Implement the MyHashMap class:

````
MyHashMap() initializes the object with an empty map.

void put(int key, int value) inserts a (key, value) pair into the HashMap. If the key already exists in the map, update the corresponding value.

int get(int key) returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key.

void remove(key) removes the key and its corresponding value if the map contains the mapping for the key.
````

#### Java Solutions

- [MyHashMapLinkedLists.java](./ArraysAndHashing/Java/DesignHashmap/MyHashMapLinkedLists.java)
  A Linked List Solution (int keys/values) -> Time: O(n / k) avg, O(n) worst; Space: O(m + k)
  - n -> total num of keys
  - k -> the size of buckets arr
  - m -> the num of unique keys

- [MyHashMapGenerics.java](./ArraysAndHashing/Java/DesignHashmap/MyHashMapGenerics.java)
  A Linked List Solution (Generic K, V) -> Time: O(n / k) avg, O(n) worst; Space: O(m + k)
  - n -> total num of keys
  - k -> the size of buckets arr
  - m -> the num of unique keys
  - Supports `null` keys/values

---

### Q11. Sort An Array

You are given an array of integers nums, sort the array in ascending order and return it.

You must solve the problem without using any built-in functions in O(nlog(n)) time complexity and with the smallest space complexity possible.

````
Example 1:

Input: nums = [10,9,1,1,1,2,3,1]

Output: [1,1,1,1,2,3,9,10]
````

This solution uses Hoare partitioning.

#### Java Solution
- [SortAnArrayQuickSort.java](./ArraysAndHashing/Java/SortAnArray/SortAnArrayQuickSort.java)
   A QuickSort implementation ->
   Time: O(n log n) average, O(n^2) worst;
   Space: O(log n) average, O(n) worst.


**A key insight: use median partition and always ask an interviewer for details.**
The link to the [manual.](https://drive.google.com/file/d/1cyeQi6BtoKCWTnzS6JwUIptBbGHahQ7T/view?usp=sharing)

---
