package beginner;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 1st exercise
		// dynamic calculator

		// prerequisite: if, casting

		System.out.println("Turn on calculator");

		Scanner sc = new Scanner(System.in);

		double result = 0;
		System.out.println("current result = " + result);
		boolean flag = true;

		String given = null;
		int operator = 0;

//		while (flag) {
//			given = sc.next();
//			
//			if(given.equals("+") || given.equals("-") || given.equals("*") || given.equals("/")) {
//				if(given.equals("+"))	operator = 1;
//				if(given.equals("-"))	operator = 2;
//				if(given.equals("*"))	operator = 3;
//				if(given.equals("/"))	operator = 4;
//					
//				// to skip print value when operator is given
//				 continue;
//			}else if(given.equals("exit")) {
//				break;
//			}else {
//				if(operator == 1)	result += Double.valueOf(given);
//				if(operator == 2)	result -= Double.valueOf(given);
//				if(operator == 3)	result *= Double.valueOf(given);
//				if(operator == 4)	result /= Double.valueOf(given);
//			}
//			
//			System.out.println("current sum = " + result);
//		}
//
//		 System.out.println("Turn off calculator");

		
		
		// 2nd exercise
		// refactoring with constant values
		while (flag) {
			given = sc.next();
			
			switch(given) {
				case "+":
				case "-":
				case "*":
				case "/":
					if(given.equals("+"))	operator = 1;
					if(given.equals("-"))	operator = 2;
					if(given.equals("*"))	operator = 3;
					if(given.equals("/"))	operator = 4;
					break;
				case "exit":
					flag = false;
					break;
				default:
					if(operator == 1)	result += Double.valueOf(given);
					if(operator == 2)	result -= Double.valueOf(given);
					if(operator == 3)	result *= Double.valueOf(given);
					if(operator == 4)	result /= Double.valueOf(given);
					
//					System.out.println("current sum = " + result);
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("");
					System.out.println("=======================");
					System.out.println("| Calculator          |");
					System.out.println("=======================");
					System.out.print("|");
					System.out.printf("%21s", result);
					System.out.print("|");
					System.out.println("");
					System.out.println("=======================");
			}
		}

		 System.out.println("Turn off calculator");
	}

}
