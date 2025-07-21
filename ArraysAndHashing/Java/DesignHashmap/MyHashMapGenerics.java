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
 * This is the same logic as in MyHashMapLinkedLists.java, but
 * using generics
 *
 */

package Java.DesignHashmap;

public class MyHashMapGenerics<K, V> {
  public class Node<K, V> {
    K key;
    V value;
    Node<K, V> next;

    Node(K key, V value) {
      this.key = key;
      this.value = value;
      this.next = null;
    }
  }

  private Node<K, V>[] buckets;
  private int n;

  public MyHashMapGenerics(int n) {
    this.n = n;
    // the array type must be cast because generics don't allow
    // direct instantiation of generic arrays.
    buckets = (Node<K, V>[]) new Node[this.n];

    // dummy nodes like in hashset implementation
    for (int i = 0; i < this.n; i++) {
      buckets[i] = new Node<>(null, null); // accepts nulls only, no -1 as Generics don't work with primitives)
    }
  }

  private int computeHash(K key) {
    return Math.abs(key.hashCode() % this.n);
  }

  public void put(K key, V value) {
    Node<K, V> prev = buckets[computeHash(key)]; // works because key is int
    Node<K, V> current = prev.next;

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

  public V get(K key) {
    // would not work here because k is of type K
    // Node<K, V> current = buckets[key % this.n].next;
    // a special function is needed
    Node<K, V> current = buckets[computeHash(key)].next;

    while (current != null) {
      if (key.equals(current.key)) {
        return current.value;
      }
      current = current.next;
    }
    return null; // if not found, return null (-1 can't be used)
  }

  public void remove(K key) {
    Node<K, V> prev = buckets[computeHash(key)]; // works because key is int
    Node<K, V> current = prev.next;

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
    MyHashMapGenerics myHashMap = new MyHashMapGenerics(10000);
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
