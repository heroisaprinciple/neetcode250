/*
 * Time complexity: O(n^2) => n * (n/2 + n/2) = n^2
 * Space complexity:
 * - Output: O(n)
 * - Auxiliary: O(1)
 * - Total: O(n)
 *
 * The logic:
 * This is a three-pointer solution where i traverses the list, k traverses
 * the elements behind i and j does the same for elements after i
 */

package Java.ProductOfArrayExceptSelf;

public class BruteForce {
  public static int[] productExceptSelf(int[] nums) {
    int[] res = new int[nums.length];
    for (int i = 0; i < nums.length; i++) { // O(n)
      int product = 1;
      int k = i - 1;
      int j = i + 1;

      while (k >= 0) { // O(n/2)
        product *= nums[k];
        k--;
      }

      while (j <= nums.length - 1) { // O(n/2)
        product *= nums[j];
        j++;
      }
      res[i] = product;
    }
    return res;
  }

  private static void printArr(int[] nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 4, 6 };
    int[] output = productExceptSelf(nums);
    printArr(output); // [42, 24, 12, 8]
  }
}
