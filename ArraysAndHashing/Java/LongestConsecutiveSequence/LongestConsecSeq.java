/*
 * Time complexity: O(n + n) => O(n)
 * Time is O(n) because of if condition that controls the start of the sequence.
 *
 * Space complexity: O(n)
 *
 * The logic:
 * All elements are saved into the hashset to save only unique elements.
 * Each element of the array is tested. If el - 1 doesn't exist,
 * the start is found, meaning count is 1.
 * Then, we'll see if the currentNum + 1 exists in the hashset.
 * If so, count and currentNum incremented.
 * As count resets with every iteration, there is a need to use longestCount.
 */

package Java.LongestConsecutiveSequence;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecSeq {
  public static int longestConsecutive(int[] nums) {
    Set<Integer> uniqNums = new HashSet<>();
    for (int num : nums) {
      uniqNums.add(num);
    }

    int longestCount = 0;

    for (int i = 0; i < nums.length; i++) {
      int currentNum = nums[i];
      // the start of the sequence found
      if (!uniqNums.contains(nums[i] - 1)) {
        int count = 1;

        while (uniqNums.contains(currentNum + 1)) {
          count++;
          currentNum++;
        }
        longestCount = Math.max(longestCount, count);
      }
    }
    return longestCount;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 20, 4, 10, 3, 4, 5 };
    int[] nums2 = { 0, 3, 2, 5, 4, 6, 1, 1 };
    int res1 = longestConsecutive(nums);
    System.out.println(res1); // 4

    int res2 = longestConsecutive(nums2);
    System.out.println(res2); // 7
  }
}
