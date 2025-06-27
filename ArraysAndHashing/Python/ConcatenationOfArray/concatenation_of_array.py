# Time complexity: O(n)
# Space complexity: O(n)

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
