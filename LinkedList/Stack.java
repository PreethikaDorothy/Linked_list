package LinkedList;

import java.util.NoSuchElementException;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class Stack<T>{

	/**
	 * @param l List object to traverse the list
	 * @param data value to be added in the stack
	 */
	public void push(LinkedListHelper<T> l,T data)
	{
		{
			l.addAtEnd(data);
		}
	}
		public T pop(LinkedListHelper<T> l)
		{
			
			 T value=(T) l.getNodeAt(l.getSize()).getData();
			 l.DelLast();
			
			 return value;
			 
	}
		public T stackTop(LinkedListHelper<T> l)
		{
			 T value=(T) l.getNodeAt(l.getSize()).getData();
			return value;
		}
		public void printStack(LinkedListHelper<T> l)
		{
			l.display();
		}
		
}

