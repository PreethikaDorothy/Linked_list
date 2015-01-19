package Problems;

import LinkedList.LinkedListHelper;



public class DemoLL {
	/**
	 * @param 
	 */
	public static void main(String args[])
	{
		LinkedListHelper<Character> l = new LinkedListHelper<Character>();
		/*l.addAtStart(3);
		l.addAtEnd(5);
		l.addAtEnd(8);
		l.addAtStart(10);
		l.addAtEnd(6);
		l.display();*/
		NthEndNode<Object> Nthnode=new NthEndNode<Object>();
		MiddleElement<Object> mid=new MiddleElement<Object>();
		//IteratorCustomized<Object> itr1=l.iterator();
		//IteratorCustomized<Object> itr2=l.iterator();
		int position=2;
		
		//System.out.println("\n"+position+" Node from the end is :"+Nthnode.getNthEndNode(itr1,itr2,l,position));
		//System.out.println("\nMiddle Element is "+mid.getMiddleElement(itr1,itr2,l));
	    Stack<Character> stack=new Stack<Character>();
	    Queue<Object> queue=new Queue<Object>();
	  /*  stack.push(l,1);
	    stack.push(l,2);
	    stack.push(l,3);
	    stack.push(l,4);
	    stack.push(l,5);
	   /* queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	    
	    int size=l.getSize();
	    l.display();
	    for(int i=0;i<size;i++)
	    {
	    System.out.println("\n"+queue.dequeue(l));
	    l.display();
	    
	    }*/
	
	    String symbol="({()})";
	Parenthesis parenthesis =new Parenthesis();
	System.out.println("\n"+parenthesis.checkParenthesis(l,stack,symbol));
	
}
}

