package javapractice;

import java.util.Scanner;

public class QuotientandRemainder {
	static int quotient = 0;
	static int remainder = 0;
	
	public static int quotient(int divisor, int divident) {
		quotient = divident / divisor;
		return quotient;
	}
	public static int remainder(int divisor, int divident) {
		remainder = divident % divisor;
		return remainder;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter divident & divisor:");
		Scanner sc = new Scanner(System.in);
		int divident = sc.nextInt();
		int divisor = sc.nextInt();
		System.out.println("quotient is: " + quotient(divisor,divident));
		System.out.println("remainder is: " + remainder(divisor,divident));
		
	}

}
