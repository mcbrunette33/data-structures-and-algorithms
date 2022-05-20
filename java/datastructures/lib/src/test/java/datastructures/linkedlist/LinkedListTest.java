package datastructures.linkedlist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LinkedListTest {
@Test void LinkedListValue(){
  LinkedList newList = new LinkedList();
  for(int i = 1; i <=5; i++){
    newList.insert(i);
  }
  assertTrue(newList.includes(5));
}
@Test void testToString(){
  
}
}
