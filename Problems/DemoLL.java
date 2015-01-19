package Problems;

import LinkedList.IteratorCustomized;
import LinkedList.LinkedListHelper;



public class DemoLL {
	/**
	 * @param 
	 */
	public static void main(String args[])
	{
		LinkedListHelper<Integer> list = new LinkedListHelper<Integer>();
		//List functions
		list.addAtStart(3);
		list.addAtEnd(4);
		list.addAtEnd(5);
		list.addAtStart(2);
		list.addAtStart(1);
		list.addAtEnd(6);
		//list.addAtEnd(7);
		list.display();
		//NthEndNode<Object> Nthnode=new NthEndNode<Object>();
		MiddleElement<Integer> mid=new MiddleElement<Integer>();
		IteratorCustomized<Integer> itr1=list.iterator();
		IteratorCustomized<Integer> itr2=list.iterator();
		int position=4;
		 //Finding Nth End node in the list 
		//System.out.println("\n"+position+" Node from the end is :"+Nthnode.getNthEndNode(itr1,itr2,list,position));
		//Finding the middle Element
		System.out.println("\nMiddle Element is "+mid.getMiddleElement(itr1,itr2,list));
	    Stack<Character> stack=new Stack<Character>();
	    Queue<Object> queue=new Queue<Object>();
	    //stack operations
	   /* stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
	    //Queue operations
	   /* queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	    
	    int size=list.getSize();
	    list.display();
	    for(int i=0;i<size;i++)
	    {
	    System.out.println("\n"+queue.dequeue());
	    list.display();
	    
	    }*/
	//To check for balanced Parenthesis
	 String symbol="(({(}))";
	Parenthesis parenthesis =new Parenthesis();
	//System.out.println("\n"+parenthesis.checkParenthesis(stack,symbol));
	
}
}

