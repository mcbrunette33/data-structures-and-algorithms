package datastructures.queue;

import datastructures.linkedlist.Node;

public class Queue {
  Node front;
  Node rear;

  public void enqueue( int value){
    Node node = new Node(value);
    if(front == null){
      front = node;
    }
    else{
      rear.next = node;
    }
    rear = node;
  }
  public void dequeue(){

  }
}
