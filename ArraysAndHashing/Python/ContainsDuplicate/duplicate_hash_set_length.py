'''
 * Time complexity: O(n)
 *   - set(nums) is O(n) (builds a hash set)
 *   - len() checks are O(1)
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(n) - a set is created to store unique elements
 * - Total: O(n)
 *
 * The logic:
 * We use Python's set to collect unique elements.
 * If the number of unique elements is less than the length of the input,
 * there is a duplicate.
'''

from typing import List

class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
      return len(set(nums)) < len(nums)

if __name__ == "__main__":
    s = Solution()
    print(s.hasDuplicate([1, 2, 9, 15, 15]))
