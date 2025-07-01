/*
 * Time complexity:  O(n)
 * Space complexity: O(n) -> hashmap creation
 *
 * A HashMap is used to store numbers and their indices from the array.
 * 1) For each number, the difference (target - current number) is calculated.
 * 2) If this difference exists in the HashMap, we have found a valid pair and return their indices.
 * 3) Otherwise, we add the current number and its index to the HashMap.
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
