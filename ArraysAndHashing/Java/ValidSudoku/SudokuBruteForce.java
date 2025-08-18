/*
 * Time complexity: O(n^2) -> (1) because n is constant (243)
 * Space complexity: O(n) -> O(1) for the same reason
 * - Auxiliary: O(n) -> O(1)
 * - Output: O(1)
 *
 * The logic:
 * Traverse each row, each col, each square and store values in corresponding hashsets.
 * If they already have those values, then return false.
 * HashSet declaration happens in each loop because we need to reset them so the values
 * wouldn't duplicate for each row, column and square.
 */

package Java.ValidSudoku;

import java.util.*;

class SudokuBruteForce {
  public static boolean isValidSudoku(char[][] board) {
    // traversing each row
    for (int row = 0; row < 9; row++) { // O(9^2)
      HashSet<Character> rows = new HashSet<>();
      for (int i = 0; i < 9; i++) {
        if (board[row][i] == '.') {
          continue;
        }
        if (rows.contains(board[row][i])) {
          return false;
        }
        rows.add(board[row][i]);
      }
    }

    // traversing each column
    for (int col = 0; col < 9; col++) { // O(9^2)
      HashSet<Character> cols = new HashSet<>();
      for (int i = 0; i < 9; i++) {
        if (board[i][col] == '.') {
          continue;
        }
        if (cols.contains(board[i][col])) {
          return false;
        }
        cols.add(board[i][col]);
      }
    }

    // traversing each square
    for (int square = 0; square < 9; square++) { // O(9^2)
      HashSet<Character> squares = new HashSet<>();
      for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
          int row = (square / 3) * 3 + i;
          int col = (square % 3) * 3 + j;

          if (board[row][col] == '.') {
            continue;
          }
          if (squares.contains(board[row][col])) {
            return false;
          }
          squares.add(board[row][col]);
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
