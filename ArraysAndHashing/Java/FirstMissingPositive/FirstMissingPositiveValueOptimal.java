/*
 * Time: O(n);
 * Space: O(1);
 *
 * The idea:
 * The requirement is to make the Space Complexity O(1).
 * The algorithm reuses the input array as a marking system.
 * At first, we'll make all negative values or values > n 1s as we don't need them.
 * Values are treated as indices.
 *
 * When we see a number like 5, we go to position val - 1 (5 - 1 = 4) and make that value negative,
 * meaning that we found the number 5 in the original array.
 *
 * After marking all numbers we've seen, we scan through the array.
 * The index of first positive value + 1 tells us which number is missing.
 *
 * The detailed explanation is in the manual.
 */

package Java.FirstMissingPositive;

public class FirstMissingPositiveValueOptimal {
  public static int firstMissingPositive(int[] nums) {
    int n = nums.length;
    int containsOne = 0;

    // traverse the array and change negative vals or vals > n to 1
    for (int i = 0; i < n; i++) {
      if (nums[i] == 1) {
        containsOne = 1;
      } else if (nums[i] <= 0 || nums[i] > n) {
        nums[i] = 1;
      }
    }

    // if does not contain 1, return 1 immediately
    if (containsOne == 0) {
      return 1;
    }

    // swap pos values to negative to indicate they were seen before
    for (int j = 0; j < n; j++) {
      // .abs bec we are using this val as an index
      int idx = Math.abs(nums[j]) - 1;
      // if val is already negative, we've seen it before
      if (nums[idx] > 0) {
        nums[idx] = -nums[idx];
      }
    }

    // the index of the first pos value + 1 would be the answer
    for (int k = 0; k < n; k++) {
      if (nums[k] > 0) {
        return k + 1;
      }
    }
    return n + 1; // for cases like [1, 2, 3] => 4
  }

  public static void main(String[] args) {
    int[] nums = { -2, -1, 0 };
    int pos = firstMissingPositive(nums);
    System.out.println(pos);
  }
}
