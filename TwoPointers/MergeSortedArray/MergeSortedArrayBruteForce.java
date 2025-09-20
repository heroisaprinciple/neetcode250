/*
 * Time complexity: O(n + m)
 * Space complexity: O(n + m)
 *
 * This solution uses a third array, which is not space optimal.
 */

package MergeSortedArray;

public class MergeSortedArrayBruteForce {
  static void merge(int[] nums1, int m, int[] nums2, int n) {
    int nums3[] = new int[m + n];
    int i = 0;
    int j = 0;
    int idx = 0;

    while (i < m && j < n) {
      if (nums1[i] > nums2[j]) {
        nums3[idx] = nums2[j];
        j++;
        idx++;
      } else {
        nums3[idx] = nums1[i];
        i++;
        idx++;
      }
    }

    // check for leftovers in nums1
    while (i < m) {
      nums3[idx] = nums1[i];
      i++;
      idx++;
    }

    // check for leftovers in nums2
    while (j < n) {
      nums3[idx] = nums2[j];
      j++;
      idx++;
    }

    // copy back to nums1
    for (int k = 0; k < m + n; k++) {
      nums1[k] = nums3[k];
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
