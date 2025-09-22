### Q1. Concatenation of Array

You are given an integer array `nums` of length `n`.
Create an array `ans` of length `2n` where `ans[i] == nums[i]` and `ans[i + n] == nums[i]` for `0 <= i < n` (0-indexed).

#### Java Solutions
- [ArrayConcat.java](Java/ArrayConcatenation/ArrayConcat.java)
  Using loop once -> Time: O(n); Space: O(n)

- [ArrayConcatNestedLoops.java](Java/ArrayConcatenation/ArrayConcatNestedLoops.java)
  Using nested loops -> Time: O(n); Space: O(n)

#### Python Solutions
- [concatenation_of_array.py](Python/ConcatenationOfArray/concatenation_of_array.py)
  Using loop once -> Time: O(n); Space: O(n)

- [concatenation_of_array_nested_loops.py](Python/ConcatenationOfArray/concatenation_of_array_nested_loops.py)
  Using nested loops -> Time: O(n); Space: O(n)

---

### Q2. Contains Duplicate

Given an integer array `nums`, return `true` if any value appears more than once in the array.

#### Java Solutions
- [Duplicate.java](Java/ContainsDuplicate/Duplicate.java)
  HashMap implementation -> Time: O(n); Space: O(n)

- [DuplicateHashSetLength.java](Java/ContainsDuplicate/DuplicateHashSetLength.java)
  Check length --> Time: O(n); Space: O(n)

#### Python Solutions
- [duplicate.py](Python/ContainsDuplicate/duplicate.py)
  Set implementation -> Time: O(n); Space: O(n)

- [duplicate_hash_set_length.py](Python/ContainsDuplicate/duplicate_hash_set_length.py)
  Check length -> Time: O(n); Space: O(n)

---

### Q3. Valid Anagram

Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise.

An anagram is a string that contains the exact same characters as another string, but the order of characters can differ.

Constraints:
- `s` and `t` consist of lowercase English letters only.

#### Java Solutions
- [Anagram.java](Java/ValidAnagram/Anagram.java)
  HashMap frequency check -> Time: O(n + m); Space: O(1)

- [AnagramOptimizedSpace.java](Java/ValidAnagram/AnagramOptimizedSpace.java)
  Fixed-size array (26 letters) -> Time: O(n); Space: O(1)

- [AnagramSortedStrings.java](Java/ValidAnagram/AnagramSortedStrings.java)
  Sort and compare -> Time: O(n log n + m log m); Space: O(n + m)

#### Python Solutions
- [anagram_hash_maps.py](Python/ValidAnagram/anagram_hash_maps.py)
  Hash map approach -> Time: O(n + m); Space: O(1)

- [anagram_optimized_space.py](Python/ValidAnagram/anagram_optimized_space.py)
  Fixed-size array (26 letters) -> Time: O(n); Space: O(1)

- [anagram_sorted_strings.py](Python/ValidAnagram/anagram_sorted_strings.py)
  Sort and compare -> Time: O(n log n + m log m); Space: O(n + m)

---

### Q4. Two Sum

Given an array of integers `nums` and an integer `target`, return the indices `i` and `j` such that `nums[i] + nums[j] == target` and `i != j`.

You may assume that every input has exactly one solution.

Return the answer with the **smaller index first**.

#### Java Solutions
- [TwoSumBruteForce.java](Java/TwoSum/TwoSumBruteForce.java)
  Nested loops -> Time: O(n²); Space: O(1)

- [TwoSumHashmap.java](Java/TwoSum/TwoSumHashmap.java)
  HashMap lookup -> Time: O(n); Space: O(n)

- [TwoSumTwoPtr.java](Java/TwoSum/TwoSumTwoPtr.java)
  Sort + two pointers -> Time: O(n log n); Space: O(n)

#### Python Solutions
- [two_sum_hashmap.py](Python/TwoSum/two_sum_hashmap.py)
  HashMap lookup -> Time: O(n); Space: O(n)

