package beginner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// grid length
		int gridLength = 12;
		int[][] grid = new int[gridLength][gridLength];
		
		// 2D array for loop test
		// actually, it's not required since integer will be set 0 by default.
		for(int inx = 0; inx<gridLength; inx++) {
			for(int jnx =0; jnx < gridLength; jnx++) {
				grid[inx][jnx] = 0;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int[] pxy = new int[3];
		while(true)	{
			// print array
			for(int inx = 0; inx<gridLength; inx++) {
				for(int jnx =0; jnx < gridLength; jnx++) {
					if(grid[inx][jnx] == 1)
						System.out.print("o ");
					else if(grid[inx][jnx] == 2)
						System.out.print("x ");
					else
						System.out.print(". ");
				}
				System.out.print("\r");
			}
			System.out.print("\r");
			
			// use array or three variables
			pxy[0] = sc.nextInt();
			pxy[1] = sc.nextInt();
			pxy[2] = sc.nextInt();
			
			// save value at grid
			if(pxy[0] == 1)
				grid[pxy[1]][pxy[2]] = 1;
			else
				grid[pxy[1]][pxy[2]] = 2;
		}
	}

}
