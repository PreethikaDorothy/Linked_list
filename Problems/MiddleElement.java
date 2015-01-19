package Problems;

import java.util.NoSuchElementException;

import LinkedList.IteratorCustomized;
import LinkedList.LinkedListHelper;


/**
 * @author SESA366037
 *
 * @param <T> Generic type
 */
public class MiddleElement<T>{



	/**
	 * @param itr1 - Iterator Object to traverse the list 
	 * @param itr2
	 * @param list - List object to get the list size 
	 * @return
	 * @throws NoSuchElementException
	 */
	public T getMiddleElement(IteratorCustomized<T> itr1,IteratorCustomized<T> itr2,LinkedListHelper<T> list) throws NoSuchElementException
	
	 {    
		if(!list.IsEmpty())
		{
	  
			while(itr2.hasNext())
			 {
				 itr1.pass(1);
				 itr2.pass(2);
				// System.out.println(itr1.getValue()+" "+itr2.getValue());
				
			 }
			 return (T) itr1.getValue();
		}
		else
		{
			throw new NoSuchElementException("No such Element found as position is greater than or less than size of the list ");
		}
		
		}
}
