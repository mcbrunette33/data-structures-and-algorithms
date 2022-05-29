package datastructures.queue;

import datastructures.linkedlist.Node;

public class Queue {
  Node front;
  Node rear;

  public void enqueue( int value){
    Node temp = new Node(value);
    if(rear == null){
      rear = temp;
    }
    else{
      front.next = temp;
    }
    front = temp;
  }
  //head = rear tail = front for dequeue
  public void dequeue(){

  }
  public boolean isEmpty(){
    return rear == null;
  }

  public int peek() {
    if(rear == null)
      return 0;
    return front.value;
  }
}
