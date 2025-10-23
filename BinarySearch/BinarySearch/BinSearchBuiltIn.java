/*
 * Time complexity: O(log n)
 * Space complexity: O(1)
 */

package BinarySearch;

import java.util.Arrays;

public class BinSearchBuiltIn {
  static int search(int[] nums, int target) {
    int idx = Arrays.binarySearch(nums, target);
    return idx >= 0 ? idx : -1;
  }

  public static void main(String[] args) {
    int nums[] = {-1,0,2,4,6,8};
    int target = 4;
    System.err.println(search(nums, target)); // 3
  }
}
