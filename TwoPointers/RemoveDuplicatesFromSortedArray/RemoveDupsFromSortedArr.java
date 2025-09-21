/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 *
 * The logic:
 * Note that for this problem we input array should be modified to have unique elements.
 * We'll start from index 1 as the element at index 0 is ALWAYS unique.
 * We could also do:
 *    int i = 0;
 *     int k = 0;
 *     while (i < nums.length) {
 *     if (i == 0 || nums[i] != nums[i - 1]) {
 *         nums[k] = nums[i];
 *         k++;
 *     }
 *     i++;
 *     }
 *     return k;
 *
 *
 */

package RemoveDuplicatesFromSortedArray;

public class RemoveDupsFromSortedArr {
  public static int removeDuplicates(int[] nums) {
    int i = 1;
    int k = 1;

    while (i < nums.length) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
      i++;
    }

    return k;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 2, 3, 3, 4 };
    int res = removeDuplicates(nums);
    System.out.println(res); // 4
  }
}
