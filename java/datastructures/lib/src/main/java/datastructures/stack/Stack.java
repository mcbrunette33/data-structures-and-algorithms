package datastructures.stack;
import datastructures.linkedlist.Node;

public class Stack {
  public Node top = null;

  public void push( int value){
    Node newNode = new Node(value);
    newNode.next = top;
    top = newNode;
  }
  public int pop(){
    if (top == null){
      throw new IllegalArgumentException("empty stack");
    }
    Node temp = new Node();
    temp = top;
    top = top.next;
    temp.next = null;
    return temp.value;
  }
  public int peek(){
    if (top == null){
      throw new IllegalArgumentException("cant peak");
    }
    return top.value;
  }
public boolean isEmpty(){
  return top == null;
}
}
