package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int yearGiven = in.nextInt();
		
		boolean leapYear = ((yearGiven%4==0) && ((yearGiven%100)!=0)) || ((yearGiven%400)==0);
		System.out.println(yearGiven + " is a leap year: " + leapYear);
	}

}
