/*
 * Time complexity: O(n * m), where:
 * - n is the num of rows
 * - m is the num of cols
 *
 * Space complexity: (No array created, just referenced)
 * - Output: O(1)
 * - Auxiliary: O(1)
 * - Total: O(1)
 *
 */

package Java.RangeSumQuery2DImmutable;

public class RangeSumBruteForce {
  private int[][] matrix;

  public RangeSumBruteForce(int[][] matrix) {
    this.matrix = matrix;
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    int sum = 0;
    for (int row = row1; row <= row2; row++) { // O(n)
      for (int col = col1; col <= col2; col++) { // O(m)
        sum += matrix[row][col];
      }
    }
    return sum;
  }
}

class NumMatrix {
  public static void main(String[] args) {
    // CAN'T PASS MATRIX DIRECTLY
    // BruteForce br = new BruteForce({
    // {3, 0, 1, 4, 2},
    // {5, 6, 3, 2, 1},
    // {1, 2, 0, 1, 5},
    // {4, 1, 0, 1, 7},
    // {1, 0, 3, 0, 5}
    // });

    int[][] mat = new int[][] {
        { 3, 0, 1, 4, 2 },
        { 5, 6, 3, 2, 1 },
        { 1, 2, 0, 1, 5 },
        { 4, 1, 0, 1, 7 },
        { 1, 0, 3, 0, 5 }
    };

    RangeSumBruteForce bf = new RangeSumBruteForce(mat);

    int sum1 = bf.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
    int sum2 = bf.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
    int sum3 = bf.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}
