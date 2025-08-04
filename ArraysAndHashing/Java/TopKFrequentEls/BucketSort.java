/*
 * Time complexity: O(n + m) => O(n) for all cases
 * - m is buckets size and it corresponds to n => O(n)
 *
 * Space complexity: O(n) for hashmap + O(n) for buckets array => O(n)
 *
 * The logic:
 * This solution finds the top K frequent elements by first counting element frequencies in a HashMap.
 * Then, it uses an array of lists (buckets) where each index represents a frequency,
 * allowing elements to be grouped by how often they appear, and finally,
 * it iterates these buckets from highest frequency downwards to collect the top K elements.
 *
 * The DS would look like:
 * [ 0: ArrayList[],
 *   1: ArrayList[1, 7],
 *   2: ArrayList[2],
 *   3: ArrayList[3] <-- start traversing from here
 *   ....
 * ]
 *
 * The res would be: [3, 2]
 */

package Java.TopKFrequentEls;

import java.util.HashMap;
import java.util.ArrayList;

public class BucketSort {
  public static int[] topKFrequent(int[] nums, int k) {
    // n + 1 because if a number appears nums.length times,
    // an IndexOutOfBoundsException will be thrown.
    ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];

    HashMap<Integer, Integer> freq = new HashMap<>();
    int res[] = new int[k]; // int res[] = {} would not require a length
    int idx = 0;

    for (int num : nums) {
      freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    // start filling the array with empty ArrayLists
    for (int i = 0; i < buckets.length; i++) {
      buckets[i] = new ArrayList<Integer>();
    }

    // start adding hashmap entries to buckets
    for (HashMap.Entry<Integer, Integer> entry : freq.entrySet()) {
      int key = entry.getKey();
      int value = entry.getValue();
      buckets[value].add(key);
    }

    // fill the res array
    for (int i = buckets.length - 1; i >= 0; i--) {
      for (int j = 0; j < buckets[i].size(); j++) {
        res[idx] = buckets[i].get(j);
        idx++;
        if (idx == k) {
          return res;
        }
      }
    }
    return res;
  }

  private static void printArr(int[] res) {
    for (int num : res) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] nums = { 7, 1, 2, 2, 3, 3, 3 };
    int res[] = topKFrequent(nums, 2);
    printArr(res); // 3, 2
  }

}
