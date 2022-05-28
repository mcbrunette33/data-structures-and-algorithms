package datastructures.StackTest;
import datastructures.linkedlist.Node;
import datastructures.linkedlist.LinkedList;
import datastructures.stack.Stack;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StackTest {

  @Test
  public void testStackPush()
  {
    Stack stack = new Stack();
    stack.push(1);
    System.out.println(stack);
    assertEquals(1, stack.top.value);
  }

  @Test
  public void testStackPop() {
    Stack stack = new Stack();
    stack.push(1);
    stack.pop();
    assertNull(stack.top);
  }
@Test
  public void PeekValueCheck(){
  Stack stack = new Stack();
  stack.push(1);

  assertEquals(1,stack.peek());
}

}
