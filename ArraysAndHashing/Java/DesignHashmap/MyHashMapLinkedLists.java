/*
 * Time complexity: O(n / k)
 * - n is the total num of keys
 * - k is the length of buckets
 *
 * The worst time complexity is O(n), where all keys are hashed to the same bucket.
 *
 * Space complexity: O(k + m)
 * - m is the num of unique keys
 *
 * The logic:
 * The buckets array contains linked list nodes of key-val pairs.
 * This HashMap uses separate chaining with an array of linked lists,
 * each starting with a dummy head node to simplify operations.
 * Keys are hashed to determine their bucket, and collisions are handled by
 * storing multiple key-value pairs in the bucket's linked list.
 *
 */

package Java.DesignHashmap;

public class MyHashMapLinkedLists {
  public class Node {
    int key;
    int value;
    Node next;

    Node(int key, int value) {
      this.key = key;
      this.value = value;
      this.next = null;
    }
  }

  private Node[] buckets;
  private int n;

  public MyHashMapLinkedLists(int n) {
    this.n = n;
    buckets = new Node[this.n];

    // dummy nodes like in hashset implementation
    for (int i = 0; i < this.n; i++) {
      buckets[i] = new Node(-1, -1); // using -1 instead of 0 is much clearer
    }
  }

  public void put(int key, int value) {
    Node prev = buckets[key % this.n];
    Node current = prev.next;

    while (current != null) {
      if (current.key == key) { // if keys are the same, update the value (2: 0 becomes 2: 1)
        current.value = value;
        return; // if no return, there will be duplicates
      }
      prev = current; // move forward
      current = current.next;
    }

    // if key is not found & prev node is the last node in the list now,
    // add another node
    prev.next = new Node(key, value);
  }

  public int get(int key) {
    Node current = buckets[key % this.n].next;

    while (current != null) {
      if (current.key == key) {
        return current.value;
      }
      current = current.next;
    }
    return -1; // if not found
  }

  public void remove(int key) {
    Node prev = buckets[key % this.n];
    Node current = prev.next;

    while (current != null) {
      if (current.key == key) {
        prev.next = current.next; // just unlink the el
        return;
      }
      prev = current;
      current = current.next;
    }
  }

  public static void main(String[] args) {
    MyHashMapLinkedLists myHashMap = new MyHashMapLinkedLists(10000);
    System.out.println("--- Testing MyHashMap ---");
    myHashMap.put(1, 1); // The map is now [(1,1)]
    myHashMap.put(2, 2); // The map is now [(1,1), (2,2)]
    System.out.println("get(1): " + myHashMap.get(1)); // return 1
    System.out.println("get(3): " + myHashMap.get(3)); // return -1 (i.e., not found)
    myHashMap.put(2, 1); // The map is now [(1,1), (2,1)] (i.e., update the existing value)
    System.out.println("get(2): " + myHashMap.get(2)); // return 1
    myHashMap.remove(2); // remove the mapping for 2, The map is now [(1,1)]
    System.out.println("get(2): " + myHashMap.get(2)); // return -1 (i.e., not found)
  }
}
