/*
 * Time complexity: O(n) + O(n) => O(n)
 * Space complexity:
 * - Output: O(1) => int is returned
 * - Auxiliary space: O(n)
 * - Total: O(n)
 *
 * The logic:
 * Add all numbers to the hashmap and return the key that has the
 * largest occurrences value
 *
 * P.S Cases like [4, 4, 2, 2] are not tested here as those are not Leetcode testcases
 */

package Java.MajorityElement;

import java.util.HashMap;

public class MajorityElHashMapBasic {
  public static int majorityElement(int[] nums) {
    int n = nums.length;
    int maxVal = 0;
    int res = 0;
    HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) { // O(n)
      int count = occurrences.getOrDefault(nums[i], 0) + 1;
      occurrences.put(nums[i], count);
      if (count > maxVal) {
        maxVal = count; // update max val
        res = nums[i];
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 5, 1, 1, 1, 5, 5 }; // 5
    System.out.println(majorityElement(nums));
  }
}
