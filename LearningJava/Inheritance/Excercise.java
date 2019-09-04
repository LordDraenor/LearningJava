package Inheritance;

public class Excercise {
	public static void main(String[] args)

	{
		Object fruit = new Fruit0();

		/**
		 * This is wrong since fruit is not an instance of Apple - it's tempting to
		 * think that it works since Apple is a subclass of Fruit but casting does not
		 * care about that. The class to be cast must be an instance of the target class
		 */
		Object apple = (Apple0) fruit;

		// This does not
		((Apple0) apple).test();
	}

}

class Apple0 extends Fruit0 {
	public void test() {
		System.out.println("Apple");
	}
}

class Fruit0 {
	public void test() {
		System.out.println("Fruit");
	}
}
