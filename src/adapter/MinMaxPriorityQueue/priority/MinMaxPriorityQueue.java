package adapter.MinMaxPriorityQueue.priority;

/**
 * Priority queue Interface that allows addition, and removal of the maximum and minimum priority
 * item.
 *
 * @param <T> the type of data in the priority queue
 */
public interface MinMaxPriorityQueue<T> {

  /**
   * Add an item with the given priority into the queue.
   *
   * @param item     the item will be added in the queue
   * @param priority the priority
   */
  void add(T item, int priority);

  /**
   * remove and return the item with the minimum priority (as defined by the lowest numeric priority
   * above). If such an item does not exist, this method should return null.
   *
   * @return the minimum data if any, else null
   */
  T minPriorityItem();

  /**
   * remove and return the item with the maximum priority (as defined by the highest numeric
   * priority above). If such an item does not exist, this method should return null.
   *
   * @return the maximum data if any, else null
   */
  T maxPriorityItem();
}
