/*
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
 */

package Java.GroupAnagrams;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupAnagramsOptimized {
  public static List<List<String>> groupAnagrams(String[] strs) {
    HashMap<String, List<String>> anagrams = new HashMap<>();
    for (String word : strs) {
      int[] count = new int[26];
      for (char c : word.toCharArray()) {
        count[c - 'a']++;
      }
      String key = Arrays.toString(count); // the freq array converted into a str
      System.out.println(key); // "[1, 0, 1, 0....]"
      anagrams.putIfAbsent(key, new ArrayList<>());
      anagrams.get(key).add(word);
    }
    return new ArrayList<>(anagrams.values());
  }

  public static void main(String[] args) {
    String[] strs = { "act", "pots", "tops", "cat", "stop", "hat" };
    groupAnagrams(strs);
  }
}
