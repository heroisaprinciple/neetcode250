'''
 * Time complexity: O(n * m), where:
 *  - n = length of the strs array
 *  - m = length of the LONGEST word
 *
 * Space complexity:
 * - Output: O(n) => only referencing input strings
 * - Auxiliary: O(n * k), where:
 *  - k = length of the key string for the frequency array (fixed, e.g., 26*4=104 for "[0, 1, 0, ...]")
 *  - Since 26 is constant, k = O(1) in practice
 *  - So overall auxiliary space is O(n)
 * - Total: O(n)
 *
 * The logic:
 * Each word is converted into a freq array of 26 integers
 * (how many times the letter appears)
 * The freq array is used as a hashmap key and words with the same n of freq
 * will become values of a hashmap
'''

from typing import List
from collections import defaultdict

class Solution:
  def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    words = defaultdict(list)

    for word in strs:
      els = [0] * 26
      for char in word:
        els[ord(char) - ord('a')] += 1 # append would add a new el to the list, not inc it
      key = tuple(els) # dict keys need to be a tuple, not list
      words[key].append(word)
    return list(words.values())

if __name__ == "__main__":
    strs = ["act","pots","tops","cat","stop","hat"]
    s = Solution()
    print(s.groupAnagrams(strs)) # [['act', 'cat'], ['pots', 'tops', 'stop'], ['hat']]
