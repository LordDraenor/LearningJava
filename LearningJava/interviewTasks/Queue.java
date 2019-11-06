package interviewTasks;

import java.util.ArrayList;
/**
 * 
 * @author Lucian
 *
 */
public class Queue {
	private static ArrayList<Character> queue = new ArrayList<>();	
	
	
	public void enqueue(char x) {
		queue.add(x);
	}
	
	
	public char dequeue() {
		if(queue.size()>0) {
			return queue.remove(0);
		}
		else
		{
		   System.out.println("The queue is empty");	
		   System.exit(1);
		}
		return 0;
	}
}
