package exercises;

import java.sql.Time;
import java.util.Calendar;

public class ObjectsMan {
	private long startTime;
	private long  endTime;

	ObjectsMan(){
		startTime = System.currentTimeMillis();
	}
	public void start() {
		startTime = System.currentTimeMillis();
	}
	public void stop() {
		endTime = System.currentTimeMillis();
	}
	
	public long getStartTime() {
		return this.startTime;
	} 
	public long getEndTime() {
		return this.endTime;
	}
	
	public void getElapsedTime() {
		System.out.println("The elapsed time is currently" + (this.endTime-this.startTime));		
	}
	
	
	public static void main(String args[]) {
		long[] random = new long[100000];
		long temp = 0;
		for (int i = 0; i < random.length-1; i++) {
			random[i]=(long)Math.random()*100000;
		}
		ObjectsMan currentTime = new ObjectsMan();		
		for (int i = 0; i < random.length-1; i++) {			
			long min = random[i];
			for (int j = 0; j < random.length-1; j++) {
				if(random[j]<min)
					temp=min;
					min=random[j];
				    random[j]=temp;
			}
		}
		currentTime.stop();
		currentTime.getElapsedTime();
		
	}
	

	
}
