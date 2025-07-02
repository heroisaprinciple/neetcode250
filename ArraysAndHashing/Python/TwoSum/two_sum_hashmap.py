# Time complexity: O(n)
# Space complexity: O(n)

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      indices = {}

      for i in range(0, len(nums)):
        substraction_res = target - nums[i]
        match = indices.get(substraction_res)
        if (match is not None):
          return [match, i]

        indices[nums[i]] = i; # if there is no match, insert

if __name__ == "__main__":
    s = Solution()
    print(s.twoSum([4, 5, 6], 10))
