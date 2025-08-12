/*
 * Time complexity: O(1)
 * Space complexity: O(n * m), where:
 * - n is the n of rows
 * - m is the n of cols
 *
 * The logic:
 * 2D Prefix Sum method is used here. Both horizontal and vertical prefix sums are applied in the constructor.
 * We do this because we need O(1) time, so one call makes a precomputed matrix.
 * After vertical sum, sum of the submatrices will be stored in the corners of those submatrices.
 * Then, we'll need to extract them.
 *
 * The more detailed explanation is in the manual.
 */

package Java.RangeSumQuery2DImmutable;

public class 2DPrefixSum {
  private int[][] sumMat;
  public 2DPrefixSum(int[][] matrix) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    sumMat = new int[rows][cols];

    // do horizontal 1D sum
    for (int row = 0; row < matrix.length; row++) {
      sumMat[row][0] = matrix[row][0]; // column 0 must stay the same
      for (int col = 1; col < matrix[row].length; col++) {
        sumMat[row][col] = matrix[row][col] + sumMat[row][col - 1];
      }
    }

    // do vertical 2D sum
    for (int row = 1; row < sumMat.length; row++) {
      for (int col = 0; col < sumMat[row].length; col++) {
        sumMat[row][col] = sumMat[row][col] + sumMat[row - 1][col];
      }
    }
  }

  public int sumRegion(int row1, int col1, int row2, int col2) {
    // we need to check if those areas even exist
    // If we don't do it, the testcase ["NumMatrix","sumRegion"] [[[[1]]],[0,0,0,0]] -> expected: [null,1]
    // fails as it would return nothing
    int A = sumMat[row2][col2]; // always exists
    int B = (row1 > 0) ? sumMat[row1 - 1][col2] : 0;
    int C = (col1 > 0) ? sumMat[row2][col1 - 1] : 0;
    int D = (row1 > 0 && col1 > 0) ? sumMat[row1 - 1][col1 - 1] : 0;

    int prefSum = A - B - C + D;

    return prefSum;
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

    BruteForce bf = new BruteForce(mat);

    int sum1 = bf.sumRegion(2, 1, 4, 3); // return 8 (i.e sum of the red rectangle)
    int sum2 = bf.sumRegion(1, 1, 2, 2); // return 11 (i.e sum of the green rectangle)
    int sum3 = bf.sumRegion(1, 2, 2, 4); // return 12 (i.e sum of the blue rectangle)

    System.out.println(sum1);
    System.out.println(sum2);
    System.out.println(sum3);
  }
}
