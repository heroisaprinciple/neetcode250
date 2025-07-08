/*
 * Time complexity: O(n)
 *   - .distinct() is O(n) (uses a HashSet internally)
 *   - .count() is O(n), but both loops are sequential so total is O(n)
 *
 * Space complexity:
 * - Output: O(1) - only a boolean is returned
 * - Auxiliary: O(n) - a HashSet is used internally by .distinct() to store unique elements
 * - Total: O(n)
 *
 * The logic:
 * We use Java Streams .distinct() to collect unique elements (using a HashSet internally).
 * If the count of distinct elements is less than the length of the input,
 * there is a duplicate.
 */

package Java.ContainsDuplicate;

import java.util.Arrays;

public class DuplicateHashSetLength {
  public static boolean hasDuplicate(int[] nums) {
    return Arrays.stream(nums).distinct().count() < nums.length;
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 3 };
    System.out.println(hasDuplicate(arr));

    int[] arr2 = { 1, 2, 3, 4 };
    System.out.println(hasDuplicate(arr2));
  }

}
