/*
 * Time complexity: O(n^2)
 * Space complexity: O(1) -> array of fixed size
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
