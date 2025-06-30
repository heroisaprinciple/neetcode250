# Time complexity: O(n log n + m log m)
# Space complexity: O(n + m)

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
