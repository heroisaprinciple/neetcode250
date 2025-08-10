'''
 * Time complexity: O(m), where:
 * - m is the amount of all characters in the strings combined
 * Space complexity: O(m + n)
 * - n is the n of strings in the input arr
 *
 * The logic:
 * Doesn't matter how you incode the string, but use length of the word that
 * shows when the word starts and ends.
 * Decode func will use two pointers approach, where i is used to find the word
 * and j is for finding a delimeter, which is # here.
 * When the words are found, they are added to the list.
 *
 '''

from typing import List

class Solution:
    def encode(self, strs: List[str]) -> str:
      res = ""
      for s in strs:
        res += str(len(s)) + "#" + s
      return res

    def decode(self, s: str) -> List[str]:
      res = []
      i = 0

      while i < len(s):
        j = i
        while (s[j] != "#"):
          j += 1

        length = int(s[i:j])
        i = j + 1
        res.append(s[i:i+length])
        i = i + length

      return res


if __name__ == "__main__":
  s = Solution()
  words = ["hello", "world"]
  string = s.encode(words)
  print(string) # 5#hello5#world

  print(s.decode(string)) # ['hello', 'world']
