/*
 * Time: O(n);
 * Space: O(n);
 */

package Java.FirstMissingPositive;

import java.util.HashSet;
import java.util.Set;

public class FirstMissingPositiveValueBruteForce {
  public static int firstMissingPositive(int[] nums) {
    Set<Integer> setNums = new HashSet<>();
    for (int num : nums) {
      setNums.add(num);
    }

    for (int num = 1; num < nums.length + 1; num++) {
      if (!setNums.contains(num)) {
        return num;
      }
    }
    return nums.length + 1; // for cases like [1, 2, 3] => 4
  }

  public static void main(String[] args) {
    int[] nums = { -2, -1, 0 }; // 1
    int pos = firstMissingPositive(nums);
    System.out.println(pos);
  }

}
