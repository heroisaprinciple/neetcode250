/*
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(n)
 * - Auxiliary: O(1)
 * - Total: O(n)
 *
 * The logic:
 * This is a prefix-suffix multiplication approach.
 * It works by calculating all products to the left of each element (prefix)
 * and storing them, then doing the same for all products to the right (suffix).
 * Then, it multiplies the corresponding prefix and suffix values for each
 * index to get the product of all elements except the element at that index.
 *
 */

package Java.ProductOfArrayExceptSelf;

public class PrefixSuffixMultiplication {
  public static int[] productExceptSelf(int[] nums) {
    int n = nums.length;
    int[] res = new int[n];
    int[] pref = new int[n];
    int[] suff = new int[n];

    pref[0] = 1;
    suff[n - 1] = 1;

    for (int i = 1; i < n; i++) { // O(n)
      pref[i] = nums[i - 1] * pref[i - 1];
    }

    for (int j = n - 2; j >= 0; j--) { // O(n)
      suff[j] = nums[j + 1] * suff[j + 1];
    }

    for (int i = 0; i < n; i++) { // O(n)
      res[i] = pref[i] * suff[i];
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
