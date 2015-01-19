package Problems;

import java.util.NoSuchElementException;

import LinkedList.LinkedListHelper;

/**
 * @author SESA366037
 * 
 * @param <T>
 *            Generic type
 */
public class Queue<T> {

	/**
	 * @param l
	 *            List object to traverse the list
	 * @param data
	 *            value to be added in the stack
	 */
	LinkedListHelper<T> list = new LinkedListHelper<T>();

	// Add element to the end of queue
	public void enqueue(T data) {
		{
			list.addAtEnd(data);
		}
	}

	// Remove element from the end of queue
	public T dequeue() {

		T value = (T) list.getNodeAt(1).getData();
		list.DelFirst();

		return value;

	}

	// Print the queue
	public void printQueue() {
		list.display();
	}

}
