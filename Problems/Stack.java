package Problems;

import java.util.NoSuchElementException;

import LinkedList.LinkedListHelper;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class Stack<T>{

	/**
	 * @param list- List object to traverse the list
	 * @param data value to be added in the stack
	 */
	LinkedListHelper<T> list=new LinkedListHelper<T>();
	public void push(T data)
	{
		{
			list.addAtEnd(data);
		}
	}
		public T pop()
		{
			
			 T value=(T) list.getNodeAt(list.getSize()).getData();
			 list.DelLast();
			
			 return value;
			 
	}
		public T stackTop()
		{
			 T value=(T) list.getNodeAt(list.getSize()).getData();
			return value;
		}
		public void printStack()
		{
			list.display();
		}
		public boolean stackEmpty()
		{
			return list.IsEmpty();
		}
		public int stackSize()
		{
			return list.getSize();
		}
		
}

