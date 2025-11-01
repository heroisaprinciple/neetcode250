/*
 * Time complexity: O(log n)
 * Space complxity: O(1)
 */

package Sqrt;

public class SqrtBinSearch {
  public static int mySqrt(int x) {
    int low = 0;
    int high = x;
    while (low <= high) {
      int midPoint = low + (high - low) / 2;
      if ((long) midPoint * midPoint == x) {
        return midPoint;
      }
      else if ((long) midPoint * midPoint > x) {
        high = midPoint - 1;
      }
      else {
        low = midPoint + 1;
      }
    }
    return high;
  }

  public static void main(String[] args) {
    int num = 13;
    System.out.println(mySqrt(num));
  }
}
