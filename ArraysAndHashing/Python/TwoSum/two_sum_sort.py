# Time complexity: O(n log n)
# Space complexity: O(n)

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
