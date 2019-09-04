package Inheritance;
/**
 * 
 * @author Lucian
 *
 */
public class InstanceOfTest {

	public static void main(String[] args) {
		SimpleGeometricObjectType1 obj1 = new CircleFromSimpleGeometricObjectType1(1);
		SimpleGeometricObjectType1 obj2 = new RectangleFromSimpleGeometricObjectType1(1, 1);
		
		
		displayObject(obj1);
		displayObject(obj2);
		
		//Check a bit of inheritance rules - subclasses are always instances of superclass's
		CircleFromSimpleGeometricObjectType1 circle = new CircleFromSimpleGeometricObjectType1(1);
		SimpleGeometricObjectType1 object =  new SimpleGeometricObjectType1();
		
		System.out.println((circle instanceof SimpleGeometricObjectType1));
		System.out.println((object instanceof SimpleGeometricObjectType1));
		System.out.println((circle instanceof CircleFromSimpleGeometricObjectType1));
		System.out.println((object instanceof CircleFromSimpleGeometricObjectType1));		
		
	}

	private static void displayObject(Object obj) {
		if(obj instanceof CircleFromSimpleGeometricObjectType1) {
			System.out.println("The circle area is "+ ((CircleFromSimpleGeometricObjectType1) obj).getArea() + " and the diameter is " +
		((CircleFromSimpleGeometricObjectType1)obj).getDiameter());			
		}
		
		else if (obj instanceof RectangleFromSimpleGeometricObjectType1) {
			System.out.println("The rectangel area is " + ((RectangleFromSimpleGeometricObjectType1) obj).getArea());
		}		
	}	
}
