package datastructures.linkedlist;
//Within your Linked List class, include a head property.
//Upon instantiation, an empty Linked List should be created.
// structure: insert, include, toString
public class LinkedList {
  public Node head = null;
  public Node tail;

  public void insert(int value) {
    Node newNode = new Node(value);
    if(head != null){
      newNode.next = head;
    }
    head = newNode;
  }

  public boolean includes(int value) {
    Node current = head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

// k code challenge 07 === // ll.kthFromEnd(k)
  public int kthFromEnd(int k){
    int n = 0;
    Node current = head;
    while (current != null) {
      current = current.next;
      n++;
    }
//    System.out.println(n);
    if (k > n) {
      throw new IllegalArgumentException(k + " k= to big");
    }
    current = head;
    int len = n - k;
    for (int i = 0; i < len; i++) {
      if(i == len - 1){
        break;
      }
      current = current.next;
    }
    assert current != null;
    System.out.println(head.value);
    return current.value;
  }
  @Override
  public String toString() {
    Node current = head;
    StringBuilder write = new StringBuilder();
    while (current != null) {
      write.append("[");
      write.append(current.value);
      write.append("] -> ");
      current = current.next;
    }
    String aFinish = write + "Null";
    return aFinish;
  }

}
