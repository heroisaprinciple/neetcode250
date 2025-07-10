/*
 * A two pointer problem.
 *
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(1) as only int is returned
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 * The logic:
 * As modification in-place is needed, then we'll need to change the array
 * by tracking i and k (points to the new position);
 * if val is not nums[i] => perform substitution (if not val, swapped with itself)
 */

package Java.RemoveElement;

import java.util.stream.IntStream;

class Solution {
  public static int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) { // O(n)
      if (val != nums[i]) {
        nums[k] = nums[i]; // perform in-place substitution
        k++;
      }
    }
    return k;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int val = 2;
    System.out.println(removeElement(nums, val)); // [0, 1, 3, 0, 4] => 5
  }
}
