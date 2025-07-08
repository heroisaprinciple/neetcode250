/*
 * Time complexity: O(n log n + m log m)
 *   - Sorting s: O(n log n)
 *   - Sorting t: O(m log m)
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(n + m) - two new char arrays are created for sorting (copies of s and t)
 * - Total: O(n + m)
 *
 * The logic:
 * We convert both strings to character arrays, sort them, and compare for equality.
 * Sorting requires O(n + m) extra space for the two arrays.
 * Only the auxiliary space for the arrays grows with input size.
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
