# Time complexity: O(n)
# Space complexity: O(n)

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
