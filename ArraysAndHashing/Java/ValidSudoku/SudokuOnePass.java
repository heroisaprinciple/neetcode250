/*
 * Time complexity: O(n^2) => O(1) because 81 is constant
 * Space complexity: O(n) -> O(1) for the same reason
 * - Output: O(1)
 * - Auxiliary: O(n) -> O(1)
 *
 * The logic:
 * Here, the smart trick is used. Instead of doing 3 passes, we'll do one.
 * Strings "in the row/columnn/block" will define if the sudoku is valid.
 * No .contains used here as .add has a boolean return value.
 */

package Java.ValidSudoku;

import java.util.HashSet;

public class SudokuOnePass {
  public static boolean isValidSudoku(char[][] board) {
    HashSet<String> els = new HashSet<>();
    for (int i = 0; i < 9; i++) { // O(9)
      for (int j = 0; j < 9; j++) { // O(9)
        if (board[i][j] == '.') {
          continue;
        }
        if (!els.add(board[i][j] + " in the row " + i) ||
            !els.add(board[i][j] + " in the column " + j) ||
            !els.add(board[i][j] + " in the block " + i / 3 + "-" + j / 3)) {
          return false;
        }
      }
    }
    return true;
  }

  private static void printSudoku(char[][] board) {
    for (int r = 0; r < 9; r++) {
      if (r % 3 == 0 && r != 0)
        System.out.println("------+-------+------");
      for (int c = 0; c < 9; c++) {
        if (c % 3 == 0 && c != 0)
          System.out.print("| ");
        System.out.print(board[r][c] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    char[][] validBoard = {
        { '1', '2', '.', '.', '3', '.', '.', '.', '.' },
        { '4', '.', '.', '5', '.', '.', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '.', '3' },
        { '5', '.', '.', '.', '6', '.', '.', '.', '4' },
        { '.', '.', '.', '8', '.', '3', '.', '.', '5' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '.', '.', '.', '.', '.', '2', '.', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '8' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    printSudoku(validBoard);
    boolean res = isValidSudoku(validBoard);
    System.out.println(res);

    char[][] invalidSquare = {
        { '5', '3', '5', '.', '7', '.', '.', '.', '.' },
        { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
        { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
        { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
        { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
        { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
        { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
        { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
        { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
    };

    printSudoku(invalidSquare);
    boolean invRes = isValidSudoku(invalidSquare);
    System.out.println(invRes);
  }

}
