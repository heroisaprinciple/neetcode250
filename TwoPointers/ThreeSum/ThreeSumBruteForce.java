/*
 * Time complexity: O(n^3)
 * Space complexity: O(m)), where m is the n of unique triplets
 */

package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce {
  public static List<List<Integer>> threeSum(int[] nums) {
    // needs unique triplets
    Set<List<Integer>> res = new HashSet<>(); // O(m) in space
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if (nums[i] + nums[j] + nums[k] == 0) {
            List<Integer> sumList = Arrays.asList(nums[i], nums[j], nums[k]);
            // needs sorting so that hashset can recognize duplicates
            Collections.sort(sumList);
            res.add(sumList);
          }
        }
      }
    }

    return new ArrayList<>(res); // O(m) in space

  }

  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };
    threeSum(nums);
  }
}
