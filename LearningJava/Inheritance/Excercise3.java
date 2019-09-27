package Inheritance;

import java.util.ArrayList;
import java.util.Arrays;

import exercises.InvalidRadiusException;

public class Excercise3 {
	public static void cry(String[] args) throws InvalidRadiusException{
		Object circle1 = new CircleFromSimpleGeometricObjectType1(1);
		Object circle2 = new CircleFromSimpleGeometricObjectType1(1);
		System.out.println(circle1.equals(circle2));
	}

	public static void main(String[] args) throws InvalidRadiusException {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Beijing");
		cityList.add("Washington D.C.");
		System.out.println(cityList.size());
		System.out.println(cityList.get(2));
		System.out.println("Is Miami in the list? " + cityList.contains("Miami"));
		cityList.add("Xian");
		ArrayList<String> cityList2 = new ArrayList<>();
		cityList2.add("Miami");
		cityList2.add("New York");
		cityList2.add("Moscow");
		cityList.addAll(cityList2);
		for (int i = 0; i < cityList.size(); i++) {
			System.out.println(cityList.get(i));
		}
		
		ArrayList<CircleFromSimpleGeometricObjectType1> circles = new ArrayList<>();
		circles.add(new CircleFromSimpleGeometricObjectType1(3));
		circles.add(new CircleFromSimpleGeometricObjectType1(1.5, true, "green"));
		
		for (int i = 0; i < circles.size(); i++) {
			System.out.println("The area of circle number " +(i+1)+" is "+ circles.get(i).getArea());
		}
		
		//List from an Array
		ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
		//Array from a list - notice how none of these come from the Array class. They are more complex methods. But both apply to the Array :)
		String[] placess = new String[places.size()];
		places.toArray(placess);
		
		places.add("Madrid");
		for (int i = 0; i < places.size(); i++) {
			System.out.println(places.get(i));
		}
		
		System.out.println(cityList.toString());
		java.util.Collections.sort(cityList);
		System.out.println(cityList.toString());		
		
	}

}
