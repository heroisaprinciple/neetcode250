'''
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(n) - due to the set storing up to n elements (if all unique)
 * - Total: O(n)
 *
 * The logic:
 * We use a set to track the numbers we have seen as we iterate through the input.
 * If we see a duplicate, we return True immediately. Otherwise, we return False at the end.
'''

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
