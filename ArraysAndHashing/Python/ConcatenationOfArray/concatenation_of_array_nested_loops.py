'''
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(2n) - output array of length 2 * n is returned
 * - Auxiliary: O(1) - only constant extra variables (loop counters, etc.)
 * - Total: O(2n) => O(n)
 *
 * The logic:
 * We create a new array `ans` of size 2 * n and fill it with two copies of the input array,
 * using nested loops for demonstration.
 * No extra data structures are used except for the output array.
'''

from typing import List

class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
      ans = []
      for _ in range(0, 2):
        for num in nums:
          ans.append(num)

      return ans

if __name__ == "__main__":
    s = Solution()
    print(s.getConcatenation([1, 2, 1, 7]))
