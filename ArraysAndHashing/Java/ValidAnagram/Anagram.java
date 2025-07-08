/*
 * Time complexity: O(n + m)
 *   - O(n) to build the frequency map for s
 *   - O(m) to validate t against the frequency map
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(1) - since "s and t consist of lowercase English letters", the HashMap can store at most 26 keys (constant)
 *     - With Unicode characters, it could be O(n)
 * - Total: O(1) (for English letters)
 *
 * The logic:
 * We build a HashMap of character counts from string s.
 * Then we scan t, decreasing the count in the map for each character.
 * If any count becomes negative or a char is missing, return false.
 * Only the HashMap grows, but for English letters the space is constant (max 26).
 */

package Java.ValidAnagram;

import java.util.HashMap;

public class Anagram {
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    HashMap<Character, Integer> freq = buildFreqMap(s);
    return matchesFreq(freq, t);
  }

  private static HashMap<Character, Integer> buildFreqMap(String s) {
    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) { // O(n)
      char c = s.charAt(i);
      map.put(c, map.getOrDefault(c, 0) + 1);
    }
    return map;
  }

  // if t has the same el as in hashmap, the val is decreased
  // if a char is missing or count goes below zero, it's not an anagram.
  private static boolean matchesFreq(HashMap<Character, Integer> freq, String t) {
    for (int i = 0; i < t.length(); i++) { // O(m)
      char c = t.charAt(i);
      if (!freq.containsKey(c))
        return false;

      freq.put(c, freq.get(c) - 1);
      if (freq.get(c) < 0) // for case like 'bbcc' and 'ccbc' so c would be 0, not -1
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "racecar";
    String t = "carrace";
    System.out.println(isAnagram(s, t));

    String s2 = "jar";
    String t2 = "jam";
    System.out.println(isAnagram(s2, t2));
  }
}
