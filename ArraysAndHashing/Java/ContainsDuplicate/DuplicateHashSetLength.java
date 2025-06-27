/*
 * Time complexity: O(n) + O(n) => O(n)
 * .distinct() leads to linear time as it has internal loop
 * same goes for .count()
 *
 * Space complexity: O(n) due to hashset creation with .distinct()
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
