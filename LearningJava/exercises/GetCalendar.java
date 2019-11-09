package exercises;

import java.util.Scanner;

public class GetCalendar {
	final static int START_DAY_JANUARY_1_1800 = 3;
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int month;
    	System.out.println("Input year (eg. 2012):");
    	int year = input.nextInt(); 
    	System.out.println("Input month (eg. 11) or 0 to end:");
    	month = input.nextInt();
    	while (month !=0) {			
			printMonth(year, month);
			System.out.println("Input month (eg. 11) or 0 to end:");
			month = input.nextInt();
		}    	
    	input.close();
    	
    }
    
	public static void printMonth(int year,int month) {
    	printMonthTitle(year,month);
    	printMonthBody(year,month);    	
    }
    public static void printMonthTitle(int year,int month) {
    	System.out.print("          "+getMonthName(month)+"  ");
    	System.out.println(year);
    	System.out.println("-----------------------------------");
    	System.out.println(" Mon  Tue  Wed  Thu  Fri  Sat  Sun");
    }
    private static String getMonthName(int month) {    	
    	switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "Octomber";
		case 11:
			return "November";
		case 12:
			return "December";
		default:
			break;
		}		
		return null;
	}

	public static void printMonthBody(int year,int month) {   
		if(year==1752&&month==9) {
			System.out.println("                 1     2   14   15");
			System.out.println("  16   17  18   19    20   21   22");
			System.out.println("  23   24  25   26    27   28   29");
			System.out.println("  30");
			return;
		}
    	boolean isStart; 
    	int totalChars = getNumberOfDaysInMonth(year, month);
    	int getStart = getStartDay(year,month);
    	
    	for (int i = 1; i < totalChars; i++) {    		
    		isStart = (i == getStart);    		
    		String toPrint,placeholder,space;  
    		
    		placeholder = (i>getStart)?"  "+(i-getStart+1)+(space=(i-getStart+1>9)?" ":"  "):"     ";
    		if (placeholder.equals("     "))
    			totalChars++;
			System.out.print(toPrint = isStart ? "  1  " : placeholder);
			
			if(i%7==0||i==totalChars-1)
				System.out.println();
		}
    	
    }
	
    public static int getStartDay(int year,int month) {
    	if((1800-year)>0)
    		return (7-(getTotalNumberOfDays(year, month)-START_DAY_JANUARY_1_1800)%7)==0?7:7-(getTotalNumberOfDays(year, month)-START_DAY_JANUARY_1_1800)%7;    			
    	else
    		return (getTotalNumberOfDays(year,month)+START_DAY_JANUARY_1_1800)%7==0?7:(getTotalNumberOfDays(year,month)+START_DAY_JANUARY_1_1800)%7;
    }
    
    public static int getTotalNumberOfDays(int year,int month) {
    	int diff = Math.abs(year-1800);
    	int days=0;    	
    	int extra;
    	
    	for (int i = 1; i <= diff; i++) {			
			if((1800-year)>0) {
				extra = (i==diff&&month>2)?0:isLeapYear(1800-i)?1:0;}				
			else {
				extra = isLeapYear(1800+(i-1))?1:0;}
			days+=365+extra;			
		}
    	if(year<=1752) {
    		days-=11;
    	}
    	if((1800-year)>0) {
    		for (int j = 12; j >= month; j--) {
			days+=getNumberOfDaysInMonth(year, j);
		}   
    		if(month<=2&&isLeapYear(year))
    			days-=1;
    		days=days-365;    		
    	}	    	
    	else{
    		for (int j = 1; j < month; j++) {
				days+=getNumberOfDaysInMonth(year, j);
			}}
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
			if(year==1700)
				leap=1;
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
    public static boolean isLeapYear(int year) {
    	return year%400==0||(year%4==0&&year%100!=0);
    }
}
