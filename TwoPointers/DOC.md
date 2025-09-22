### Q1. Reverse String

You are given an array of characters which represents a string s. Write a function which reverses a string.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

````
Input: s = ["n","e","e","t"]

Output: ["t","e","e","n"]
````

#### Solution

- [ReverseString.java](ReverseString/ReverseString.java)
  Time: O(n); Space: O(1)

------

### Q2. Valid Palindrome

Given a string s, return true if it is a palindrome, otherwise return false.

A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.

<i>Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).</i>

**You should aim for a solution with O(n) time and O(1) space, where n is the length of the input string.**

````
Example 1:

Input: s = "Was it a car or a cat I saw?"

Output: true
Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

Example 2:

Input: s = "tab a cat"

Output: false
Explanation: "tabacat" is not a palindrome.
````

<i>Constraints:</i>

- 1 <= s.length <= 1000
- s is made up of only printable ASCII characters.

#### Solution

- [ValidPalindrome.java](ValidPalindrome/ValidPalindrome.java)
  Time: O(n); Space: O(1)

----------

### Q3. Valid Palindrome II

You are given a string s, return true if the s can be a palindrome after deleting **at most** one character from it.

A palindrome is a string that reads the same forward and backward.

Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

````
Example 1:

Input: s = "aca"

Output: true
Explanation: "aca" is already a palindrome.

Example 2:

Input: s = "abbadc"

Output: false
Explanation: "abbadc" is not a palindrome and can't be made a palindrome after deleting at most one character.

Example 3:

Input: s = "abbda"

Output: true
Explanation: "We can delete the character 'd'.
````

#### Solution
- [ValidPalindromeII.java](ValidPalindromeII/ValidPalindromeII.java);
  Time: O(n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1uXIfNjumV-PRlUTPyHiJ3S8rLQYuGf_Y/view?usp=sharing)

----------

### Q4. Merge Strings Alternately

You are given two strings, word1 and word2. Construct a new string by merging them in alternating order, starting with word1 — take one character from word1, then one from word2, and repeat this process.

If one string is longer than the other, append the remaining characters from the longer string to the end of the merged result.

Return the final merged string.

````
Example 1:

Input: word1 = "abc", word2 = "xyz"

Output: "axbycz"
Example 2:

Input: word1 = "ab", word2 = "abbxxc"

Output: "aabbbxxc"
````

<i>Constraints:</i>

- 1 <= word1.length, word2.length <= 100
- word1 and word2 consist of lowercase English letters.

#### Solution

- [MergeStringsAlternatelyTwoPtrs.java](MergeSringsAlternately/MergeStringsAlternatelyTwoPtrs.java);
  Time: O(m + n); Space: O(m + n), where:
  - m is the length of word1
  - n is the length of word2

- [MergeStringsAlternatelyOnePtr.java](MergeSringsAlternately/MergeStringsAlternatelyOnePtr.java);
  Time: O(m + n); Space: O(m + n), where:
  - m is the length of word1
  - n is the length of word2

The link to the [manual.](https://drive.google.com/file/d/1LcTfkY0UUI9gguXbRfb9Rw5Td7udO2Vi/view?usp=sharing)

**Key Takeaway: Always protect character access with bounds checks (if (i < word.length())) if your loop could exceed the shorter string's length. Loop condition i < n || i < m means you must guard both strings individually. It is different with && condition.**

----------

### Q5. Merge Sorted Array

You are given two integer arrays `nums1` and `nums2`, both sorted in non-decreasing order, along with two integers `m` and `n`, where:

`m` is the number of valid elements in `nums1`,
`n` is the number of elements in `nums2`.
The array `nums1` has a total length of `(m+n)`, with the first `m` elements containing the values to be merged, and the last `n` elements set to 0 as placeholders.

Your task is to merge the two arrays such that the final merged array is also sorted in non-decreasing order and stored entirely within `nums1`.
You must modify `nums1` in-place and do not return anything from the function.

````
Example 1:

Input: nums1 = [10,20,20,40,0,0], m = 4, nums2 = [1,2], n = 2

Output: [1,2,10,20,20,40]
Example 2:

Input: nums1 = [0,0], m = 0, nums2 = [1,2], n = 2

Output: [1,2]
````

#### Solution

- [MergeSortedArrayBruteForce.java](MergeSortedArray/MergeSortedArrayBruteForce.java);
  Time: O(m + n); Space: O(m + n);
  - m is the length of arr1
  - n is the length of arr2

- [MergeSortedArraySpaceOptimal.java](MergeSortedArray/MergeSortedArraySpaceOptimal.java);
  Time: O(m + n); Space: O(1);
  - m is the length of arr1
  - n is the length of arr2

The link to the [manual.](https://drive.google.com/file/d/1ciZWDS14MwfrtgFaJiHvgdzYrBBxS7m0/view?usp=sharing)

-------

### Q6. Remove Duplicates From Sorted Array

You are given an integer array nums sorted in non-decreasing order. Your task is to remove duplicates from nums in-place so that each element appears only once.

After removing the duplicates, return the number of unique elements, denoted as k, such that the first k elements of nums contain the unique elements.

**Note:**

- The order of the unique elements should remain the same as in the original array.
- It is not necessary to consider elements beyond the first k positions of the array.
- **To be accepted, the first k elements of nums must contain all the unique elements.**
- Return k as the final result.

````
Example 1:

Input: nums = [1,1,2,3,4]

Output: [1,2,3,4]
Explanation: You should return k = 4 as we have four unique elements.

Example 2:

Input: nums = [2,10,10,30,30,30]

Output: [2,10,30]
Explanation: You should return k = 3 as we have three unique elements.
````

#### Solution

- [RemoveDupsFromSortedArr.java](RemoveDuplicatesFromSortedArray/RemoveDupsFromSortedArr.java);
  Time: O(n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1WYlplnlo-JzYHlzHOw88yR_twTkOlHQz/view?usp=sharing)

------

### Q7. Two Integer Sum II

Given an array of integers numbers that is sorted in non-decreasing order.

Return the indices (1-indexed) of two numbers, `[index1, index2]`, such that they add up to a given target number and `index1 < index2`. Note that `index1` and `index2` cannot be equal, therefore you may not use the same element twice.

There will always be exactly one valid solution.

**Your solution must use O(1) additional space.**

````
Example 1:

Input: numbers = [1,2,3,4], target = 3

Output: [1,2]
Explanation:
The sum of 1 and 2 is 3. Since we are assuming a 1-indexed array, index1 = 1, index2 = 2. We return [1, 2].
````

#### Solution
- [TwoIntsSumIIBruteForce.java](TwoIntegerSumII/TwoIntsSumIIBruteForce.java);
  Time: O(n^2); Space: O(1);

- [TwoIntegerSumII/TwoIntsSumIIOptimal.java](TwoIntegerSumII/TwoIntsSumIIOptimal.java);
  Time: O(n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1U-A4oztwh0-tBZvIbQd3CPziNu9WNbTl/view?usp=sharing)

--------
