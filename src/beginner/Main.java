package beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nOfLines = sc.nextInt();
		int[] array = new int[nOfLines];
		
		// exercise 1. for loop
		// exercise 2. while loop
		
		for(int index = 0; index< nOfLines; index++)
			array[index] = sc.nextInt();
		sc.close();
		
		
		int sum = 0;
		for(int value: array)
			sum += value;
		
		System.out.println("average  = " + sum/array.length);
		
		// exercise 3. print reverse order
		
		// exercise 4. print odd index only
		
		
		// exercise 5. exclude min and max. and then print average of rest
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		int max = Integer.MIN_VALUE;
		int maxIndex = 0;
		
		// limitation of foreach
		for(int index = 0; index < array.length; index++) {
			if(array[index] < min) {
				minIndex = index;
				min = array[index];
			}else if(array[index] > max) {
				maxIndex = index;
				max = array[index];
			}
		}
		
		sum = 0;
		for(int index = 0; index < array.length; index++) {
			if(index != minIndex && index != maxIndex)
				sum += array[index];
		}
		
		double avg = (double) sum/(array.length-2);
		System.out.println(avg);
	}

}

