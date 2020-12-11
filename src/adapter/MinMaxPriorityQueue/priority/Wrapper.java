package adapter.MinMaxPriorityQueue.priority;

/**
 * Wrapper class that contains the data and priority, also with a order count for the data with same
 * priority.
 *
 * @param <T> the type of data in the priority queue
 */
public class Wrapper<T> implements Comparable<Wrapper<T>> {

  private final int priority;
  private final int order;
  private final T data;

  /**
   * Construct the wrapper with the data, priority and order.
   *
   * @param data     the data
   * @param priority the priority
   * @param order    the order
   */
  public Wrapper(T data, int priority, int order) {
    this.data = data;
    this.priority = priority;
    this.order = order;
  }

  /**
   * Get the data inside the wrapper class.
   *
   * @return the data
   */
  public T getData() {
    return data;
  }

  @Override
  public int compareTo(Wrapper<T> o) {
    if (this.priority == o.priority) {
      return this.order - o.order;
    } else {
      return this.priority - o.priority;
    }
  }
}
