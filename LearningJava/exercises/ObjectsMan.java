package exercises;

import java.sql.Time;
import java.util.Calendar;
import java.util.Random;

class ManObjects {
    private long startTime;
    private long  endTime;

    ManObjects(){
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
        System.out.println("The elapsed time in miliseconds is: " + (this.endTime-this.startTime));        
    }
}    
class ObjectsMan{
 public static void main(String args[]) {
        int[] random = new int[10000];
        int temp = 0;
        Random seed;
        for (int i = 0; i < random.length; i++) {
        	seed = new Random();
            random[i]=seed.nextInt(100000);
        }
        ManObjects currentTime = new ManObjects();        
        for (int i = 0; i < random.length; i++) {            
            int min = random[i];
            for (int j = i+1; j < random.length; j++) {
                if(random[j]<min) {
                	random[i]=random[j];
                    random[j]=min;
                    min=random[i];
                }
                    
            }
        }
        currentTime.stop();
        for (int i = 0; i < random.length; i++) {
			System.out.println(random[i]+" ");
		}        
        currentTime.getElapsedTime();
        
    }
    
}
