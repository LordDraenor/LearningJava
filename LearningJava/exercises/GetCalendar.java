package exercises;

import java.util.Scanner;

public class GetCalendar {
	final static int START_DAY_JANUARY_1_1800 = 3;
    public static void main(String[] args) {
//    	Scanner input = new Scanner(System.in);
//    	System.out.println("Input year (eg. 2012):");
//    	int year = input.nextInt(); 
//    	System.out.println("Input month (eg. 11):");
//    	int month = input.nextInt();
    	
    	//printMonth(year,month);
    	printMonth(1802,6);
    	printMonthBody(1802, 6);
    }
    
	public static void printMonth(int year,int month) {
    	System.out.println(month+" "+year);
    	
    }
    public static void printMonthTitle(int year,int month) {
    	System.out.println(month);
    }
    public static void printMonthBody(int year,int month) {
    	System.out.println("-----------------------------------");
    	System.out.println(" Mon  Tue  Wed  Thu  Fri  Sat  Sun");
    	boolean isStart; 
    	for (int i = 1; i < getNumberOfDaysInMonth(year, month); i++) {
    		int getStart = getStartDay(year,month);
    		isStart = (i == getStart);    		
    		String toPrint,placeholder,space;    		
    		placeholder = (i>getStart)?"  "+(i-getStart)+(space=(i>9)?" ":"  "):"     ";
			System.out.print(toPrint = isStart ? "  1  " : placeholder);			
			if(i%7==0)
				System.out.println();
		}
    	
    }
    public static int getStartDay(int year,int month) {
    	return (START_DAY_JANUARY_1_1800+getTotalNumberOfDays(year,month))%7==0?7:(START_DAY_JANUARY_1_1800+getTotalNumberOfDays(year,month))%7;
    }
    public static int getTotalNumberOfDays(int year,int month) {
    	int diff = (year-1800)>=0?(year-1800):(1800-year);
    	int days=0;
    	for (int i = 1; i <= diff; i++) {			
			int extra = isLeapYear(1800+(i-1))?1:0;
			days+=365+extra;
		}
    	for (int j = 1; j < month; j++) {
			days+=getNumberOfDaysInMonth(year, j);
		}
    	return days;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
    	switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:		
		case 10:
		case 12:
			return 31;
		case 2:
			int leap = isLeapYear(year)?1:0;
			return 28 + leap;
		case 4:
		case 6:
		case 9:
		case 11:
			return 30;
		default:
			System.out.println("Invalid value "+month);
			return 0;
		}
    	
    }
    public static Boolean isLeapYear(int year) {
    	return year%400==0||(year%4==0&&year%100!=0);
    }
}
