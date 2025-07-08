'''
Time complexity: O(n + m)

Space complexity:
- Output: O(1) - only a boolean is returned
- Auxiliary: O(n) - a dictionary may store up to n unique characters from s
  (If the alphabet is fixed, e.g., lowercase English, auxiliary is O(1))
- Total: O(n)

The logic:
We build a frequency dictionary from s, counting occurrences of each character.
For each character in t, we decrement the count in freq.
If a character is missing or its count drops below zero, return False.
Only the dictionary grows with the input size; output is just a boolean.
'''

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
