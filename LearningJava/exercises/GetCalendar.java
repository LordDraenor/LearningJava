package exercises;

import java.util.Scanner;

public class GetCalendar {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.println("Input year (eg. 2012):");
    	int year = input.nextInt(); 
    	System.out.println("Input month (eg. 11):");
    	int month = input.nextInt();
    	
    	printMonth(year,month);
    }
    public static void printMonth(int year,int month) {
    	System.out.println(month+" "+year);
    	
    }
    public static void printMonthTitle(int year,int month) {
    	System.out.println(month);
    }
    public static void printMonthBody(int year,int month) {
    	
    }
    public static int getStartDay(int year,int month) {
    	return 1;
    }
    public static int getTotalNumberOfDays(int year,int month) {
    	return 1000;
    }
    public static int getNumberOfDaysInMonth(int year, int month) {
    	return 30;
    }
    public static Boolean isLeapYear(int year) {
    	return false;
    }
}
