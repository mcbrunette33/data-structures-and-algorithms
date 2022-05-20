package datastructures;

import datastructures.linkedlist.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class nodeTest {
  @Test
  public void nodeTesting() {
    Node sut = new Node(4);
    assertEquals(4, sut.value);
  }
}
