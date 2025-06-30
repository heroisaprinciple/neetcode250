/*
 * Time complexity: O(n)
 * Space complexity:  O(1)
 */

package Java.ValidAnagram;

public class AnagramOptimizedSpace {
  public static boolean isAnagram(String s, String t) {
    if (s.length() != t.length())
      return false;

    int freq[] = new int[26];
    for (int i = 0; i < s.length(); i++) {
      freq[s.charAt(i) - 'a']++; // to map char to an index using ASCII and increment count in s
      freq[t.charAt(i) - 'a']--; // to map char to an index using ASCII and decrement count in t
    }

    return checkIfZero(freq);
  }

  // check if all frequencies are 0
  private static boolean checkIfZero(int[] freq) {
    for (int val : freq) {
      if (val != 0)
        return false;
    }
    return true;
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
