package datastructures.queue;

import datastructures.linkedlist.Node;
import datastructures.stack.Stack;

public class PsuedoQueue {
  Stack stack1 = new Stack();
  Stack stack2 = new Stack();

  //default constructor
  public PsuedoQueue() {
  }

  public void enqueue(int value) {
    stack1.push(value);
  }

  public int dequeue() {
    if (stack1.isEmpty()) {
      throw new IllegalArgumentException("queue empty");
    } else {
      while (!stack1.isEmpty()) {
        stack2.push(stack1.pop());
      }
      int temp = stack2.pop();
      while (!stack2.isEmpty()) {
        stack1.push(stack2.pop());
      }
      return temp;
    }
  }
  @Override
  public String toString() {
    Node walker = stack1.top;
    StringBuilder string = new StringBuilder();
    while(walker != null){
      string.append("[");
      string.append(walker.value);
      string.append("]->");
      walker = walker.next;
    }
    string.append("NULL");
    return string.toString();
  }
}

