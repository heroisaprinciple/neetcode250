'''
 * Time complexity: O(n * m log m), where:
 *  - n = length of the strs array
 *  - m = length of the LONGEST word
 * Since we have an array of strings that don't have equal length,
 * the time complexity will be O(n * m log m), where m is the length of
 * the longest string; .sort() depends of the length of the
 * string, so we are using the longest one.

 * Space complexity:
 * - Output space: O(n) => n references to input strings
 * - (not n * m as we are not copying them)
 * - Auxiliary space: O(n * m) => up to n, each m long in hashmap
 * - Total: O(n * m)
 *
 * The logic:
 * Each sorted word is a key in the hashmap, and the original words
 * (not sorted) that match that sorted key are added to a list -> the value.
 *
 *
 * Using [] instead of list() would lead to
 * [dict_values([['act', 'cat'], ['pots', 'tops', 'stop'], ['hat']])] on return
 * => (a list containing a dict_values object);
 * list() unpacks the dict_values object into a flat list of grouped anagrams
'''

from typing import List
from collections import defaultdict

class Solution:
  def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    new_strs = sorted(strs)
    print(new_strs)
    words = defaultdict(list) # automatically initializes a new list for any key

    for word in strs:
      key = ''.join(sorted(word))
      words[key].append(word) # no need to check if key exists due to defaultdict(list)
    return list(words.values())

if __name__ == "__main__":
    strs = ["act","pots","tops","cat","stop","hat"]
    s = Solution()
    print(s.groupAnagrams(strs)) # [['act', 'cat'], ['pots', 'tops', 'stop'], ['hat']]
