package abstracts;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import Inheritance.CircleFromSimpleGeometricObjectType1;
import Inheritance.SimpleGeometricObjectType1;
import exercises.InvalidRadiusException;

public class AbstractSource {

	public AbstractSource() {

	}	
	public static void main(String[] args) throws IOException, InvalidRadiusException {

		Number numberRef = new Integer(0);
		Double doubleRef = numberRef.doubleValue();

		SimpleGeometricObjectType1 emp = new SimpleGeometricObjectType1();
		CircleFromSimpleGeometricObjectType1 veep = new CircleFromSimpleGeometricObjectType1();
		emp = veep; // no cast needed for upward use
		veep = (CircleFromSimpleGeometricObjectType1) emp; // must cast explicitly

		Number x = new Integer(3);
		System.out.println(x.intValue());
		System.out.println(((Integer) x).compareTo(new Integer(4)));
		q Q = new q();
		
	}

	interface A {
		void howToExist();
	}

	// Reference must be static or else this inner class will depend on an instance
	// of AbstractSource (the big class) which we don't have here
	static class q implements A {
		public static int value;

		q() {
			this(0);
		}

		q(int newValue) {
			this.value = newValue;
		}

		@Override
		public void howToExist() {

		}
	}

	interface C {
		void m1();
	}

	class B implements C {
		public void m1() {
			System.out.println("m1");
		}
	}
}

/*
 * Yust a little exercise since it's been a hwile
 */
//URL address = new URL("https://twitch.com/forsen");
//Scanner scan = new Scanner(address.openStream()); 
//while (scan.hasNext()) {
//System.out.println(scan.next());
//}