package beginner;

import java.util.Scanner;

public class Main {

	public static int DEFAULT_VALUE = 0;
	
	public static void main(String[] args) {
		// grid length
		int gridLength = 12;
		int[][] grid = new int[gridLength][gridLength];
		
		// 2D array for loop test
		// actually, it's not required since integer will be set 0 by default.
		for(int inx = 0; inx<gridLength; inx++) {
			for(int jnx =0; jnx < gridLength; jnx++) {
				grid[inx][jnx] = DEFAULT_VALUE;
			}
		}
		
		Scanner sc = new Scanner(System.in);
		int[] pxy = new int[3];
		while(true)	{
			// print array
			printArray(gridLength, grid);
			
			if(isGameFinished(gridLength, grid)) {
				System.out.println("Congrat!!");
				break;
			}
			
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

	private static boolean isGameFinished(int gridLength, int[][] grid) {
		for(int inx = 0; inx < gridLength; inx++) {
			for(int jnx = 0; jnx < gridLength; jnx++) {
				int row = inx;
				int column = jnx;
				
				if(
					grid[row][column] != DEFAULT_VALUE
					&&
					( fiveToRight(gridLength, grid, row, column)
					|| fiveToDown(gridLength, grid, row, column)
					|| fiveToDiagonal(gridLength, grid, row, column)
					|| fiveToSlash(gridLength, grid, row, column)
					)	)
					return true;
			}
		}
		
		return false;
	}

	private static boolean fiveToDiagonal(int gridLength, int[][] grid, int row, int column) {
		int value = grid[row][column];
		int count = 0;
		while(count<5) {
			if( row >= gridLength || column >= gridLength || grid[row][column] != value )
				break;
			else {
				row++;
				column++;
				count++;
			}	
		}
		
		return count == 5 ? true: false;
	}
	
	private static boolean fiveToSlash(int gridLength, int[][] grid, int row, int column) {
		int value = grid[row][column];
		int count = 0;
		while(count<5) {
			if( row >= gridLength || column <0 || grid[row][column] != value )
				break;
			else {
				row++;
				column--;
				count++;
			}	
		}
		
		return count == 5 ? true: false;
	}

	private static boolean fiveToDown(int gridLength, int[][] grid, int row, int column) {
		int value = grid[row][column];
		int count = 0;
		while(count<5) {
			if( row >= gridLength || grid[row][column] != value )
				break;
			else {
				row++;
				count++;
			}	
		}
		
		return count == 5 ? true: false;
	}

	private static boolean fiveToRight(int gridLength, int[][] grid, int row, int column) {
		int value = grid[row][column];
		int count = 0;
		while(count<5) {
			if( column >= gridLength || grid[row][column] != value )
				break;
			else {
				column++;
				count++;
			}	
		}
		
		return count == 5 ? true: false;
	}

	private static void printArray(int gridLength, int[][] grid) {
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
		
	}

}
