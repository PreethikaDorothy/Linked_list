package TokenBuckeFilter;
import LinkedList.*;
public class PacketCreation extends Thread
{
	Queue<Packet> q1;
	private Queue<Packet> Q1;
	public PacketCreation(Queue<Packet> Q1)
	{
		q1=Q1;
	}
	public void run()
	{
		int i=0;
		try {
			while(i<2)
			{
				i++;	
			q1.enqueue(new Packet(3));
			q1.printQueue();
			sleep(1000);
 }
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
			
	}
}

