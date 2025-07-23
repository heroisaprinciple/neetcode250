'''
Time complexity (both depend on a gap):
- Average case: O(n log n)
- Worst case: O(n^2)

Space complexity:
- Output: O(n) => array is returned
- Auxiliary: O(1)
- Total: O(n)

The logic:
A basic shell sort implementation.
It continues til gap reaches 1. Then the ordinary insertion sort
will happen.
'''

import math
from typing import List

class Solution:
    def sortArray(self, nums: List[int]) -> List[int]:
      n = len(nums)
      gap = math.floor(n // 2) # gap will affect the efficiency
      print(gap) # 4

      while (gap >= 1):
        # moving forward
        for j in range(gap, n):
          i = j - gap;
          # moving backwards
          while (i >= 0):
            # if order is correct, don't shift
            if (nums[i + gap] > nums[i]):
              break; # break is needed to be in if

            self._swap(nums, i + gap, i)
            i = i - gap
        gap = gap // 2 # when j is at the end; divide the gap by 2 again
      return nums

    # a private method
    def _swap(self, nums, gapped, i):
      temp = nums[i]
      nums[i] = nums[gapped]
      nums[gapped] = temp

if __name__ == "__main__":
  nums = [23, 29, 15, 19, 31, 7, 9, 5, 2]
  obj = Solution()
  print(obj.sortArray(nums))
