package Inheritance;

public class Tee2 {
	public static void main(String[] args) {
		new Person().printPerson();
		new Student().printPerson();

		new A();
		new B();
	}
}

class Student extends Person {
	// @Override - does not work because private methods cannot be overridden - the
	// subclass and superclass methods
	// are not related in this case
	private String getInfo() {
		return "Student";
	}
}

class Person {
	private String getInfo() {
		return "Person";
	}

	public void printPerson() {
		System.out.println(getInfo());
	}
}

class A {
	int i = 7;

	public A() {
		setI(20);
		System.out.println("i from A is " + i);
	}

	public void setI(int i) {
		this.i = 2 * i;
	}
}

class B extends A {
	public B() {
		System.out.println("i from B is " + i);
	}
	//This overrides the superclass method if the subclass constructor is called
	public void setI(int i) {
		this.i = 3 * i;
	}
}