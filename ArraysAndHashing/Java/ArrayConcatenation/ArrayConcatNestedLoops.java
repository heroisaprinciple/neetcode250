/*
 * Time compelxity: O(n)
 * Space complexity: O(2 * n) => O(n)
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
