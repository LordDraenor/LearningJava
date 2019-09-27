package Inheritance;

import exercises.InvalidRadiusException;

public class RectangleFromSimpleGeometricObjectType1 extends SimpleGeometricObjectType1 {
	private double width;
	private double height;

	public RectangleFromSimpleGeometricObjectType1() {
	}

	public RectangleFromSimpleGeometricObjectType1(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public RectangleFromSimpleGeometricObjectType1(double widht, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);

	}

	public double getWidht() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return width * height;
	}

	public double getPerimeter() {
		return 2 * (width + height);
	}
}

class TestObjects {

	public static void main(String[] args) throws InvalidRadiusException {

		CircleFromSimpleGeometricObjectType1 circle = new CircleFromSimpleGeometricObjectType1(1);
		System.out.println("A circle " + circle.toString());
		System.out.println("The color is " + circle.getColor());
		System.out.println("The radius is " + circle.getRadius());
		System.out.println("The area is " + circle.getArea());
		System.out.println("The diameter is " + circle.getDiameter());
		
		RectangleFromSimpleGeometricObjectType1 rectangle = new RectangleFromSimpleGeometricObjectType1(2, 4);
		System.out.println("\nA rectangle " + rectangle.toString());
		System.out.println("The area is " + rectangle.getArea());
		System.out.println("The perimeter is " + rectangle.getPerimeter());
	}
}