'''
 * A sorting approach, where only the first and last strings after sorting are compared.
 * Time complexity:
 * - Average case: O(n * m log n)
 *   - Worst case: O(n * m log n)
 *     where:
 *       n = number of strings in the array
 *       m = length of the LONGEST string
 *
 * Space complexity:
 * Output space: O(k)
 * - k as the new string is created with substr (not m as it is not the longest one)
 *
 * Auxiliary space: O(n) => from sorting
 * Total: O(n + k)
'''

from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
      strs = sorted(strs)
      print(strs)
      first = strs[0]
      last = strs[-1]
      i = 0

      while (i < len(first) and i < len(last) and first[i] == last[i]):
        i += 1

      return strs[0][0:i]


if __name__ == "__main__":
    strs = ["bat","bag","bank","band"]
    s = Solution()
    print(s.longestCommonPrefix(strs)) # ba
