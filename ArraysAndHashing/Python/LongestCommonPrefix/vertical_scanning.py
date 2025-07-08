'''
 * A vertical scanning approach
 * (each letter of word 1 is compared to the corresponding letter in other words)
 * Time complexity: O(n * m)
 * - Average case: O(n * m)
 *   - Worst case: O(n * m)
 *     where:
 *       n = number of strings in the array
 *       m = length of the SHORTEST string
 *
 * Space complexity:
 * Output space: O(k)
 * - k as the new str is created with substr
 *
 * Auxiliary: O(1)
 * Total: O(k)
'''

from typing import List

class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        for i, _ in enumerate(strs[0]):
            for j in range(1, len(strs)):
                if (i >= len(strs[j]) or strs[j][i] != strs[0][i]):
                    return strs[0][0:i]
        return strs[0]

if __name__ == "__main__":
    strs = ["bat","bag","bank","band"]
    s = Solution()
    print(s.longestCommonPrefix(strs)) # ba
