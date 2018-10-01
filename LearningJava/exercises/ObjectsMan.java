package exercises;

public class ObjectsMan {
	int length = 20;

	ObjectsMan(){		
	}
	
	ObjectsMan(int qqq){
		length = qqq;		
	}
	
	public void printLength() {
		System.out.println("The length is "+length);		
	}
	
	public static void main(String args[]) {
		ObjectsMan dude = new ObjectsMan(35);
		dude.printLength();		
	}
	
}
