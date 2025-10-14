/*
 * Time complexity: O(n^3)
 * Space compelxity: O(m), where m is the n of unique quadruplets
 */

package FourSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSumOptimal {
  public static List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      // skip duplicates
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }
      for (int j = i + 1; j < nums.length; j++) {
        int l = j + 1;
        int r = nums.length - 1;
        // skip duplicates
        if (j > i + 1 && nums[j] == nums[j - 1]) {
          continue;
        }

        while (l < r) {
          if (nums[i] + nums[j] + nums[l] + nums[r] > target) {
            r--;
          }
          else if (nums[i] + nums[j] + nums[l] + nums[r] < target) {
            l++;
          }
          else {
            res.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
            l++;
            r--;

            while (l < r && nums[l] == nums[l - 1]) {
              l++;
            }

            while (l < r && nums[r] == nums[r + 1]) {
              r--;
            }
          }
        }
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3, -3, -1, 0 };
    fourSum(nums, 3);
  }
}
