package Problems;

import java.util.NoSuchElementException;

import LinkedList.IteratorCustomized;
import LinkedList.LinkedListHelper;

/**
 * @author SESA366037
 * 
 * @param <T>
 *            Generic type
 */
public class NthEndNode<T> {

	/**
	 * @param itr1
	 *            -Iterator Object traverses the list
	 * @param itr2
	 * @param list
	 *            - List Object to get the list size
	 * @param position
	 *            - specifies the position of the node
	 * @return
	 * @throws NoSuchElementException
	 */
	public T getNthEndNode(IteratorCustomized<Object> itr1,
			IteratorCustomized<Object> itr2, LinkedListHelper<Object> list,
			int position) throws NoSuchElementException

	{
		if (position>list.getSize()) {
			throw new NoSuchElementException(
			"No such Element found as position is greater than size of the list ");
			
		} else {
			// Sets the second iterator to the nth position
			itr2.pass(position-1);
			System.out.println(itr2.getValue());
			// Checks if the second iterator has reached the last element
			while (itr2.hasNext()) {
				/*
				 * Iterator traverses elements one by one till the second
				 * iterator reaches the end of the list
				 */

				itr2.traverse();
				itr1.traverse();
			}
			/*
			 * Returns the element of the first iterator - nth element from the
			 * end of list
			 */
			return (T) itr1.getValue();
		}

	}
}
