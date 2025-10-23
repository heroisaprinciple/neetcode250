/*
 * Time complexity: O(log n)
 * Space complexity: O(log n) -> recursive tree
 */


package BinarySearch;

public class BinSearchRecursive {
  static int bs(int low, int high, int[] nums, int target) {
    int midPoint = low + (high - low) / 2;

    if (low <= high) {
      if (nums[midPoint] == target) {
        return midPoint;
      }
      else if (nums[midPoint] < target) {
        return bs(midPoint + 1, high, nums, target);
      }
      else {
        return bs(low, midPoint - 1, nums, target);
      }
    }
    return -1;
  }

  static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;
    return bs(low, high, nums, target);
  }

  public static void main(String[] args) {
    int nums[] = {-1,0,2,4,6,8};
    int target = 6;
    System.err.println(search(nums, target)); // 4
  }

}
