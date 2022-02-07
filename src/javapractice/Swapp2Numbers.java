package javapractice;

import java.util.Scanner;

public class Swapp2Numbers {
	public static void swapping() {
		System.out.println("Enter two swapping numbers:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("before swapping numbers: "+num1 +" "+ num2);  
		num1 = num1 + num2;   
        num2 = num1 - num2;   
        num1 = num1 - num2;  
        System.out.println("After swapping: "+num1 +"  " + num2);   
        sc.close();
	}

	public static void main(String[] args) {
		swapping();
	}

}
