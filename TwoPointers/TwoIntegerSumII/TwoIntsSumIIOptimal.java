/*
 * Time complexity: O(n);
 * Space complexity: O(1);
 *
 * The logic:
 * We iterate the array. If nums sum < target, increment i.
 * If nums sum > target, decrement j.
 */

package TwoIntegerSumII;

public class TwoIntsSumIIOptimal {
  public static int[] twoSum(int[] numbers, int target) {
    int i = 0;
    int j = numbers.length - 1;

    // while (i < nums.length && j > 0 && i < j) is redundant
    while (i < j) {
      if (numbers[i] + numbers[j] > target) {
        j--;
      } else if (numbers[i] + numbers[j] < target) {
        i++;
      } else {
        return new int[] { i + 1, j + 1 };
      }
    }
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
