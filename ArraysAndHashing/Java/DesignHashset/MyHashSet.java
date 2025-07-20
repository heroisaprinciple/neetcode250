/*
 * Time complexity: O(n)
 * Space compelxity:
 * - Output: O(1)
 * - Auxiliary: O(n)
 * - Total: O(n)
 *
 * Even Object {} is not allowed here as it uses a hashmap-like structure.
 * The logic:
 * This is a brute-force solution (not a real hash-based set)
 * Here, an ordinary ArrayList is used.
 * Both .contains and .remove are O(n) in time.
 *
*/

package Java.DesignHashset;

import java.util.ArrayList;

public class MyHashSet {
  private ArrayList<Integer> data;

  MyHashSet() {
    data = new ArrayList<>();
  }

  public void add(int key) {
    if (!data.contains(key)) { // O(n)
      data.add(key);
    }
  }

  public void remove(int key) {
    // remove() may result in IndexOutOfBoundsException
    // because by default it deletes by index
    // valueOf deletes the value
    // if there is no value, no exception is thrown, the list is unchanged
    data.remove(Integer.valueOf(key)); // O(n)
  }

  public boolean contains(int key) {
    return data.contains(key);
  }

  public static void main(String[] args) {
    MyHashSet myHashSet = new MyHashSet();
    System.out.println("Add 1");
    myHashSet.add(1); // set = [1]

    System.out.println("Add 2");
    myHashSet.add(2); // set = [1, 2]

    System.out.println("Contains 1? " + myHashSet.contains(1)); // return true

    System.out.println("Contains 3? " + myHashSet.contains(3)); // return false, (not found)

    System.out.println("Add 2 (again)");
    myHashSet.add(2); // set = [1, 2]

    System.out.println("Contains 2? " + myHashSet.contains(2)); // return true

    System.out.println("Remove 2");
    myHashSet.remove(2); // set = [1]

    System.out.println("Contains 2? " + myHashSet.contains(2)); // return false, (already removed)
  }
}
