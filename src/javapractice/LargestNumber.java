package javapractice;

import java.util.Scanner;

public class LargestNumber {
	public static void greatestNumber() {
		int greatest = 0;
		System.out.println("Enter the three numbers");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if (num1 > num2 && num1 > num3) {
			greatest = num1;
		} else if (num2 > num1 && num2 > num3) {
			greatest = num2;
		} else {
			greatest = num3;
		}
		System.out.println("The greatest number among 3 numbers is:" + greatest);
		sc.close();

	}

	public static void main(String[] args) {
		greatestNumber();

	}

}
