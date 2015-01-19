package Problems;

import LinkedList.LinkedListHelper;



public class DemoLL {
	/**
	 * @param 
	 */
	public static void main(String args[])
	{
		LinkedListHelper<Character> list = new LinkedListHelper<Character>();
		
		/*list.addAtStart(3);
		list.addAtEnd(5);
		list.addAtEnd(8);
		list.addAtStart(10);
		list.addAtEnd(6);
		list.display();*/
		NthEndNode<Object> Nthnode=new NthEndNode<Object>();
		MiddleElement<Object> mid=new MiddleElement<Object>();
		//IteratorCustomized<Object> itr1=l.iterator();
		//IteratorCustomized<Object> itr2=l.iterator();
		int position=2;
		
		//System.out.println("\n"+position+" Node from the end is :"+Nthnode.getNthEndNode(itr1,itr2,l,position));
		//System.out.println("\nMiddle Element is "+mid.getMiddleElement(itr1,itr2,l));
	    Stack<Character> stack=new Stack<Character>();
	    Queue<Object> queue=new Queue<Object>();
	   /* stack.push(1);
	    stack.push(2);
	    stack.push(3);
	    stack.push(4);
	    stack.push(5);
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
	
	    String symbol="())";
	Parenthesis parenthesis =new Parenthesis();
	System.out.println("\n"+parenthesis.checkParenthesis(stack,symbol));
	
}
}

