package exercises;

public class InvalidRadiusException extends Exception {
	private double radius;

	public InvalidRadiusException(double radius) {
		super("This is not a valid radius: " + radius);
		this.radius = radius;
	}
   public double getRadius() {
	   return radius;
   }
}
