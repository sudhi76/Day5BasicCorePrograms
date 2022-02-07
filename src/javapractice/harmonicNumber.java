package javapractice;

import java.util.Scanner;

public class harmonicNumber {
	public static void harmonicSeries() {
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of N");
		int N = sc.nextInt();
		if (N != 0) {
			for (i = 1; i < N; i++) {
				System.out.print("1/" + i + " + ");
			}
			System.out.print("1/" + i + "");
		}
		sc.close();
	}

	public static void main(String[] args) {
		harmonicSeries();
	}

}
