/*
 * Time complexity: O(n log n)
 * Space complexity:
 * - Auxiliary: O(n) => due to .sort that creates a recursion tree
 * - Output: O(1)
 * - Total: O(n)
 *
 * The logic:
 * Sort the array and find the middle element. Why?
 * Because, if an element appears more than half (n / 2) the time, it will always
 * "cover" the middle index, regardless of array order.
 */

package Java.MajorityElement;

import java.util.Arrays;

public class MajorityElSort {
  public static int majorityElement(int[] nums) {
    int n = nums.length;
    Arrays.sort(nums); // O(n log n)

    return nums[n / 2];
  }

  public static void main(String[] args) {
    int[] nums = { 5, 5, 1, 1, 1, 5, 5 }; // 5
    System.out.println(majorityElement(nums));
  }

}
