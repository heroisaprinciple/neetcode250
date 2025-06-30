# Time complexity: O(n + m)
# Space complexity: O(1)

class Solution:
  def isAnagram(self, s: str, t: str) -> bool:
    if len(s) != len(t): return False

    freq = {}
    for c in s:
      freq[c] = freq.get(c, 0) + 1 # freq[c]++ would assume that the key already exists

    for c in t:
      if c not in freq:
        return False;

      freq[c] -= 1
      if freq[c] < 0:
        return False

    return True

if __name__ == "__main__":
  s = "racecar"
  t = "carrace"

  s2 = "jar"
  t2 = "jam"

  obj = Solution()

  print(obj.isAnagram(s, t))
  print(obj.isAnagram(s2, t2))
