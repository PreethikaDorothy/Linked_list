package TokenBuckeFilter;
import javax.swing.plaf.basic.BasicComboPopup.ListDataHandler;
import LinkedList.*;
import Problems.Queue;
public class PacketRemoval extends Thread
{
	Queue<Packet> q2;
	private Queue<Packet> Q2;
	public PacketRemoval(Queue<Packet> Q2)
	{
		 q2 = Q2;
	}
	public void run()
	{ 
	
		
		try {
			while(true)
			{
					
			q2.dequeue();
			
			q2.printQueue();
			sleep(9000);
}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
}

