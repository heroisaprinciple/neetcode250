'''
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(2 * n) - output array of length 2 * n is returned
 * - Auxiliary: O(1) - only constant extra variables (n, i, etc.)
 * - Total: O(2n) => O(n)
 *
 * The logic:
 * We create a new array `ans` of size 2 * n and fill it with two copies of the input array.
 * No extra data structures are used except for the output array.
'''

from typing import List

class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
      n = len(nums)
      ans = [0] * (2 * n) # can't be empty to assign elements
      for i, num in enumerate(nums):
        ans[i] = num
        ans[i + n] = num

      return ans

if __name__ == "__main__":
    s = Solution()
    print(s.getConcatenation([1, 2, 9, 0]))
