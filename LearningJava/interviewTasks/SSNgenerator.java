package interviewTasks;
/**
 * Yes, I know the String solution I used last would have been shorter codewise but I figured that one out after I was halfway done with the code
 * and I'm quite stubborn about deleting stuff that works 
 * @author Lucian
 *
 */
public class SSNgenerator {
	
	public static void main(String[] args) {
//		int[] test0 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//		int[] test1 = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
//		int[] test2 = { 0, 0, 1, 2, 3, 4, 5, 6, 7 };
//		int[] test3 = { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
//		int[] test4 = { 0, 0, 0, 1, 1, 1, 1, 1, 1 };
//		int[] test5 = { 1, 1, 1, 0, 0, 1, 1, 1, 1 };
//		int[] test6 = { 1, 1, 1, 1, 1, 0, 0, 0, 0 };
//		int[] test7 = { 6, 6, 6, 3, 4, 2, 6, 1, 8 };
//		int[] test8 = { 9, 0, 0, 3, 4, 2, 6, 1, 8 };
//		int[] test9 = { 9, 9, 9, 3, 4, 2, 6, 1, 8 };
		int[] x = new int[9];
		generate(x);
		while (!validate(x)) {
			generate(x);
		}
//		System.out.println(validate(test0) + "   and   " +validate(test1) + "   and   " + validate(test2) + "   and   " + validate(test3) + "   and   "
//				+ validate(test4) + "   and   " + validate(test5) + "   and   " + validate(test6) + "   and   "
//				+ validate(test7) + "   and   " + validate(test8) + "   and   " + validate(test9));
		System.out.println(
				"The generated SSN is: " + x[0] + x[1] + x[2] + "-" + x[3] + x[4] + "-" + x[5] + x[6] + x[7] + x[8]);
	}

	private static void generate(int[] x) {
		for (int i = 0; i < x.length; i++) {
			x[i] = ((int) (Math.random() * 1000)) % 10;
		}

	}

	private static boolean validate(int[] x) {
		boolean check = false;

		for (int i = 1; i < 9; i++) {
			if (x[0] == x[i])
				check = false;
			else {
				check = true;
				break;
			}
		}
		if (check) {
			for (int i = 1; i < 9; i++) {
				check = compare(x[i], x[i - 1]);
				if (check)
					break;
			}
			if ((x[0] == 0) && (x[0] == x[1])) {
				for (int i = 3; i < 9; i++) {
					check = compare(x[i], x[i - 1]);
					if (check)
						break;
				}
			}
			if ((x[0] == 0 && x[0] == x[1] && x[0] == x[2]) || (x[3] == 0 && x[3] == x[4])
					|| (x[5] == 0 && x[5] == x[6] && x[6] == x[7] && x[7] == x[8]))
				check = false;
		}
		String dummy = ((Integer) x[0]).toString() + ((Integer) x[1]).toString() + ((Integer) x[2]).toString();

		if (dummy.equals("666") || dummy.equals("900") || dummy.equals("999"))
			check = false;
		return check;
	}

	private static boolean compare(int a, int b) {
		if (a == (b + 1))
			return false;
		else
			return true;
	}
}
