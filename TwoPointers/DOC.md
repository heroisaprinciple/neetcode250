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


**Key Takeaway: Always protect character access with bounds checks (if (i < word.length())) if your loop could exceed the shorter string's length. Loop condition i < n || i < m means you must guard both strings individually. It is different with && condition.**

----------
