/*
 * Time: O(m + n);
 * - m is the length of word1
 * - n is the length of word2
 *
 * Space: O(m + n) -> stringbuilder stores els from both words
 */

package MergeSringsAlternately;

public class MergeStringsAlternatelyTwoPtrs {
  static String mergeAlternately(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();

    int i = 0;
    int j = 0;

    StringBuilder sb = new StringBuilder();

    while (i < n && j < m) {
      sb.append(word1.charAt(i));
      sb.append(word2.charAt(j));

      i++;
      j++;
    }

    if (i < n) {
      // each letter is added as an element to sb, not the entire substring as one
      // element
      sb.append(word1.substring(i));
    }

    if (j < m) {
      sb.append(word2.substring(j));
    }

    return sb.toString();

  }

  public static void main(String[] args) {
    String word1 = "ab";
    String word2 = "abbxxc";
    String res = mergeAlternately(word1, word2);
    System.out.println(res);
  }
}
