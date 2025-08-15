/*
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(n)
 * - Auxiliary: O(1)
 * - Total: O(n)
 *
 * The logic:
 * This is a prefix-suffix multiplication approach, but in-place (no prefix and suffix arrs created).
 * It works by doing in two passes:
 * - a forward pass fills the res array with prefix products
 * - a backward pass:
 *  - works by first multiplying the current res[j] by postfix (to fill the res array),
 *  - then updating the postfix value for the next element by multiplying it with nums[j]
 *
 * That makes postfix hold the product of elements to the right of the next index.
 *
 */

package Java.ProductOfArrayExceptSelf;

public class PrefixSuffixMultiplicationInPlace {
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];

    res[0] = 1;

    for (int i = 1; i < n; i++) { // O(n)
      res[i] = res[i - 1] * nums[i - 1];
    }

    int postfix = 1;

    for (int j = n - 1; j >= 0; j--) { // O(n)
      res[j] *= postfix;
      postfix *= nums[j];
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
