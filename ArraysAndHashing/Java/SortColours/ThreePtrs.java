/*
 * Time complexity: O(n) for all cases
 *
 * Space complexity: O(1)
 *
 * The logic:
 * The true one-pass algorithm. Start ptr points at the first element.
 * End ptr points at the last one.
 * i is used for traversing the list.
 *
 */

package Java.SortColours;

public class ThreePtrs {
  public static void sortColors(int[] nums) {
    int start = 0;
    int end = nums.length - 1;
    int i = 0; // traversing index

    while (start < end && i <= end) {
      if (nums[i] == 0) {
        swap(nums, start, i); // if el is 0, swap with start
        start++;
        i++;
      } else if (nums[i] == 2) {
        swap(nums, i, end); // if el is 2, swap with end
        end--;
      } else {
        i++;
      }
    }
  }

  private static void swap(int[] nums, int i, int idx) {
    int temp = nums[i];
    nums[i] = nums[idx];
    nums[idx] = temp;
  }

  public static void printArr(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int nums[] = { 1, 0, 1, 2 };
    sortColors(nums);
    printArr(nums);
  }

}
