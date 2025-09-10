/*
 * Time complexity: O(n^2)
 * Space complexity: O(1)
 */

package Java.SubarraySumEqualsK;

public class SubarraySumEqKBruteForce {
  public static int subarraySum(int[] nums, int k) {
    int res = 0;
    for (int i = 0; i < nums.length; i++) {
      int sum = 0;
      for (int j = i; j < nums.length; j++) {
        sum += nums[j];
        if (sum == k)
          res++;
      }
    }
    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 3, -1, 1, 2 };
    int res = subarraySum(nums, 2);
    System.out.println(res);
  }

}
