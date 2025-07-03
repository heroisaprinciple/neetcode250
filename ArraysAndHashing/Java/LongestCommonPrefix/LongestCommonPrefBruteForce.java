/*
 * This is a brute-force or horizontal scanning approach.
 * Time complexity:
 *   - Average case: O(n * m)
 *   - Worst case: O(n * m^2)
 *     where:
 *       n = number of strings in the array
 *       m = length of the first string (initial prefix length)
 *
 * Explanation (worst case => if all letters are unique and substr is done every time):
 *   For each of the n strings (excluding the first),
 *   we may need to shrink the prefix character by character from length m to 0.
 *   Each call to indexOf(prefix) and substring(...) takes up to O(m),
 *   and we may perform up to m such operations per string in the worst case.
 *
 * Space complexity: O(m)
 *   - We store the prefix string, which in the worst case starts at length m and shrinks.
 *   - Since Java strings are immutable, each substring operation creates a new string.
 *
 * The logic is that:
 * If a word does not start with the current prefix,
 * we slice the prefix by one character from the end
 * and check again. This continues until a common prefix is found
 * across all strings or prefix becomes empty.
 * This version does not use StringBuilder.
 */

package Java.LongestCommonPrefix;

public class LongestCommonPrefBruteForce {
  public static String commonPrefix(String[] strs) {
    if (strs.length == 0)
      return "";
    String prefix = strs[0]; // first word
    for (int i = 1; i < strs.length; i++) {
      while (strs[i].indexOf(prefix) != 0) { // while other words do not contain word 1
        prefix = prefix.substring(0, prefix.length() - 1); // slice the string
      }
    }
    return prefix;
  }

  public static void main(String[] args) {
    String[] strs = { "bat", "bag", "bank", "band" };
    System.out.println(commonPrefix(strs));
  }
}
