package ValidPalindromeII;

public class ValidPalindromeII {
  static boolean validPalindrome(String s) {
    int i = 0;
    int j = s.length() - 1;
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        // return ensures the 'at most one' requirement
        return isPalindrome(s, i, j - 1) || isPalindrome(s, i + 1, j); // j - 1 guarantees we would skip the index (not
                                                                       // 3 but 2)
      }
      i++;
      j--;
    }
    return true;
  }

  static boolean isPalindrome(String s, int i, int j) {
    while (i < j) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    String s = "abbda";
    boolean res = validPalindrome(s);
    System.out.println(res);
  }
}
