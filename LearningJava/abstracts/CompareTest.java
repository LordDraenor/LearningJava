package abstracts;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CompareTest {

	public static void main(String args[]) {
		ArrayList<Checked> list1 = new ArrayList<>();
		list1.add(new Checked(31));
		list1.add(new Checked(12));
		list1.add(new Checked(-13));
		list1.add(new Checked(31));

		for (int i = 0; i < list1.size(); i++) {
			for (int j = i + 1; j < list1.size(); j++) {
				System.out.println(
						"Element " + i + " compared to element " + j + " is:" + list1.get(i).compareTo(list1.get(j)));
			}
		}
		
		Calendar calendar = new GregorianCalendar(2013, 2, 1);
		Calendar calendar1 = calendar;
		Calendar calendar2 = (Calendar)calendar.clone();
	}

}

class Checked implements comparrison<Checked> {
	int value;

	public void setValue(int i) {
		this.value = i;
	}

	public int getValue() {
		return this.value;
	}

	Checked(int i) {
		setValue(i);
	}

	public int compareTo(Checked bla){
		int i;
		if(this.value==bla.getValue())
			i=0;
		else
			i = this.value > bla.getValue() ? 1 : -1;		
		return i;
	}

}

interface comparrison<E> {
	public int compareTo(E o);
}