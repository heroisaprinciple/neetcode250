/*
 * Time complexity: O(n)
 * Space complexity:
 * - Output: O(1) due to int return
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 * The logic:
 * There is no need to convert nums to binary manually.
 *
 * Each el of the arr is converted to binary (bitwise operations) and masked with
 * (1 << i).
 * This is happening because we need to count all occurrences of 1 at each bit.
 * For ins (i = 0):
 * 2 => 0 1 0
 * 3 => 0 1 1
 * 4 => 1 0 0
 * 3 => 0 1 1
 * 3 => 0 1 1
 *
 * At bit 0: three 1s; since 3 > n/2, set 1 at bit 0 in result.
 * At bit 1: four 1s; since 4 > n/2, set 1 at bit 1 in result.
 * At bit 2: one 1; 1 < n/2, so set 0 at bit 2 in result.
 *
 * result = 011 => 3
 *
 */

package Java.MajorityElement;

public class MajorityElBitwise {
  public static int majorityElement(int[] nums) {
    int n = nums.length;
    int res = 0;
    int bits[] = new int[32];

    // count all occureences of 1 at each bit and fill the bits arr
    for (int num : nums) { // O(n)
      for (int i = 0; i < 32; i++) { // O(1)
        if ((num & (1 << i)) != 0) { // always use parentheses
          bits[i]++;
        }
      }
    }

    // traverse bits now; if those occurrences > n/2 => set 1 at i (bit i) in result
    for (int i = 0; i < bits.length; i++) { // O(n)
      if (bits[i] > n / 2) {
        res |= (1 << i);
      }
    }
    return res;

  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 4, 3, 3 }; // 3
    System.err.println(majorityElement(nums));
  }

}
