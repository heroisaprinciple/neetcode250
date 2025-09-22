/*
 * Time complexity: O(n^2);
 * Space complexity: O(1);
 *
 * The logic:
 * We iterate the array.
 * If the sum equals target, fill the new array.
 */

package TwoIntegerSumII;

public class TwoIntsSumIIBruteForce {
  public static int[] twoSum(int[] numbers, int target) {
    int[] res = new int[2];
    int i = 0;
    while (i < numbers.length) {
      int j = i + 1;
      while (j < numbers.length && i < j) {
        if (numbers[i] + numbers[j] == target) {
          res[0] = i + 1;
          res[1] = j + 1;
          return res; // return immediately
        }
        j++;
      }
      i++;
    }
    // return res;
    // if we returned res here, it would return us [2, 3], not [1,3]
    // because of the last solution given
    // though both pass tests, the Leetcode test cases have unique array elements
    // if they were not unique, not returning res immediately
    // could have been the problem
    return new int[0];

  }

  public static void printArr(int[] res) {
    for (int num : res) {
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 1, 2, 8 };
    int target = 3;
    int[] res = twoSum(numbers, target);
    printArr(res); // [1, 3], not [2, 3]
  }

}
