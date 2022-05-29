  //front rear = queues
  //head, tail = linked lists
  // top = stack
package datastructures.queue;

import datastructures.linkedlist.Node;

public class Queue {
  Node front;
  Node rear;

  public void enqueue( int value){
    Node temp = new Node(value);
    if(front == null){
      front = temp;
    }
    else{
      rear.next = temp;
    }
    rear = temp;
  }
  public int dequeue(){
    if (isEmpty()){
      throw new IllegalArgumentException("queue empty");
    }
    Node temp = front;
    front = front.next;
    temp.next = null;
    return temp.value;




  }
  public int peek() {
    if(rear == null)
      return 0;
    return front.value;
  }
  public boolean isEmpty(){
    return rear == null;
  }
}
