'''
Time complexity: O(n log n + m log m)
- Sorting s: O(n log n)
- Sorting t: O(m log m)

Space complexity:
- Output: O(1) - only a boolean is returned
- Auxiliary: O(n + m) - two new lists are created when sorting s and t
- Total: O(n + m)

The logic:
We sort both strings and compare the results for equality.
Sorting creates two new lists (copies of s and t), which dominate auxiliary space.
Only the auxiliary space for the sorted lists grows with input size; output is always a boolean.
'''

class Solution:
  def isAnagram(self, s: str, t: str) -> bool:
    if len(s) != len(t): return False

    return sorted(s) == sorted(t)

if __name__ == "__main__":
  s = "racecar"
  t = "carrace"

  s2 = "jar"
  t2 = "jam"

  obj = Solution()

  print(obj.isAnagram(s, t))
  print(obj.isAnagram(s2, t2))
