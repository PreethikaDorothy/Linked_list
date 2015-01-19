package Problems;

import java.util.NoSuchElementException;

import LinkedList.IteratorCustomized;
import LinkedList.LinkedListHelper;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class NthEndNode<T>{



	public T getNthEndNode(IteratorCustomized<Object> itr1,IteratorCustomized<Object> itr2,LinkedListHelper<Object> l,int position) throws NoSuchElementException
	
	 {    
		if(position<=l.getSize())
		{
	   
			itr2.pass(position);
			while(itr2.hasNext())
			 {
				 itr2.traverse();
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
