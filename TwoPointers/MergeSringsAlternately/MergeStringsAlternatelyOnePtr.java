/*
 * Time: O(m + n);
 * - m is the length of word1
 * - n is the length of word2
 *
 * Space: O(m + n) -> stringbuilder stores els from both words
 */

package MergeSringsAlternately;

public class MergeStringsAlternatelyOnePtr {
  static String mergeAlternately(String word1, String word2) {
    int n = word1.length();
    int m = word2.length();

    int i = 0;

    StringBuilder sb = new StringBuilder();

    // OR needs an if statement to check the indices in the range
    // as we check either word1 or word2.
    // otherwise the index out of bound error would be thrown;
    // that's why two ptr approach with && is safer
    while (i < n || i < m) {
      if (i < n)
        sb.append(word1.charAt(i));
      if (i < m)
        sb.append(word2.charAt(i));

      i++;
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
