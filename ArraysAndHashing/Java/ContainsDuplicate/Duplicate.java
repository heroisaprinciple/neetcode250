/*
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(n) - due to the HashMap storing up to n elements (in worst case, all unique)
 * - Total: O(n)
 *
 * The logic:
 * We use a HashMap to track the frequency of each number as we iterate through the input.
 * If we see a duplicate, we return true immediately. Otherwise, we return false at the end.
 */

package Java.ContainsDuplicate;

import java.util.HashMap;

public class Duplicate {
  public static boolean hasDuplicate(int[] nums) {
    HashMap<Integer, Integer> freq = new HashMap<>();
    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1); // .getOrDef takes O(1) time
      if (freq.get(num) > 1)
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 3 };
    System.out.println(hasDuplicate(arr));

    int[] arr2 = { 1, 2, 3, 4 };
    System.out.println(hasDuplicate(arr2));
  }
}
