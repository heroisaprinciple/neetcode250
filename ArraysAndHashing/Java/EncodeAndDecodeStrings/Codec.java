/*
 * Time complexity: O(m), where:
 * - m is the amount of all characters in the strings combined
 * Space complexity: O(m + n)
 * - n is the n of strings in the input arr
 *
 *
 * The logic:
 * Doesn't matter how you incode the string, but use length of the word that
 * shows when the word starts and ends.
 * Decode func will use two pointers approach, where i is used to find the word
 * and j is for finding a delimeter, which is # here.
 * When the words are found, they are added to the list.
 *
 * Keynote: different types can be added to a StringBuilder
 * (Objects must be used with caution), that's why the error is not thrown when
 * adding an integer or a char to sb.
 * The same would happen with String (though the new String is created every time),
 * because String uses an array of characters or
 * StringBuilder underneath.
 *
 */

package Java.EncodeAndDecodeStrings;

import java.util.*;

public class Codec {
  public static String encode(String[] words) {
    StringBuilder sb = new StringBuilder();
    for (String word : words) { // O(m)
      int len = word.length();
      char delimeter = '#';
      sb.append(len).append(delimeter).append(word); // no type error
    }
    return sb.toString(); // could be new String(sb)
  }

  public static ArrayList<String> decode(String str) {
    ArrayList<String> res = new ArrayList<>();
    int i = 0;
    while (i < str.length()) { // O(m)
      int j = i;
      // look for delimeter
      while (str.charAt(j) != '#') { // O(m)
        j++;
      }

      int len = Integer.parseInt(str.substring(i, j)); // O(m)
      // find when the word starts
      i = j + 1;
      res.add(str.substring(i, i + len)); // O(m)
      // find the next word
      i = i + len;
    }
    return res;
  }

  private static void printList(ArrayList<String> words) {
    for (String word : words) {
      System.out.println(word);
    }
  }

  public static void main(String[] args) {
    String[] words = { "hello", "world" };
    String encodedStr = encode(words);
    System.out.println(encodedStr); // 5#hello5#world

    ArrayList<String> res = decode(encodedStr);
    printList(res); // hello world

  }
}
