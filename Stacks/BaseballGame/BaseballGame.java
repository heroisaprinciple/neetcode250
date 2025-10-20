/*
 * Time complexity: O(n + m) or O(n)
 *  - if m < n, it could be disregarded
 *  - we could leave O(n + m) because there is no mention how small m is
 *
 *
 * Space complexity: O(n)
 */

package BaseballGame;

import java.util.Stack;

public class BaseballGame {
  public static int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    for (String el : operations) { // O(n)
      if (el.equals("+")) {
        int top = stack.pop();
        int topNext = stack.peek();
        stack.push(top);
        stack.push(top + topNext);
      }
      else if (el.equals("C")) {
        stack.pop();
      }
      else if (el.equals("D")) {
        int n = stack.peek();
        stack.push(2 * n);
      }
      else {
        stack.push(Integer.parseInt(el)); // parsing is usually O(n) in time; but here it is O(1)
      }
    }

    int count = 0;
    for (int num : stack) { // O(m)
      count += num;
    }

    return count;
  };

  public static void main(String[] args) {
    String[] ops = {"1","2","+","C","5","D"};
    System.out.println(calPoints(ops));
  }
}
