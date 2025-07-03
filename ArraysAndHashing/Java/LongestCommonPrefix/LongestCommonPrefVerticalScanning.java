/*
 * A vertical scanning approach
 * (each letter of word 1 is compared to the corresponding letter in other words)
 * Time complexity: O(n * m)
 * - Average case: O(n * m)
 *   - Worst case: O(n * m)
 *     where:
 *       n = number of strings in the array
 *       m = length of the SHORTEST string
 *
 * Space complexity: O(1)
 */

package Java.LongestCommonPrefix;

public class LongestCommonPrefVerticalScanning {
  public static String commonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";
    for (int i = 0; i < strs[0].length(); i++) {
      char currChar = strs[0].charAt(i);
      for (int j = 1; j < strs.length; j++) {
        if (i >= strs[j].length() || currChar != strs[j].charAt(i)) {
          return strs[0].substring(0, i);
        }
      }
    }
    return strs[0];
  }

  public static void main(String[] args) {
    String[] strs = { "bat", "bag", "bank", "band" };
    System.out.println(commonPrefix(strs));
  }

}
