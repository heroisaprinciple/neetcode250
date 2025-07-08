/*
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(2 * n) - output array of length 2 * n is returned
 * - Auxiliary: O(1) - only constant extra variables (n, idx, i, etc.)
 * - Total: O(2n) => O(n)
 *
 * The logic:
 * We create a new array `ans` of size 2 * n and fill it with two copies of the input array,
 * using nested loops for demonstration.
 * No extra data structures are used except for the output array.
 */

package Java.ArrayConcatenation;

import java.util.Arrays;

public class ArrayConcatNestedLoops {
  public static int[] getConcatenation(int[] nums) {
    int n = nums.length;
    int[] ans = new int[2 * n];

    for (int idx = 0; idx < 2; idx++) {
      for (int i = 0; i < n; i++) {
        ans[idx * n + i] = nums[i];
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 4, 1, 3, 8 };
    System.out.println(Arrays.toString(getConcatenation(nums)));
  }

}
