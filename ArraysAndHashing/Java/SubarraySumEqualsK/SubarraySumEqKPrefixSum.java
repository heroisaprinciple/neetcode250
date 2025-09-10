/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * The logic:
 * The prefix sum logic is used here.
 * We'll traverse through the array and see if the previous prefix sum (sum - k) at current index i
 * exists in the freq hashmap: {pref_sum : count}.
 * If not, we put current prefix sum and it's occurrence num into the hashmap.
 * If yes, we update the count with the count of the existing prefix sum =>
 * there is a subarray ending at index i which sum is k.
 *
 * + we initialize freq with {0, 1} to handle cases from index 0 to k.
 */

package Java.SubarraySumEqualsK;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqKPrefixSum {
  public static int subarraySum(int[] nums, int k) {
    int sum = 0;
    int prev_sum = 0;
    int count = 0;

    Map<Integer, Integer> freq = new HashMap<>();
    freq.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      prev_sum = sum - k;

      if (freq.containsKey(prev_sum)) {
        count += freq.get(prev_sum);
      }

      freq.put(sum, freq.getOrDefault(sum, 0) + 1);

    }

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 3, -1, 1, 2 };
    int res = subarraySum(nums, 2);
    System.out.println(res);
  }
}
