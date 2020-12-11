import static org.junit.Assert.assertEquals;

import priority.MinMaxPriorityQueue;
import priority.MinMaxPriorityQueueImpl;

/**
 * Test class for min and max priority queue.
 *
 * @param <String> the data type in the queue
 */
public class MinMaxPriorityQueueImplTest<String> {

  private MinMaxPriorityQueue<String> queue;

  @org.junit.Before
  public void setUp() throws Exception {
    queue = new MinMaxPriorityQueueImpl<>();
    queue.add((String) "c", 1);
    queue.add((String) "a", 3);
    queue.add((String) "b", 1);
    queue.add((String) "d", 2);
  }

  @org.junit.Test
  public void testAdd() {
    queue.add((String) "a", 4);
    assertEquals("a", queue.maxPriorityItem());
  }

  @org.junit.Test
  public void testMinPriorityItem() {
    assertEquals("c", queue.minPriorityItem());
  }

  @org.junit.Test
  public void testMaxPriorityItem() {
    assertEquals("a", queue.maxPriorityItem());
  }
}