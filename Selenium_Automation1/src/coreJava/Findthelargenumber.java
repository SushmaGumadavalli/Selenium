package coreJava;

import java.util.Scanner;

public class Findthelargenumber {

	public static void main(String[] args) {
		int a;// = 68;
		int b;// = 68;
		System.out.println("Enter two integers .....");
		// className referenceName = new ClassName();

		Scanner abc = new Scanner(System.in);
		a = abc.nextInt();
		b = abc.nextInt();

		int c = a + b;
		System.out.println("c value is:" + c);

		if (a > b) {
			System.out.println("A is the greater value");

		} else if (b > a) {
			System.out.println("B is the greater value");
		} else {
			System.out.println("Both are equal");
		}
		// Nested if
		boolean gender;
		if (a > b) {
			if (b == a) {

			}
		}
	}

}
