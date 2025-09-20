/*
 * Time complexity: O(m + n)
 * Space complexity: O(1)
 *
 * The logic:
 * We keep comparing [k] and [j] and insert the larger value at [i].
 */

package MergeSortedArray;

public class MergeSortedArraySpaceOptimal {
  static void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m + n - 1; // the end of nums1
    int j = n - 1; // the end of nums2
    int k = m - 1; // the valid end of nums1

    while (k >= 0 && j >= 0) {
      if (nums2[j] > nums1[k]) {
        nums1[i] = nums2[j];
        j--;
      } else {
        nums1[i] = nums1[k];
        k--;
      }
      i--;
    }

    // copy leftovers from nums2 to nums1 if they exist
    while (j >= 0) {
      nums1[i] = nums2[j];
      j--;
      i--;
    }

    for (int num : nums1) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int nums1[] = { 10, 20, 20, 40, 0, 0 };
    int m = 4;
    int nums2[] = { 1, 2 };
    int n = 2;
    merge(nums1, m, nums2, n);
  }

}
