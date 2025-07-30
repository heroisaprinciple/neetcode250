/*
 * Time comlexity:
 * - Average case: O(n + k) => O(n) because k is constant (3) and it does
 *   not grow in regards to n
 *
 * - Worst case: O(n + k) => O(n)
 *
 * Space complexity:
 * - Output: O(1)
 * - Auxiliary: O(1) as count has a constant space
 *   (would be O(m) if it was a general Counting sort implementation)
 * - Total: O(1)
 *
 * The logic:
 * A Counting sort implementation in-place.
 */

package Java.SortColours;

public class CountingSort {
  public static void sortColors(int[] nums) {
    int[] count = fillCount(nums);

    int idx = 0;
    for (int i = 0; i < count.length; i++) { // O(k)
      int occurrence = count[i];
      for (int j = 0; j < occurrence; j++) { // O(n) because there are 4 occurrences overall (not O(m))
        nums[idx] = i; // send count's index to a new position of nums
        idx++; // new place
      }
    }
  }

  public static void printArr(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  private static int[] fillCount(int[] nums) {
    int count[] = new int[3];
    for (int num : nums) { // O(n)
      count[num]++;
    }
    return count;
  }

  public static void main(String[] args) {
    int nums[] = { 1, 0, 1, 2 };
    sortColors(nums);
    printArr(nums);
  }
}
