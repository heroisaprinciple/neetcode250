'''
Time complexity: O(n log n)
- Sorting the matrix is O(n log n)
- The two-pointer scan is O(n)

Space complexity:
- Output: O(1) - only a fixed-size list (length 2 or 0) is returned
- Auxiliary: O(n) - a matrix of n * 2 is created to store original values and indices
- Total: O(n)

The logic:
We build a n * 2 matrix to pair each number with its original index,
then sort the matrix by value.
A two-pointer approach finds the target sum using the sorted values,
and returns the original indices.
Only the matrix grows with input size; the output is always constant size.
'''

from typing import List

class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      matrix = self.populate_matrix(nums)
      matrix.sort()

      left = 0
      right = len(nums) - 1
      while left < right:
        sum = matrix[left][0] + matrix[right][0]
        if sum == target:
          return [min(matrix[left][1], matrix[right][1]),
                  max(matrix[left][1], matrix[right][1])]
        elif sum < target:
          left += 1
        else:
          right -= 1
      return []

    def populate_matrix(self, nums: List[int]) -> List[List[int]]:
      matrix = []
      for i, n in enumerate(nums):
        matrix.append([n, i])
      return matrix

if __name__ == "__main__":
    s = Solution()
    print(s.twoSum([4, 5, 6], 10))
