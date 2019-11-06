package interviewTasks;

import java.util.Scanner;

/**
 * 
 * @author Lucian
 *
 */
public class UniqueNames {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Input first name prefix: ");
		String firstPre = scanner.next();
		System.out.print("Input last name suffix: ");
		String lastSuf = scanner.next();
		System.out.println("The generated name is: " + firstPre + getChar(5) + " " + getChar(5) + lastSuf

		);

	}

	private static String getChar(int x) {
		String returner = "";
		for (int i = 0; i < x; i++)
			returner += ((Character) ((char) ('a' + Math.random() * ('z' - 'a' + 1)))).toString();
		return returner;
	}

}
