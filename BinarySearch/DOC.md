### Binary Search

You are given an array of distinct integers nums, **sorted in ascending order**, and an integer target.

Implement a function to search for target within nums. If it exists, then return its index, otherwise, return -1.

Your solution must run in O(logn) time.

````
Example 1:

Input: nums = [-1,0,2,4,6,8], target = 4

Output: 3
Example 2:

Input: nums = [-1,0,2,4,6,8], target = 3

Output: -1
````

**Constraints:**

- 1 <= nums.length <= 10000.
- -10000 < nums[i], target < 10000
- **All the integers in nums are unique.**

#### Solution

- [BinSearchIterative.java](./BinarySearch/BinSearchIterative.java);
  Iterative solution;
  Time: O(log n); Space: O(1);

- [BinSearchRecursive.java](./BinarySearch/BinSearchRecursive.java);
  Recursive solution;
  Time: O(log n); Space: O(log n);

- [BinSearchBuiltIn.java](./BinarySearch/BinSearchBuiltIn.java);
  This solution uses a built-in `Arrays.binarySearch(arr, t)` method;
  Time: O(log n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1nTQQmTgUPSmdqwPS8F44FGJaRnoAluYA/view?usp=sharing)

**Key insight: An array should always be sorted.**

____________

### Search Insert Position

You are given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

````
Example 1:

Input: nums = [-1,0,2,4,6,8], target = 5

Output: 4
Example 2:

Input: nums = [-1,0,2,4,6,8], target = 10

Output: 6
````

#### Solution

- [BinSearch.java](./SearchInsertPosition/BinSearch.java);
  Time: O(log n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1veQmMQtjfvcJzcUglxbMbxBK4wTXN1DB/view?usp=sharing)

The video referenced:
- [Search Insert Position.](https://www.youtube.com/watch?v=HOvFyOJGKig)

------------

### Guess Number Higher Or Lower

We are playing the Guess Game. The game is as follows:

I pick a number from 1 to n. You have to guess which number I picked.

Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

**You call a pre-defined API int guess(int num), which returns three possible results:**

- 0: your guess is equal to the number I picked (i.e. num == pick).
- -1: Your guess is higher than the number I picked (i.e. num > pick).
- 1: Your guess is lower than the number I picked (i.e. num < pick).
- Return the number that I picked.

**(In the original leetcode problem, int guess(int num)) is hidden.**

Example 1:

````
Input: n = 5, pick = 3

Output: 3
````
#### Solution

- [GuessNumHigherOrLower.java](./GuessNumber/GuessNumHigherOrLower.java);
  Time: O(log n), Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1PmhyQ9DSFPjj00ZOY0IsdxIZvZ4kPUhA/view?usp=sharing)

____________

### Sqrt(x)

You are given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

<i>For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.</i>

````
Example 1:

Input: x = 9

Output: 3
Example 2:

Input: x = 13

Output: 3
````

#### Solution

- [Sqrt.java](./Sqrt/Sqrt.java);
  Brute-Force solution, Time: O(sqrt(n)); Space: O(1)

- [SqrtBinSearch.java](./Sqrt/SqrtBinSearch.java);
  Bin Search solution; Time: O(log n); Space: O(1)

The link to the [manual.](https://drive.google.com/file/d/1sbdgvpHE2a12RNYxu4sxvdIsARo09yrZ/view?usp=sharing)

--------------
