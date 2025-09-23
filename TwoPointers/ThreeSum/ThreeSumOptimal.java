/*
 * Time complexity: O(n^2)
 * Space complexity: O(m), where m is the n of unique triplets
 */

package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumOptimal {
  public static List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    // not Set, because we'll handle duplicates with pointers
    List<List<Integer>> res = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int j = i + 1;
      int k = nums.length - 1;
      if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
      }

      while (j < k) {
        if (nums[i] + nums[j] + nums[k] > 0) {
          k--;
        } else if (nums[i] + nums[j] + nums[k] < 0) {
          j++;
        } else {
          List<Integer> sumList = Arrays.asList(nums[i], nums[j], nums[k]);
          res.add(sumList);
          j++;
          k--;

          // if we have like [-2, -2, 0, 0, 2, 2], skip
          // j to not work with duplicates
          while (j < k && nums[j] == nums[j - 1]) {
            j++;
          }

          // same for right side
          while (j < k && nums[k] == nums[k + 1]) {
            k--;
          }
        }
      }
    }
    return res;

  }

  public static void main(String[] args) {
    int[] nums = { -2, -2, 0, 0, 2, 2 };
    threeSum(nums);
  }

}
