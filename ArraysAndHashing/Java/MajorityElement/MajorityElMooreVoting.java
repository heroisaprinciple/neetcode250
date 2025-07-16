/*
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(1)
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 * The logic:
 * There are 2 important vars: el (or candidate) and count
 * Iterate through the array:
 *  - If count is 0, set the current number as el and reset count to 1.
 *  - If the current number equals el, increment count.
 *  - If not, decrement count.
 * By the end, el is the majority element.
 *
 */

package Java.MajorityElement;

public class MajorityElMooreVoting {
  public static int majorityElement(int[] nums) {
    int el = 0;
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (count == 0) {
        el = nums[i];
        count = 1;
      }
      if (nums[i] == el) {
        count++;
      } else {
        count--;
      }
    }
    return el;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 5, 1, 1, 1, 5, 5 }; // 5
    System.out.println(majorityElement(nums));
  }
}
