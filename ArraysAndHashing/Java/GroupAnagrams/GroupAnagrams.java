/*
 * Time complexity: O(n * m log m), where:
 *  - n = length of the strs array
 *  - m = length of the LONGEST word
 * Since we have an array of strings that don't have equal length,
 * the time complexity will be O(n * m log m), where m is the length of
 * the longest string; .sort() depends of the length of the
 * string, so we are using the longest one.
 *
 * Space complexity:
 * - Output space: O(n) => n references to input strings
 * - (not n * m as we are not copying them)
 * - Auxiliary space: O(n * m) => up to n, each m long in hashmap
 * - Total: O(n * m)
 *
 * The logic:
 * Each sorted word is a key in the hashmap, and the original words
 * (not sorted) that match that sorted key are added to a list -> the value.
 */

package Java.GroupAnagrams;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

class GroupAnagram {
  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> anagrams = new HashMap<>();
    for (String word : strs) {
      char[] charArr = word.toCharArray();
      Arrays.sort(charArr); // O(n * m log m)
      String sorted = new String(charArr);

      if (!anagrams.containsKey(sorted)) {
        anagrams.put(sorted, new ArrayList<>());
      }
      anagrams.get(sorted).add(word);
    }
    // anagrams.values() returns a list of values (that are lists)
    // ArrayList will simply convert this collection
    return new ArrayList<>(anagrams.values());
  }

  public static void main(String[] args) {
    String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
    groupAnagrams(strs);
  }
}