- [two_sum_sort.py](Python/TwoSum/two_sum_sort.py)
  Sort + two pointers -> Time: O(n log n); Space: O(n)


---

### Q5. Longest Common Prefix

You are given an array of strings `strs`. Return the longest common prefix of all the strings.

If there is no common prefix, return an empty string `""`.

#### Java Solutions

- [LongestCommonPrefBruteForce.java](Java/LongestCommonPrefix/LongestCommonPrefBruteForce.java)
  Brute-force horizontal scanning -> Time: O(n × m) average, O(n × m²) worst; Space: O(m + k)

- [LongestCommonPrefVerticalScanning.java](Java/LongestCommonPrefix/LongestCommonPrefVerticalScanning.java)
  Vertical scanning -> Time: O(n × m); Space: O(k)

- [LongestCommonPrefSort.java](Java/LongestCommonPrefix/LongestCommonPrefSort.java)
  Sort and compare first/last -> Time: O(n × m log n); Space: O(n + k)

#### Python Solutions

- [vertical_scanning.py](Python/LongestCommonPrefix/vertical_scanning.py)
  Vertical scanning → Time: O(n × m); Space: O(k)

- [sort_approach.py](Python/LongestCommonPrefix/sort_approach.py)
  Sort and compare → Time: O(n × m log n); Space: O(n + k)

