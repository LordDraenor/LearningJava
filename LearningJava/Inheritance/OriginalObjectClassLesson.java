package Inheritance;

import exercises.InvalidRadiusException;

public class OriginalObjectClassLesson {

	public OriginalObjectClassLesson() {		
	}
	
	public static void main(String [] args) throws InvalidRadiusException{
		OriginalObjectClassLesson obj = new OriginalObjectClassLesson();
		System.out.println(obj);
		displayObject(new CircleFromSimpleGeometricObjectType1(5, true, "green"));
		displayObject(new RectangleFromSimpleGeometricObjectType1(20, 15.2, "gray", false));
		
		checkOut(new String[50]);
		
		Integer[] list1 = {12, 24, 55, 1};
		Double[] list2 = {12.4, 24.0, 55.2, 1.0};
		int[] list3 = {1, 2, 3};
		printArray(list1);
		printArray(list2);
		
		//No workee due to the array being made of primitive type element whine the input variable of  the method is an array of 
		//objects
		//printArray(list3);
	}
    
	private static void displayObject(SimpleGeometricObjectType1 obj) {
		System.out.println(obj.toString());		
	}
	
	private static void checkOut(Object[] obj) {
		
	}
	
	private static void printArray(Object[] list){
		for(Object o: list) {
			System.out.print(o + " ");
		}
		System.out.println();
	}
	
}
