package Inheritance;

public class Excercise3 {
	public static void main(String[] args) {
		Object circle1 = new CircleFromSimpleGeometricObjectType1(1);
		Object circle2 = new CircleFromSimpleGeometricObjectType1(1);
		System.out.println(circle1.equals(circle2));
	}
}


