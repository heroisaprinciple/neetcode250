/*
 * Time complexity: O(n / k), where:
 * - n is the total num of keys
 * - k is the size of the set (the num of buckets)
 *
 * Space compelxity:
 * - Output: O(1)
 * - Auxiliary: O(k + m), m is the num of unique keys
 * - Total: O(k + m)
 *
 * Even Object {} is not allowed here as it uses a hashmap-like structure.
 * The logic:
 * When different keys hash to the same index (a collision), linked lists are used to store multiple
 * elements within that single array "bucket". Each node in the list holds a key,
 * and new nodes are simply appended when a collision occurs.
 * This chaining method allows the hashset to dynamically expand capacity
 * for storing elements without need to resize the array.
 *
*/

package Java.DesignHashset;

public class MyHashSetLinkedList {
  private static class Node {
    int key;
    Node next;

    Node(int key) {
      this.key = key;
    }
  }

  private Node[] set;

  MyHashSetLinkedList() {
    set = new Node[10000]; // At most 10,000 calls will be made to add, remove, and contains
    for (int i = 0; i < set.length; i++) {
      set[i] = new Node(0);
    }
  }

  public void add(int key) {
    if (contains(key)) // to avoid duplicates
      return;
    Node currentEl = set[key % set.length];
    while (currentEl.next != null) {
      currentEl = currentEl.next;
    }
    currentEl.next = new Node(key); // if the end of the list, add node
  }

  public boolean contains(int key) {
    Node currentEl = set[key % set.length];
    while (currentEl.next != null) {
      if (currentEl.next.key == key)
        return true;

      currentEl = currentEl.next;
    }
    return false;
  }

  public void remove(int key) {
    Node currentEl = set[key % set.length];
    while (currentEl.next != null) {
      if (currentEl.next.key == key) {
        currentEl.next = currentEl.next.next; // just unlink element
        return;
      }
      currentEl = currentEl.next;
    }
  }

  public static void main(String[] args) {
    MyHashSetLinkedList myHashSet = new MyHashSetLinkedList();
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
