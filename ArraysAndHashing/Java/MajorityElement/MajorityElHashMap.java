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

class MajorityElementHashMap {
  public static int majorityElement(int[] nums) {
    int n = nums.length;
    HashMap<Integer, Integer> occurrences = new HashMap<Integer, Integer>();
    for (int i = 0; i < n; i++) { // O(n)
      occurrences.put(nums[i], occurrences.getOrDefault(nums[i], 0) + 1);
    }

    // .entrySet() returns a collection
    return occurrences.entrySet().stream().max(HashMap.Entry.comparingByValue())
        .get().getKey(); // max is O(n) in time, other operations here are O(1)
  }

  public static void main(String[] args) {
    int[] nums = { 5, 5, 1, 1, 1, 5, 5 }; // 5
    System.err.println(majorityElement(nums));
  }

}
