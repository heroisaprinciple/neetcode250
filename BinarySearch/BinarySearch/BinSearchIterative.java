/*
 * Time complexity: O(log n)
 * Space complexity: O(1)
 */


package BinarySearch;

public class BinSearchIterative {
  static int search(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int midPoint = low + (high - low) / 2;
      if (nums[midPoint] == target) {
        return midPoint;
      }
      else if (nums[midPoint] < target) {
        low = midPoint + 1;
      }
      else {
        high = midPoint - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int nums[] = {-1,0,2,4,6,8};
    int target = 3;
    System.err.println(search(nums, target)); // -1
  }
}
