package Food;
import java.util.*;

/**
 * @author Lucian
 * Learning about variables and declaration
 */
public class NewCompute {
  public static void main(String[] args){	  	
	 //radius();
//	 int i = 1;
//	 int j = 2;
//	 System.out.println(i*Math.pow(j, 2));
//     //System.out.println("25/4 = " + 25/4);
//	 double x = 1 -0.1-0.1-0.1-0.1-0.1;
//	 ifs(x); 
//	 que();
	 String a = "baaaa";
	 String b = "qqqqq";
	 System.out.println(a.compareTo(b));	
	 System.out.println(1 + "Welcome " + ('\u0001' + 1));
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
  
  public static void que(){
	  char c = 'A';
	  int i = (int)c;
	  float f = 1000.34f;
	   i = (int)f;
	  double d = 1000.34;
	   i = (int)d;
	   i = 97;
	   c = (char)i;
	   System.out.println("que");
  }
}
