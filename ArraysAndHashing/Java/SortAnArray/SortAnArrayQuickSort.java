/*
 * Time complexity:
 * - The average case: O(n log n)
 * - The worst case: O(n^2) if the array is sorted
 *
 * Space complexity:
 * - The average case:
 *   - Auxiliary: O(log n) -> due to recursive call stack
 *   - Output: O(n)
 *   - Total: O(log n) + O(n) -> O(n)
 *
 * - The worst case (if the array is sorted -> the tree is unbalanced):
 *   - Auxiliary: O(n)
 *   - Output: O(n)
 *   - Total: O(n) + O(n) -> O(n)
 *
 * The logic:
 * An ordinary quicksort implementation, which uses Hoare partitioning.
 * A pivot here is the first element of the array (which is not always a good solution)
 * There is no median partitioning as on Leetcode.
 *
 */

package Java.SortAnArray;

public class SortAnArrayQuickSort {
  public static int[] sortArray(int[] nums, int low, int high) {
    quickSort(nums, low, high);
    return nums;
  }

  private static void quickSort(int[] nums, int low, int high) {
    if (low < high) {
      int j = partitioning(nums, low, high);
      sortArray(nums, low, j - 1); // left side
      sortArray(nums, j + 1, high); // right side
    }
  }

  private static int partitioning(int[] nums, int low, int high) {
    int pivot = nums[low];
    int i = low;
    int j = high;

    while (i < j) {
      // increment i til i > pivot
      while (nums[i] <= pivot && (i < high)) {
        i++;
      }

      // decrement j til j < pivot
      while (nums[j] > pivot && (j > low)) {
        j--;
      }

      // see if i and j cross each other
      if (i < j) {
        swap(nums, i, j);
      }
    }

    swap(nums, low, j);
    return j;
  }

  private static void swap(int[] nums, int low, int high) {
    int temp = nums[low];
    nums[low] = nums[high];
    nums[high] = temp;
  }

  public static void printArr(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 10, 9, 1, 1, 1, 2, 3, 1 };
    int high = nums.length - 1;
    int low = 0;
    sortArray(nums, low, high);
    printArr(nums);

  }
}
