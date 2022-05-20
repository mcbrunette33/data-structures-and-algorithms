package datastructures.linkedlist;
//Within your Linked List class, include a head property.
//Upon instantiation, an empty Linked List should be created.
// structure: insert, include, toString
public class LinkedList {
  public Node head = null;
  public Node tail;

  public void insert(int value) {
    Node newNode = new Node(value);
    newNode.next = head;
    head = newNode;
  }

  public boolean includes(int value) {
    Node current = this.head;
    while (current != null) {
      if (current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  @Override
  public String toString() {
    Node current = head;
    StringBuilder write = new StringBuilder();
    while (current != null) {
      write.append("[");
      write.append(current.value);
      write.append("] -> ");
    }
    String aFinish = write + "Null";
    return aFinish;
  }
}
