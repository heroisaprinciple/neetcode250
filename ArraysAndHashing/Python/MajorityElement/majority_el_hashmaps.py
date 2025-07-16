'''
/*
 * Time complexity: O(n) + O(n) => O(n)
 * Space complexity:
 * - Output: O(1) => int is returned
 * - Auxiliary space: O(n)
 * - Total: O(n)
 *
 * The logic:
 * Add all numbers to the hashmap and return the key that has the
 * largest occurrences value
 *
 * P.S Cases like [4, 4, 2, 2] are not tested here as those are not Leetcode testcases
 */
'''

from collections import defaultdict
from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
      occurrences = defaultdict(int)
      maxCount = 0
      res = 0

      for _, n in enumerate(nums):
        count = occurrences.get(n, 0) + 1
        occurrences[n] = count
        if (count > maxCount):
          maxCount = count
          res = n
      return res

if __name__ == "__main__":
  nums = [5,5,1,1,1,5,5] # 5

  obj = Solution()
  print(obj.majorityElement(nums))
