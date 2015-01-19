package LinkedList;

import java.util.NoSuchElementException;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class MiddleElement<T>{



	public T getMiddleElement(IteratorCustomized<Object> itr1,IteratorCustomized<Object> itr2,LinkedListHelper<Object> l) throws NoSuchElementException
	
	 {    
		if(l.getSize()!=0)
		{
	   
			//itr2.pass(2);
		
			System.out.println(itr2.getValue());
			while(itr2.hasNext())
			 {
				 itr2.pass(2);
				 itr1.traverse();
			 }
			 return (T) itr1.getValue();
		}
		else
		{
			throw new NoSuchElementException("No such Element found as position is greater than size of the list ");
		}
		
		}
}
