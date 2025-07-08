/*
 * A sorting approach, where only the first and last strings after sorting are compared.
 * Time complexity:
 * - Average case: O(n * m log n)
 *   - Worst case: O(n * m log n)
 *     where:
 *       n = number of strings in the array
 *       m = length of the LONGEST string
 *
 * Space complexity:
 * Output space: O(k)
 * - k as the new string is created with substr (not m as it is not the longest one)
 *
 * Auxiliary space: O(n) => from sorting
 * Total: O(n + k)
 */

package Java.LongestCommonPrefix;

import java.util.Arrays;

public class LongestCommonPrefSort {
  public static String commonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";
    Arrays.sort(strs); // O(n * m log n)
    String first = strs[0];
    String last = strs[strs.length - 1];
    int i = 0;

    while (i < first.length() && i < last.length() &&
        first.charAt(i) == last.charAt(i)) {
      i++;
    }
    return first.substring(0, i);
  }

  public static void main(String[] args) {
    String[] strs = { "bat", "bag", "bank", "band" };
    System.out.println(commonPrefix(strs));
  }
}
