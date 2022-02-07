package javapractice;

import java.util.Scanner;

public class LearYear {

	public static void leapYear() {
		int year = 0;
		if ((year % 4 == 0) && ((year % 100) != 0) || (year % 400 == 0)) {
			System.out.println(year + " year is a leap year");
		} else {
			System.out.println(year + " year is not a leap year");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 digits year");
		int year = sc.nextInt();
		leapYear();
		sc.close();

	}

}
