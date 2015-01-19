package TokenBuckeFilter;

import LinkedList.*;
import Problems.MiddleElement;
import Problems.Queue;
import Problems.Stack;



public class DemoTBF{
	/**
	 * @param 
	 */
	public static void main(String args[])
	{
		LinkedListHelper<Packet> l = new LinkedListHelper<Packet>();
		//List functions
		/*l.addAtStart(3);
		l.addAtEnd(5);
		l.addAtEnd(8);
		l.addAtStart(10);
		l.addAtEnd(6);
		l.display();*/
		MiddleElement<Object> mid=new MiddleElement<Object>();
	   //Finding Nth End node in the list 	
		/*
		NthEndNode<Object> Nthnode=new NthEndNode<Object>();
		IteratorCustomized<Object> itr1=l.iterator();
		IteratorCustomized<Object> itr2=l.iterator();
		int position=2;
		System.out.println("\n"+position+" Node from the end is :"+Nthnode.getNthEndNode(itr1,itr2,l,position));
		System.out.println("\nMiddle Element is "+mid.getMiddleElement(itr1,itr2,l));
		*/
		//Stack and Queue operations
	    Stack<Integer> stack=new Stack<Integer>();
	    Queue<Packet> queue=new Queue<Packet>();
	   /* stack.push(l,1);
	    stack.push(l,2);
	    stack.push(l,3);
	    stack.push(l,4);
	    stack.push(l,5);
	    stack.pop(l);
	    stack.printStack(l);
	   queue.enqueue(1);
	    queue.enqueue(2);
	    queue.enqueue(3);
	    queue.enqueue(4);
	    queue.dequeue();
	 
	    queue.printQueue();
	    
	  /*  int size=l.getSize();
	    l.display();
	    for(int i=0;i<size;i++)
	    {
	    System.out.println("\n"+queue.dequeue());
	    l.display();
	    
	    }*/
	
	 //Balanced Parenthesis
	    
	/* String symbol="{{{({})(){}}}}";
	Parenthesis parenthesis =new Parenthesis();
	System.out.println("\n"+parenthesis.checkParenthesis(l,stack,symbol));
	*/
	    
	 PacketCreation packetCreation=new PacketCreation(queue);
	 PacketRemoval packetRemoval=new PacketRemoval(queue);
	  packetCreation.start();
	  //packetRemoval.start();
 
 }
}

