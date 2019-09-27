package exercises;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		short x = 24, y = 42, z;
		int total;
		total = x + y;	
		System.out.println(total);
		
		//Error - null is not a value. It's just null
		Object o = null;
	//	System.out.println(o.toString());
		Scanner input = new Scanner(System.in);
		System.out.print("Type something that looks like a double number: ");
		System.out.println(isNumeric(input.next()));
		
	}
	
	public static boolean isNumeric(String token) {
		try {
		Double.parseDouble(token);
		return true;
		}
		catch (java.lang.NumberFormatException ex) {
		return false;
		}
		}

}
