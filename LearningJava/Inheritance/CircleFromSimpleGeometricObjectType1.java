package Inheritance;
import exercises.InvalidRadiusException;

public class CircleFromSimpleGeometricObjectType1 extends SimpleGeometricObjectType1{
	private double radius;
	
	public CircleFromSimpleGeometricObjectType1() throws InvalidRadiusException{		
		this(1.0);
	}
	
	public CircleFromSimpleGeometricObjectType1(double radius) throws InvalidRadiusException{		
		setRadius(radius);
	}
	
	public CircleFromSimpleGeometricObjectType1(double radius, boolean filled, String color) throws InvalidRadiusException{
		setRadius(radius);
		setFilled(filled);
		setColor(color);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) throws InvalidRadiusException{
		if(radius>0)
			this.radius = radius;
		else throw new InvalidRadiusException(radius);
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public double getDiameter() {
		return 2*radius;
	}
	
	
	public void printCircle() {
	  System.out.println("The circle is created " + getDateCreated() + " and the radius is " + radius);
	}
	//This overrides, the other one does not - remember that the signature needs to be the same to override or else we're just overloading
	public boolean equals(Object circle) {
		return this.radius == ((CircleFromSimpleGeometricObjectType1)circle).radius;
		}
	
	public boolean equals(CircleFromSimpleGeometricObjectType1 circle) {
		return this.radius == circle.radius;
		}
}


