import java.util.*;

/**
 * 
 * @author Lucian
 * Learning about variables and declaration
 *
 */
public class NewCompute {
  public static void main(String[] args){	  	
	 //radius();
	 int i = 1;
	 int j = 2;
	 System.out.println(i*Math.pow(j, 2));
     //System.out.println("25/4 = " + 25/4);
	 double x = 1 -0.1-0.1-0.1-0.1-0.1;
	 ifs(x); 
	   
  }  
	  
  
  
  
  
  public static void radius(){
	      Scanner input; //= new Scanner(System.in);
	      input = new Scanner(System.in);
		  final double PI = 3.14159;
		  
		  System.out.print("Please enter a radius value:");	  
		  double radius = input.nextDouble();
		  
		  double area = radius*radius*PI;	  
		  System.out.println("The area of a circle with a radius of "+radius+" is equal to: "+area);
		  
		  input.close();		  
		  
	  }
  public static void ifs(double x){
	  final double EPSILON = 1E-14;	  
	  if (Math.abs(x-0.5)<EPSILON)
		  System.out.println(x + " is aproximately 0.5");
	  
  }
  
}
