/*
 * Time complexity: O(n^2)
 *
 * Space complexity:
 * - Output: O(1) - only a fixed-size int array (length 2 or 0) is returned
 * - Auxiliary: O(1) - only a constant number of variables used (i, j, etc.)
 * - Total: O(1)
 *
 * The logic:
 * We use two nested loops to check every pair of numbers for the target sum.
 * As soon as we find a valid pair, we return their indices in a new int array of size 2.
 * No extra data structures are used except the output array (constant size).
 */

package Java.TwoSum;

public class TwoSumBruteForce {
  public static int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) { // O(n)
      for (int j = i + 1; j < nums.length; j++) { // O(n)
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[0];
  }

  private static void printNums(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6 };
    int target = 10;

    int[] output = twoSum(nums, target);
    printNums(output);
  }
}
