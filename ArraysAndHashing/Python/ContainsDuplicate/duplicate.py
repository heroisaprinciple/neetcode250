# Time complexity: O(n)
# Space complexity: O(n) due to set creation

from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
      freq = set()
      for num in nums:
        if num in freq:
          return True
        freq.add(num)
      return False

if __name__ == "__main__":
    s = Solution()
    print(s.hasDuplicate([1, 2, 9, 15, 15]))
