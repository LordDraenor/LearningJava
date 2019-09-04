package Inheritance;


public class Excercise2 {

	public static void main(String[] args) {
		Fruit fruit = new GoldenDelicious();
		Orange orange = new Orange();
		
		System.out.println((fruit instanceof Fruit));
		System.out.println((fruit instanceof Orange));
		System.out.println((fruit instanceof Apple));
		System.out.println((fruit instanceof GoldenDelicious));
		System.out.println((fruit instanceof McIntosh));
		System.out.println((orange instanceof Orange));
		System.out.println((orange instanceof Fruit));
		//The below is obviously wrong
	//	System.out.println((orange instanceof Apple));
		
	}

}
class Apple extends Fruit {
	public void test() {
		System.out.println("Apple");
	}
}

class Fruit {
	public void test() {
		System.out.println("Fruit");
	}
}	
class McIntosh extends Apple {
	
}	
class GoldenDelicious extends Apple {
	
}
class Orange extends Fruit{
	
}
	
