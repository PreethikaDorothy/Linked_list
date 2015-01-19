package Problems;

import java.util.NoSuchElementException;

import LinkedList.LinkedListHelper;


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
	LinkedListHelper<T> list=new LinkedListHelper<T>();
	public void enqueue(T data)
	{
		{
			list.addAtEnd(data);
		}
	}
		public T dequeue()
		{
			
			 T value=(T) list.getNodeAt(1).getData();
			 list.DelFirst();
			
			 return value;
			 
	}
		
		public void printQueue()
		{
			list.display();
		}
		
	
}

