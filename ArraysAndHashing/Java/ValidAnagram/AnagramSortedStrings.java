/*
 * Time complexity: O(n log n + m log m)
 * Space complexity: O(n + m)
 */

package Java.ValidAnagram;

import java.util.Arrays;

public class AnagramSortedStrings {
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    char[] sortedCharsOfS = s.toCharArray();
    char[] sortedCharsOfT = t.toCharArray();
    Arrays.sort(sortedCharsOfS);
    Arrays.sort(sortedCharsOfT);
    return Arrays.equals(sortedCharsOfS, sortedCharsOfT);
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
