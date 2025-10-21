/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 *
 * The logic:
 *
 * A hashmap is used to match closing brace with an opening one. For example:
 * {([ ])}, how do we now that ']' closes '[' ? That's were hashmap comes to play.
 *
 * A stack is used to find a pair.
 * If stack is empty, all pairs are matched.
 *
 * Without stack.isEmpty(), an exception would be thrown if the stack is empty.
 * For example: ']})({[' without stack.isEmpty() will throw an exception.
 * At this stage, a stack is empty, so !stack.isEmpty()
 * would simply result in false without checking what happens after && (&& Objects.equals(stack.peek(), pairs.get(el))).
 */

package ValidParentheses;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class ValidP {
  public static boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> pairs = new HashMap<>();

    pairs.put(')', '(');
    pairs.put(']', '[');
    pairs.put('}', '{');

    for (char el : s.toCharArray()) {
      if (pairs.containsKey(el)) {
        // if true, we found a match
        if (!stack.isEmpty() && Objects.equals(stack.peek(), pairs.get(el))) {
          stack.pop();
        }
        else {
          return false;
        }
      }
      else {
        stack.push(el);
      }
    }
    return stack.isEmpty();
  }

  public static void main(String[] args) {
    String s = "([{}])";
    System.err.println(isValid(s));
  }
}
