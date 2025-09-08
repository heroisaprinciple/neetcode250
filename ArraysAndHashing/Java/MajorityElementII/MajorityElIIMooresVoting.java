/*
 * Time complexity: O(n)
 * Space complexity: O(1) -> ArrayList always holds 2 elements
 *
 * The logic:
 * We need to find elements that appear > n/3 times.
 * Choose two candidates:
 * - 1 is not enough
 * - 3 is too much
 * If n = 10 => n/3 = 3, we need to find elements that appear > 3 times (at least 4).
 * Suppose we have 3 uniq nums that need to appear at least 4 times =>
 * 4 * 3 = 12, which exceeds initial length.
 * That's why 2 candidates are used.
 *
 * The problem extends the Majority El I problem and works as such:
 * - if count1 and count2 are both 0, nums[i] becomes el1. count1 is incremented.
 * - if nums[i] != el1 and count2 is 0, nums[i] becomes el2; count2 is incremented.
 * - if nums[i] != el1 && nums[i] != el2 => decrement both count1 and count2.
 * - if nums[i] == el1 => increment count1.
 * - if nums[i] == el2 => increment count2.
 *
 * Double Check is essential because there is no guarantee that majority element
 * actually exists.
 *
 * The detailed explanation is in the manual.
 */

package Java.MajorityElementII;

import java.util.*;

public class MajorityElIIMooresVoting {
  static List<Integer> majorityElement(int[] nums) {
    int el1 = 0;
    int el2 = 0;
    int count1 = 0;
    int count2 = 0;

    for (int num : nums) {
      if (count1 == 0 && count2 == 0) {
        el1 = num;
        count1++;
      } else if (num != el1 && count2 == 0) {
        el2 = num;
        count2++;
      } else if (num != el1 && num != el2) {
        count1--;
        count2--;
      } else if (num == el1) {
        count1++;
      } else if (num == el2) {
        count2++;
      }
    }

    // count real frequencies to know how many actual maj els we have
    count1 = 0;
    count2 = 0;
    for (int num : nums) {
      if (num == el1) {
        count1++;
      } else if (num == el2) {
        count2++;
      }
    }

    List<Integer> occurrences = new ArrayList<Integer>();
    if (count1 > nums.length / 3)
      occurrences.add(el1);
    else if (count2 > nums.length / 3)
      occurrences.add(el2);

    return occurrences;
  }

  private static void printArr(List<Integer> nums) {
    for (int num : nums) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int nums[] = { 1, 1, 1, 3, 3, 2, 2, 2 };
    List<Integer> occurrences = new ArrayList<Integer>();
    occurrences = majorityElement(nums);
    printArr(occurrences);
  }

}
