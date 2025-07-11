'''
 * A two pointers problem.
 *
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(1) as only int is returned
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 * The logic:
 * - n tracks the current array length (shrinking when an element is removed);
 * - If nums[i] == val, replace nums[i] with the last element and decrease n by 1;
 * - Otherwise, increment i.
 '''

from typing import List

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
      i = 0
      n = len(nums)

      while (i < n): # O(n)
        if (nums[i] == val):
          nums[i] = nums[n - 1]
          n -= 1
        else:
          i += 1
      return n

if __name__ == "__main__":
  nums = [0,1,2,2,3,0,4,2] # 5
  val = 2

  obj = Solution()
  print(obj.removeElement(nums, val))
