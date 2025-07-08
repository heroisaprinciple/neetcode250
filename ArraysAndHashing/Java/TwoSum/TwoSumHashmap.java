/*
 * Time complexity: O(n)
 *
 * Space complexity:
 * - Output: O(1) - only a fixed-size int array (length 2 or 0) is returned
 * - Auxiliary: O(n) - a HashMap stores up to n elements (number-to-index mapping)
 * - Total: O(n)
 *
 * The logic:
 * We use a HashMap to store numbers and their indices as we iterate through the array.
 * For each number, we check if (target - number) exists in the HashMap.
 * If it does, we return their indices. If not, we store the current number and its index.
 * Only the HashMap (auxiliary) grows with input size; the output is always a fixed-size array.
 */

package Java.TwoSum;

import java.util.HashMap;

public class TwoSumHashmap {
  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> indices = new HashMap<>();
    for (int i = 0; i < nums.length; i++) { // O(n)
      int substractionRes = target - nums[i];
      if (indices.containsKey(substractionRes)) {
        return new int[] { indices.get(substractionRes), i };
      }
      indices.put(nums[i], i);
    }
    return new int[] {};
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
