'''
Time complexity: O(n)

Space complexity:
- Output: O(1) - only a boolean is returned
- Auxiliary: O(1) - fixed-size list of 26 integers (letter counts)
- Total: O(1)

The logic:
We use a fixed-size list (length 26) to track character counts.
We increment for each character in s and decrement for each in t.
If all frequencies are zero at the end, s and t are anagrams.
All extra space is constant, regardless of input size.
'''

class Solution:
  def isAnagram(self, s: str, t: str) -> bool:
    if len(s) != len(t): return False

    freq = [0] * 26;
    for i in range(0, len(s)):
      freq[ord(s[i]) - ord('a')] += 1
      freq[ord(t[i]) - ord('a')] -= 1

    return self.checkIfZero(freq)

  def checkIfZero(self, freq):
    for val in freq:
      if val != 0:
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
