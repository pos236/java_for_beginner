package beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 1st exercise
		// simple addition calculator
		// if we haven't cover loop, do loop first
		
		
		// 2nd exercise
		//
		// use += operator
		
		
		// 3rd exercise
		// subtraction, multiplication
		
		
		// 4th exercise
		// use double for division

		
		// 5th exercise
		// use exit code to reach turn off code
		// first condition usage

		System.out.println("Turn on calculator");

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		System.out.println("current sum = " + sum);
		while (true) {
			sum = sum + sc.nextInt();
			System.out.println("current sum = " + sum);
		}

		// System.out.println("Turn on calculator");
	}

}
