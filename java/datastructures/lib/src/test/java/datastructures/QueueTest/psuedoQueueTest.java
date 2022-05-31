package datastructures.QueueTest;
import datastructures.queue.PsuedoQueue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class psuedoQueueTest {
 @Test void enqueueTesting(){
  PsuedoQueue sut = new PsuedoQueue();
  sut.enqueue(3);
  sut.enqueue(2);
  sut.enqueue(1);
  assertEquals("[1]->[2]->[3]->NULL",sut.toString());
 }

 @Test void dequeueTesting(){
   PsuedoQueue sut = new PsuedoQueue();
   sut.enqueue(3);
   sut.enqueue(2);
   sut.enqueue(1);
   assertEquals(3,sut.dequeue());
 }
}
