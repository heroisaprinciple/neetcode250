/*
 * Time complexity: O(log n)
 * Space: O(1)
 *
 * Java does not support default args, so a constructor is created.
 * In the original Leetcode problem, int guess(int num) is interal API.
 */

package GuessNumber;

public class GuessNumHigherOrLower {
  private int pick;

  public GuessNumHigherOrLower(int pick) {
    this.pick = pick;
  }

  public int guessNumber(int n) {
    int low = 1;
    int high = n;
    while (low <= high) {
      int midPoint = low + (high - low) / 2;
      int res = guess(midPoint);

      if (res == 0) {
          return midPoint;
      }
      else if (res == 1) {
          low = midPoint + 1;
      }
      else {
          high = midPoint - 1;
      }
    }
    return -1;
  }

  int guess(int num) {
    if (pick == num) {
      return 0;
    } else if (pick > num) {
      // secret num is more than guess
      return 1;
    } else {
      // secret num is less than guess
      return -1;
    }
  }

  public static void main(String[] args) {
    GuessNumHigherOrLower g1 = new GuessNumHigherOrLower(3);
    int res = g1.guessNumber(5);
    System.out.println(res); // 3
  }
}
