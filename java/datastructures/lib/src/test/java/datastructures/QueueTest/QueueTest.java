package datastructures.QueueTest;
import datastructures.queue.Queue;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {
  @Test
  public void testQueueEnqueue() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    System.out.println(queue);
    assertEquals(1,queue.peek());
  }
  @Test
  public void testQueueDequeue() {
    Queue queue = new Queue();
    queue.enqueue(1);
    queue.enqueue(2);
    queue.enqueue(3);
    assertEquals(1,queue.dequeue());
  }

}
