package ReverseString;

public class ReverseString {
  static void reverseString(char[] s) {
    int ptrOne = 0;
    int ptrTwo = s.length - 1;
    while (ptrOne < ptrTwo) {
      swap(s, ptrOne, ptrTwo);
      ptrOne++;
      ptrTwo--;
    }
  }

  static void swap(char[] s, int ptrOne, int ptrTwo) {
    char temp = s[ptrOne];
    s[ptrOne] = s[ptrTwo];
    s[ptrTwo] = temp;
  }

  public static void main(String[] args) {
    char[] s = { 'n', 'e', 'e', 't' }; // ["t","e","e","n"]
    reverseString(s);
  }
}