The link to the manual for the vertical screening [solution.](https://drive.google.com/file/d/10KCKNX-Lw6HgfXABcBhTIDV1GLBy_gw-/view?usp=sharing)

---

### Q6. Group Anagrams

Given an array of strings `strs`, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

#### Java Solutions

- [GroupAnagrams.java](Java/GroupAnagrams/GroupAnagrams.java)
  Brute-force/sort-based approach -> Time: O(n * m log m); Space: O(n * m)

- [GroupAnagramsOptimized.java](Java/GroupAnagrams/GroupAnagramsOptimized.java)
  Frequency-array optimized approach -> Time: O(n * m); Space: O(n)

#### Python Solutions

- [sort_approach.py](Python/GroupAnagrams/sort_approach.py)
  Sort-based approach -> Time: O(n * m log m); Space: O(n * m)

- [optimized_approach.py](Python/GroupAnagrams/optimized_approach.py)
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

- [RemoveEl.java](Java/RemoveElement/RemoveEl.java)
  Two-pointer approach → Time: O(n); Space: O(1)

#### Python Solution

- [remove_element.py](Python/RemoveElement/remove_element.py)
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

- [MajorityElMooreVoting.java](Java/MajorityElement/MajorityElMooreVoting.java)
  Moore's Voting Algo -> Time: O(n), Space: O(1).
  The link to the [manual.](https://drive.google.com/file/d/1iRZ8LOjcMmCltP-ZCrsLiUJTlAmRjMYq/view?usp=sharing)

- [MajorityElBitwise.java](Java/MajorityElement/MajorityElBitwise.java)
  Bitwise Counting Approach -> Time: O(n), Space: O(1).

- [MajorityElHashMap.java](Java/MajorityElement/MajorityElHashMap.java)
  HashMap Frequency Count -> Time: O(n), Space: O(n).

- [MajorityElHashMapBasic.java](Java/MajorityElement/MajorityElHashMapBasic.java)
  Basic HashMap frequency implementation -> Time: O(n), Space: O(n).

- [MajorityElSort.java](Java/MajorityElement/MajorityElSort.java)
  Sorting Approach -> Time: O(n log n), Space: O(n)

#### Python Solutions

- [majority_el_bitwise.py](Python/MajorityElement/majority_el_bitwise.py)
  Bitwise Counting Approach -> Time: O(n), Space: O(1).

- [majority_el_hashmaps.py](Python/MajorityElement/majority_el_hashmaps.py)
  HashMap Frequency Count -> Time: O(n), Space: O(n).

---

### Q9. Implement Hashset

Design a HashSet without using any built-in hash table libraries.

Implement MyHashSet class:

````
void add(key) Inserts the value key into the HashSet.
bool contains(key) Returns whether the value key exists in the HashSet or not.
void remove(key) Removes the value key in the HashSet. If key does not exist in the HashSet, do nothing.
````

#### Java Solutions

- [MyHashSet.java](Java/DesignHashset/MyHashSet.java)
  Brute-Force Solution -> Time: O(n), Space: O(n).

- [MyHashSetLinkedLists.java](Java/DesignHashset/MyHashSetLinkedList.java)
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

- [MyHashMapLinkedLists.java](Java/DesignHashmap/MyHashMapLinkedLists.java)
  A Linked List Solution (int keys/values) -> Time: O(n / k) avg, O(n) worst; Space: O(m + k)
  - n -> total num of keys
  - k -> the size of buckets arr
  - m -> the num of unique keys

- [MyHashMapGenerics.java](Java/DesignHashmap/MyHashMapGenerics.java)
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
- [SortAnArrayQuickSort.java](Java/SortAnArray/SortAnArrayQuickSort.java)
   A QuickSort implementation ->
   Time: O(n log n) average, O(n^2) worst;
   Space: O(log n) average, O(n) worst.

**A key insight: use median partition and always ask an interviewer for details.**
The link to the [manual.](https://drive.google.com/file/d/1cyeQi6BtoKCWTnzS6JwUIptBbGHahQ7T/view?usp=sharing)

#### Python Solution
- [shell_sort.py](Python/SortAnArray/shell_sort.py)
   A Shell Sort implementation ->
   Time: O(n log n) average, O(n^2) worst;
   Space: O(n)

**A key insight: time complexity depends on the gap.**
The link to the [manual.](https://drive.google.com/file/d/1AmLOVDIv5LLBmKLVA9v9U8ErO97T_HWJ/view?usp=sharing)

---

### Q12. Sort Colors

You are given an array nums consisting of n elements where each element is an integer representing a color:

````
0 represents red
1 represents white
2 represents blue
````
Your task is to sort the array in-place such that elements of the same color are grouped together and arranged in the order: red (0), white (1), and then blue (2).

#### Java Solutions
- [CountingSort.java](Java/SortColours/CountingSort.java)
  A Counting Sort implementation -> Time: O(n + k) for all cases; Space: O(1)
  - n -> the size of nums array
  - k -> the size of count array

- [ThreePtrs.java](Java/SortColours/ThreePtrs.java)
  A three pointer implementaion (True One Pass Algo) -> Time: O(n) for all cases; Space: O(1)

**A key insight: always clarify the meaning of 'one-pass'.**
Manuals:
- [Counting Sort.](https://drive.google.com/file/d/14nrjL05J2tuDcuOLEG8TrlCJVMXsRO51/view?usp=sharing)
- [SortColours.](https://drive.google.com/file/d/1JEEwuTMfJHZ9XiutKTY2ucwaKqDac32i/view?usp=sharing)

----

### Q13. Top K Frequent Elements

Given an integer array nums and an integer k, return the k most frequent elements within the array.

The test cases are generated such that the answer is always unique.

You may return the output in any order.

````
Example 1:

Input: nums = [1,2,2,3,3,3], k = 2

Output: [2,3]
````

#### Java Solutions

- [BucketSort.java](Java/TopKFrequentEls/BucketSort.java)
  A Bucket Sort implementation -> Time: O(n) for all cases, Space: O(n)

  Manuals:

  - [TopKFrequentEls.](https://drive.google.com/file/d/1Bw-o4ESsdK9nujl54fdSb7WRFTPoiPmS/view?usp=sharing)
  - [Bucket Sort.](https://drive.google.com/file/d/11Ya43IySygBdHXAJROxttGvAL0g2cuht/view?usp=sharing)

**A key insight: when the problem suggests sorting and using nested arrays or lists,
the bucket sort could be the answer; + linear time.
Though Radix Sort is a cousin of Bucket Sort, here we need nested structures and
a uniform distribution, unlike Radix Sort, which requires a base.**

-----------

### Q14. Encode and Decode String

````
Design an algorithm to encode a list of strings to a single string. The encoded string is then decoded back to the original list of strings.
Please implement encode and decode.
````

#### Java Solution

- [Codec.java](Java/EncodeAndDecodeStrings/Codec.java)
  Time: O(m); Space: O(m + n)
   - m -> the number of characters in all strings
   - n -> the number of strings

#### Python Solution
- [codec.py](Python/EncodeAndDecodeStrings/codec.py)
  Time: O(m); Space: O(m + n)
   - m -> the number of characters in all strings
   - n -> the number of strings

The link to the [manual.](https://drive.google.com/file/d/16qcUQgmjoVuIWlz1gRQc1BMHUQx7U5x7/view?usp=sharing)

How different data types work with StringBuilder: [table](https://docs.google.com/spreadsheets/d/1vjAOU2VMiWG405a6bMV2rgkSq7c1XFCxFrCoof678rg/edit?usp=sharing).

### Q15. Range Sum Query 2D Immutable

Implement the NumMatrix class:

```NumMatrix(int[][] matrix)``` Initializes the object with the integer matrix matrix.

```int sumRegion(int row1, int col1, int row2, int col2)``` Returns the sum of the elements of matrix inside the rectangle defined by its upper left corner (row1, col1) and lower right corner (row2, col2).

You must design an algorithm where sumRegion works on O(1) time complexity.

````
Input: ["NumMatrix", "sumRegion", "sumRegion", "sumRegion"]
[[[[3, 0, 1, 4, 2], [5, 6, 3, 2, 1], [1, 2, 0, 1, 5], [4, 1, 0, 1, 7], [1, 0, 3, 0, 5]]], [2, 1, 4, 3], [1, 1, 2, 2], [1, 2, 2, 4]]

Output: [null, 8, 11, 12]
````

#### Java Solutions

- [RangeSumBruteForce.java](Java/RangeSumQuery2DImmutable/RangeSumBruteForce.java)
  Time: O(n * m); Space: O(1),
    - n is the n or rows;
    - m is the n of columns;

- [2DPrefixSum.java](Java/RangeSumQuery2DImmutable/PrefixSum2D.java)
  Time: O(1); Space: O(n * m), where:
    - n is the n of rows;
    - m is the n of cols;

The link to the [manual.](https://drive.google.com/file/d/1l28laex4JQ2bIjpKxOF7EHOvvJae7478/view?usp=sharing)

**A key insight: always think if the matrix can be precomputed.**

-----

### Q16. Products of Array Except Self

Given an integer array nums, return an array output where ```output[i]```
is the product of all the elements of nums except ```nums[i]```.

Each product is guaranteed to fit in a 32-bit integer.

````
Input: nums = [1,2,4,6]

Output: [48,24,12,8]
````

#### Java Solutions
- [BruteForce.java](Java/ProductOfArrayExceptSelf/BruteForce.java)
  A Brute-Force approach -> Time: O(n^2); Space: O(n)

- [PrefixSuffixMultiplication.java](Java/ProductOfArrayExceptSelf/PrefixSuffixMultiplication.java)
  A Prefix-Suffix approach -> Time: O(n); Space: O(n)

- [PrefixSuffixMultiplicationInPlace.java](Java/ProductOfArrayExceptSelf/PrefixSuffixMultiplicationInPlace.java)
  An Optimized Prefix-Suffix approach -> Time: O(n); Space: O(n)

The link to the [manual.](https://drive.google.com/file/d/1AVB0597VD-YgVtWv7MD8EGjEDMoTNmmP/view?usp=sharing)

**A key insight: If intuition tells you to "slice" the original array, think how you can optimize the solution with additional data structures. Also, any time you’re chaining multiplications and might have to multiply “nothing” (an empty sequence), 1 is the correct neutral starting value. For example, the product of the elements to the left of the very first element in an array is an empty set; if you start with 1, the first element's final product will be correct. The same logic applies to the last element's suffix product.**

----------

### Q17. Valid Sudoku

You are given a 9 x 9 Sudoku board board. A Sudoku board is valid if the following rules are followed:

Each row must contain the digits 1-9 without duplicates.
Each column must contain the digits 1-9 without duplicates.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without duplicates.
Return ```true``` if the Sudoku board is valid, otherwise return false

<i>Note: A board does not need to be full or be solvable to be valid.</i>

````
Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","8",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: true

Input: board =
[["1","2",".",".","3",".",".",".","."],
 ["4",".",".","5",".",".",".",".","."],
 [".","9","1",".",".",".",".",".","3"],
 ["5",".",".",".","6",".",".",".","4"],
 [".",".",".","8",".","3",".",".","5"],
 ["7",".",".",".","2",".",".",".","6"],
 [".",".",".",".",".",".","2",".","."],
 [".",".",".","4","1","9",".",".","8"],
 [".",".",".",".","8",".",".","7","9"]]

Output: false
````

**Constraints:**

- board.length == 9
- board[i].length == 9
- board[i][j] is a digit 1-9 or '.'.

#### Java Solutions

- [SudokuBruteForce.java](Java/ValidSudoku/SudokuBruteForce.java)
  A Brute-Force approach ->
  - Time: O(n^2) => O(1)
  - Space: O(n) => O(1)

- [SudokuOnePass.java](Java/ValidSudoku/SudokuOnePass.java)
  A One-Pass approach ->
  - Time: O(n^2) => O(1)
  - Space: O(n) => O(1)

The link to the [manual.](https://drive.google.com/file/d/1uNUQh5t8S-P6tlWnIbTOO5DdJnDq-LF4/view?usp=sharing)

**A key insight: always think how we can utilize additional strings in similar problems. Think how we can change 3 pass to 1 pass algo. Use the optimized
approach when complex state can be encoded as strings
and when we eant to avoid overhead like
complex data structures or a lot of nested loops.
Ask yourself: "Can I encode my complex state into a unique string key?"**

````
// Instead of complex nested data structures:
Map<Integer, Map<Integer, Set<String>>> complex = new HashMap<>();

// Use simple string encoding:
Set<String> seen = new HashSet<>();
seen.add(value + "-constraint1-" + param1 + "-constraint2-" + param2);
````

----------------

### Q18. Longest Consecutive Sequence

Given an array of integers nums, return the length of the longest consecutive sequence of elements that can be formed.

A consecutive sequence is a sequence of elements in which each element is exactly 1 greater than the previous element. The elements do not have to be consecutive in the original array.

You must write an algorithm that runs in O(n) time.

````
Input: nums = [2,20,4,10,3,4,5]

Output: 4

Explanation: The longest consecutive sequence is [2, 3, 4, 5].

````

#### Java Solutions

- [LongestConsecSeq.java](Java/LongestConsecutiveSequence/LongestConsecSeq.java)
  An optimized solution using hashsets ->
  - Time: O(n);
  - Space: O(n)

___________

### Q19. Best Time to Buy and Sell Stock II

You are given an integer array prices where prices[i] is the price of a given stock on the ith day.

On each day, you may decide to buy and/or sell the stock. However, you can buy it then immediately sell it on the same day. Also, you are allowed to perform any number of transactions but can hold at most one share of the stock at any time.

Find and return the maximum profit you can achieve.

````
Example 1:

Input: prices = [7,1,5,3,6,4]

Output: 7
Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3. Total profit is 4 + 3 = 7.

Example 2:

Input: prices = [1,2,3,4,5]

Output: 4
Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4. Total profit is 4.
````

#### Java Solutions

- [BestTimeToBuyAndSellGreedy.java](Java/BestTimeToBuyAndSellStockII/BestTimeToBuyAndSellGreedy.java)
  An optimized version using greedy algorithms ->
  Time: O(n);
  Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1nVxg2jCYQpe_uhfuPasyxAGog1V_sVCi/view?usp=sharing)

**Key insight: Greedy Algos are used when:**
- **"Unlimited walks"**
- **"One at a time; Local -> Global"**

--------------

### Q20. Majority Element II

You are given an integer array nums of size n, find all elements that appear more than ⌊ n/3 ⌋ times. You can return the result in any order.

````
Example 1:

Input: nums = [5,2,3,2,2,2,2,5,5,5]

Output: [2,5]
Example 2:

Input: nums = [4,4,4,4,4]

Output: [4]
Example 3:

Input: nums = [1,2,3]

Output: []
````

#### Java Solution
- [MajorityElIIMooresVoting.java](Java/MajorityElementII/MajorityElIIMooresVoting.java);
  Time: O(n); Space: O(1)

Manuals:
- [Moore's Voting Algo in Majority El I.](https://drive.google.com/file/d/1iRZ8LOjcMmCltP-ZCrsLiUJTlAmRjMYq/view?usp=sharing)

- [Moore's Voting Algo in Majority El II.](https://drive.google.com/file/d/1b0bTySWxfrjOUx153dByVG0RBx3LZ6Tp/view?usp=sharing)

#### Comparison with the Majority El I problem.

<i>"If anyone is confused as to why are we manually checking, we are doing it because it is not guarenteed in the question that there are 2 majority elements, there can be 0,1 or 2 majority elements"</i>

Coming from this [video.](https://www.youtube.com/watch?v=vwZj1K0e9U8)

We don't do the second pass in Maj El I problem as that problem states:
**"You may assume that the majority element always exists in the array."**


----

### Q21. Subarray Sum Equals K

You are given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

````
Example 1:

Input: nums = [2,-1,1,2], k = 2

Output: 4
Explanation: [2], [2,-1,1], [-1,1,2], [2] are the subarrays whose sum is equals to k.

Example 2:

Input: nums = [4,4,4,4,4,4], k = 4

Output: 6
````

#### Java Solution

- [SubarraySumEqKBruteForce.java](Java/SubarraySumEqualsK/SubarraySumEqKBruteForce.java);
  Time: O(n^2); Space: O(1)

- [SubarraySumEqKPrefixSum.java](Java/SubarraySumEqualsK/SubarraySumEqKPrefixSum.java);
  Time: O(n); Space: O(n);

The link to the [manual.](https://drive.google.com/file/d/1kbAxkeZG1V9x6OdT5cjOWZTnzdXP2drX/view?usp=sharing)

__________

### Q22. First Missing Positive

You are given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

**You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.**

Example:

````
Example 1:

Input: nums = [-2,-1,0]

Output: 1
Example 2:

Input: nums = [1,2,4]

Output: 3
Example 3:

Input: nums = [1,2,4,5,6,3,1]

Output: 7
````

#### Java Solution
- [FirstMissingPositiveValueBruteForce.java](Java/FirstMissingPositive/FirstMissingPositiveValueBruteForce.java);
Time: O(n); Space: O(n);

- [FirstMissingPositiveValueOptimal.java](Java/FirstMissingPositive/FirstMissingPositiveValueOptimal.java);
Time: O(n); Space: O(1)

**Key insight: If there is a hashset or a hasmap in a brute-force solution,try to think on how we can change the initial array, so it would serve as a pointer system to reduce space complexity.**

The link to the [manual.](https://drive.google.com/file/d/1NVnUsxikWm9oPEiqsiDVHk10kWu3N8aD/view?usp=sharing)

---------------
