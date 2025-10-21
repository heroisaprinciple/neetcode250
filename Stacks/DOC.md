### Baseball Game

You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.

Given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:

An integer x: Record a new score of x.
- '+': Record a new score that is the sum of the previous two scores.
- 'D': Record a new score that is the double of the previous score.
- 'C': Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

Note: The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.

````
Example 1:

Input: ops = ["1","2","+","C","5","D"]

Output: 18
Explanation:

"1" - Add 1 to the record, record = [1].
"2" - Add 2 to the record, record = [1, 2].
"+" - Add 1 + 2 = 3 to the record, record = [1, 2, 3].
"C" - Invalidate and remove the previous score, record = [1, 2].
"5" - Add 5 to the record, record = [1, 2, 5].
"D" - Add 2 * 5 = 10 to the record, record = [1, 2, 5, 10].
The total sum is 1 + 2 + 5 + 10 = 18.
````

#### Solution

- [BaseballGame.java](./BaseballGame/BaseballGame.java);
  Time: O(n); Space: O(n)

-----------

### Valid Parentheses

You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

- Every open bracket is closed by the same type of close bracket.
- Open brackets are closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.
- Return true if s is a valid string, and false otherwise.

````
Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
````

#### Solution

- [ValidParentheses.java](./ValidParentheses/ValidP.java);
  Time: O(n), Space: O(n)

-------
