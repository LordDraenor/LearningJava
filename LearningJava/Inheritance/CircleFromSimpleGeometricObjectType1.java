package Inheritance;

public class CircleFromSimpleGeometricObjectType1 extends SimpleGeometricObjectType1 {
	private double radius;
	
	public CircleFromSimpleGeometricObjectType1() {		
	}
	
	public CircleFromSimpleGeometricObjectType1(double radius) {
		this.radius = radius;
	}
	
	public CircleFromSimpleGeometricObjectType1(double radius, boolean filled, String color) {
		this.radius = radius;
		setFilled(filled);
		setColor(color);
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
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


