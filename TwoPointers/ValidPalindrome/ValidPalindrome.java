/*
 * Time: O(n);
 * Space: O(1)
 *
 * The logic:
 * We'll traverse the string and compare if [i] == [j].
 * We also need to check if the value is in [A-Za-z0-9] range.
 * If the value corresponds to chars like (!@#$%^&*) or \s (space, tabs, etc),
 * the iteration is skipped.
 *
 * For the sake of adhering to O(1) in space complexity,
 * we can't simply use regex to remove unnecessary chars
 * and use .lowercase of the resulting string, as that would lead to
 * O(n) in space (a new string would be created).
 *
 */

package ValidPalindrome;

public class ValidPalindrome {
  public static boolean isPalindrome(String s) {
    int i = 0, j = s.length() - 1;

    while (i <= j) {
      // skip anything that is not alphanumeric
      if (!Character.isLetterOrDigit(s.charAt(i))) {
        i++;
        continue;
      }
      // skip anything that is not alphanumeric
      if (!Character.isLetterOrDigit(s.charAt(j))) {
        j--;
        continue;
      }
      if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "Was it a car or a cat I saw?";
    boolean res = isPalindrome(s);
    System.out.println(res);
  }
}
