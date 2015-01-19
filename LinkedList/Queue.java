package LinkedList;

import java.util.NoSuchElementException;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class Queue<T>{

	/**
	 * @param l List object to traverse the list
	 * @param data value to be added in the stack
	 */
	LinkedListHelper<T> l=new LinkedListHelper<T>();
	public void enqueue(T data)
	{
		{
			l.addAtEnd(data);
		}
	}
		public T dequeue()
		{
			
			 T value=(T) l.getNodeAt(1).getData();
			 l.DelFirst();
			
			 return value;
			 
	}
		
		public void printQueue()
		{
			l.display();
		}
		
	
}

