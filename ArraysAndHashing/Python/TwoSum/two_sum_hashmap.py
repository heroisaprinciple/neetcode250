'''
Time complexity: O(n)

Space complexity:
- Output: O(1) - only a fixed-size list (length 2) is returned
- Auxiliary: O(n) - a dictionary (hash map) stores up to n items (number-to-index mapping)
- Total: O(n)

The logic:
We use a dictionary to store numbers and their indices as we iterate through the array.
For each number, we check if (target - number) exists in the dictionary.
If it does, we return their indices; otherwise, we add the current number and its index.
Only the dictionary (auxiliary) grows with input size; the output is always a fixed-size list.
'''

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
