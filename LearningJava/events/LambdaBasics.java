package events;

/**
 * Ok, this is getting weird.
 * The element e is implicitly detected from the method contract - since there is only one variable passed it becomes an object of type T1, T2, T3 for each of the method calls
 * 
 * @author Lucian
 *
 */
public class LambdaBasics {
	public static void main(String[] args) {
		LambdaBasics test = new LambdaBasics();
		// We use () here because the method we are implementing has no passed variables so e is nothing and would throw up an error. We are still 
		//implementing the method however so () is used
		test.setAction1(() -> System.out.print("Action 1! "));
		//e is infered to be a double type for both of these since that is the only parameter of the only method the interfaces have
		test.setAction2(e -> System.out.print(e + " "));
		//This time we return the method so our implementation can't be the printing directly
		System.out.println(test.setAction3(e -> e * 2));
	}
//Remember that we can declare variables of an interface type - when a variable is declared to be of an interface type, it simply means that
//the object is expected to have implemented that interface. So whatever is passed as t will need to implement m() in this case
//So every time we call this method whatever object is passed as t will implement T1
	public void setAction1(T1 t) {
		t.m();
	}

	public void setAction2(T2 t) {
		t.m(4.5);
	}

	public double setAction3(T3 t) {
		return t.m(5.5);
	}
}

//These are empty interfaces that will be implemented by the lambda expressions
interface T1 {
	public void m();
}

interface T2 {
	public void m(Double d);
}

interface T3 {
	public double m(Double d);

}
