package adapter.MinMaxPriorityQueue.priority;

import java.util.Collections;
import java.util.HashSet;

/**
 * Priority queue data structure that allows addition, and removal of the maximum and minimum
 * priority item.
 *
 * @param <T> the type of data in the priority queue
 */
public class MinMaxPriorityQueueImpl<T> implements MinMaxPriorityQueue<T> {

  private int order;
  private HashSet<Wrapper<T>> hashSet;

  /**
   * Construct the queue in the data structure of a hashset, and initialize the order count.
   */
  public MinMaxPriorityQueueImpl() {
    this.order = 0;
    this.hashSet = new HashSet<>();
  }

  @Override
  public void add(T item, int priority) {
    Wrapper<T> wrapper = new Wrapper<>(item, priority, order++);
    hashSet.add(wrapper);
  }

  @Override
  public T minPriorityItem() {
    if (hashSet.size() == 0) {
      return null;
    }
    Wrapper<T> res = Collections.min(hashSet);
    hashSet.remove(res);
    return res.getData();
  }

  @Override
  public T maxPriorityItem() {
    if (hashSet.size() == 0) {
      return null;
    }
    Wrapper<T> res = Collections.max(hashSet);
    hashSet.remove(res);
    return res.getData();
  }

  public static void main(String[] args) {
    System.out.println("1");
  }
}
