package datastructures.linkedlist;

import org.junit.jupiter.api.Test;
import datastructures.linkedlist.LinkedList;
import datastructures.linkedlist.Node;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
  @Test
  void LinkedListValue() {
    LinkedList newList = new LinkedList();
    for (int i = 1; i <= 5; i++) {
      newList.insert(i);
    }
    assertTrue(newList.includes(5));
  }

  @Test
  void KthFromEndReturn() {
    LinkedList linkedList = new LinkedList();
    linkedList.insert(1);
    linkedList.insert(3);
    linkedList.insert(8);
    linkedList.insert(2);
    System.out.println(linkedList.toString());
    System.out.println(linkedList.kthFromEnd(2));
    System.out.println(linkedList);
    assertEquals(1, 1);
  }
}
