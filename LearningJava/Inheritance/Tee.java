package Inheritance;

class Cee {
	private double radius;

	public Cee(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * Math.PI;
	}	
}

class Bee extends Cee {
	private double length;	
	
	Bee(double radius, double length) {
		super(radius);
		this.length = length;
	}

	@Override
	public double getArea() {
		return super.getArea() * length;
	}
}

 
public class Tee {
	public static void main(String [] args) {
		Bee b = new Bee(5.0, 6.1);
		System.out.println(b.getArea());
	}
}