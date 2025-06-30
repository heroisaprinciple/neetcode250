/*
 * Time complexity: O(n + m)
 * Space complexity: O(1) because of "s and t consist of lowercase English letters."
 * With Unicode chars, it could be O(n)
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
