/*
 * Time complexity: O(n log n) -> advanced sort algo
 * Space complexity:
 * - Output: O(1) - only a fixed-size int array (length 2 or 0) is returned
 * - Auxiliary: O(n) - a matrix of size n * 2 is created to store original values and indices
 * - Total: O(n)
 *
 * A two-pointer approach. A matrix of values and corresponding indices
 * is created to store original positions.
 * Here, two pointers are original values and their sum is compared with the target.
 * If sum < target, then move left pointer rightward.
 * If sum > target, then move right pointer leftward.
 * If sum == target => return the indices.
 *
 */

package Java.TwoSum;

import java.util.Arrays;
import java.util.Comparator;

public class TwoSumTwoPtr {
  public static int[] twoSum(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    int[][] numsIndicesPairs = populateMatrix(nums);
    sortByValue(numsIndicesPairs);

    while (left < right) {
      int sum = numsIndicesPairs[left][0] + numsIndicesPairs[right][0];

      if (sum == target) {
        return new int[] { Math.min(numsIndicesPairs[left][1], numsIndicesPairs[right][1]),
            Math.max(numsIndicesPairs[left][1], numsIndicesPairs[right][1]) };
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }
    return new int[0]; // could also be new int[] {}
  }

  private static int[][] populateMatrix(int[] nums) {
    int[][] numsIndicesPairs = new int[nums.length][2];

    // original values and indices: [[value, idx], [value, idx]]
    for (int i = 0; i < nums.length; i++) {
      numsIndicesPairs[i][0] = nums[i]; // store values
      numsIndicesPairs[i][1] = i; // store indices
    }
    return numsIndicesPairs;
  }

  private static void sortByValue(int[][] numsIndicesPairs) {
    Arrays.sort(numsIndicesPairs, Comparator.comparingInt(a -> a[0]));
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
