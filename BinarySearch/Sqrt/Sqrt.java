/*
 * Time complexity: O(sqrt(n));
 * Space complexity: O(1);
 *
 * Without long, it can exceed time limit. For instance:
 * int x = 2147483647
 * x * x => overflow
 */

package Sqrt;

public class Sqrt {
  public static int mySqrt(int x) {
    for (int i = 0; i <= x; i++) {
      if ((long) i * i == x) {
        return i;
      }
      else if((long) i * i > x) {
        return i - 1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    int num = 3;
    System.out.println(mySqrt(num));
  }

}
