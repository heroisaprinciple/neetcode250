'''
/*
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(1) due to int return
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 * The logic:
 * There is no need to convert nums to binary manually.
 *
 * Each el of the arr is converted to binary (bitwise operations) and masked with
 * (1 << i).
 * This is happening because we need to count all occurrences of 1 at each bit.
 * For ins (i = 0):
 * 2 => 0 1 0
 * 3 => 0 1 1
 * 4 => 1 0 0
 * 3 => 0 1 1
 * 3 => 0 1 1
 *
 * At bit 0: three 1s; since 3 > n/2, set 1 at bit 0 in result.
 * At bit 1: four 1s; since 4 > n/2, set 1 at bit 1 in result.
 * At bit 2: one 1; 1 < n/2, so set 0 at bit 2 in result.
 *
 * result = 011 => 3
 *
 */
'''

from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
      bits = [0] * 32
      n = len(nums)
      res = 0

      # convert to bits, increment the count of 1s in bits
      for num in nums:
        for i in range(32):
          if (num & (1 << i) != 0):
            bits[i] += 1

      for j in range(32):
        if (bits[j] > n // 2):
          res |= (1 << j) # if count > n/2 => set 1 at i (bit i) in result

      return res

if __name__ == "__main__":
  nums = [5,5,1,1,1,5,5] # 5

  obj = Solution()
  print(obj.majorityElement(nums))
