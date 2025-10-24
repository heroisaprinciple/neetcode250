/*
 * Time comlexity: O(log n)
 * Space complexity: O(1)
 */

package SearchInsertPosition;

public class BinSearch {
  static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    while (low <= high) {
      int midPoint = low + (high - low) / 2;

      if (nums[midPoint] == target) {
          return midPoint;
      }
      else if (target > nums[midPoint]) {
          low = midPoint + 1;
      } else {
          high = midPoint - 1;
      }
    }
    return low;
  }

  public static void main(String[] args) {
    int nums[] = {-1,0,2,4,6,8};
    int target = 10;
    System.err.println(search(nums, target)); // 6
  }
}
