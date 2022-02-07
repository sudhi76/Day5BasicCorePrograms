package javapractice;

import java.util.Scanner;

public class OddEven {
	
		static void checkEvenorOdd(int num) {
			// If remainder is zero then this number is even
			if (num % 2 == 0) {
				System.out.println("Number is even");
			}
			else {
			// If remainder is not zero then this number is odd
				System.out.println("number is odd");
			}	
		}

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);  
			System.out.println("Enter any number");
			int num = sc.nextInt();
			checkEvenorOdd(num);
			sc.close();
	}
}
