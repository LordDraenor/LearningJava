package exercises;

class Stack {

	private int[] elements;
	private int size;
	public static final int DEFAULT_CAPACITY = 16;
	
	 /** Construct a stack with the default capacity 16 */
	public Stack() {
	this (DEFAULT_CAPACITY);
	}
	
	 /** Construct a stack with the specified maximum capacity */
	public Stack(int capacity) {
	elements = new int[capacity];
	}
	/** Push a new integer to the top of the stack */
	public void push(int value) {
		if (size >= elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
	
	elements[size++] = value;
	}
	
	/** Return and remove the top element from the stack */
	public int pop() {
	return elements[--size];
	}
	
	/** Return the top element from the stack */
	public int peek() {
	return elements[size - 1];
	}
	
	/** Test whether the stack is empty */
	public boolean empty() {
	return size == 0;
	}
	
	/** Return the number of elements in the stack */
	public int getSize() {
	return size;
	}	
	public void cheat() {
		for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}
		
	}
	
	
}
public class TestStack {
	public static void main(String[] args) {		
//	Stack stack = new Stack();	
//	stack.push(1);
//	stack.push(2);
//	System.out.println(stack.peek());
//	stack.pop();
//	System.out.println(stack.peek());
//	stack.cheat();
	
//	int x = new Integer(3) + new Integer(4);
	String[] x = "Java;Is'Fun#To~Learn".split("[~#']");
	for (int i = 0; i < x.length; i++) {
		System.out.println(x[i]);
	}
	System.out.println("Java~Is#Fun:To'Learn".replaceAll("[~#:]", "????"));
		
		
	}
}


