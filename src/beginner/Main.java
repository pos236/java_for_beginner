package beginner;

import java.util.Scanner;

public class Main {

	public static int DEFAULT_VALUE = 0;
	
	public static void main(String[] args) {
		// grid length
		int gridLength = 12;
		int[][] grid = new int[gridLength][gridLength];
		
		initialize(gridLength, grid);
		
		Scanner sc = new Scanner(System.in);
		int[] pxy = new int[3];
		int[] stack = new int[100];
		int stackIndex = 0;
		while(true)	{
			// print array
			printArray(gridLength, grid);
			
			if(isGameFinished(gridLength, grid)) {
				System.out.println("Congrats!!");
				break;
			}
			
			// use array or three variables
			pxy[0] = sc.nextInt();
			
			// play game
			if(pxy[0] != -1) {
				pxy[1] = sc.nextInt();
				pxy[2] = sc.nextInt();
				playTurn(grid, pxy);
				stackIndex = pushToStack(stack, stackIndex, pxy);
			}else {
				stackIndex = popFromStack(stack, stackIndex, grid);
			}
		}
	}
	
	private static int popFromStack(int[] stack, int stackIndex, int[][] grid) {
		if(stackIndex == 0) {
			System.out.println("Grid is alreay Empty!!");
			return 0;
		}
			
		
		int y = stack[--stackIndex];
		int x = stack[--stackIndex];
		grid[x][y] = DEFAULT_VALUE;
		
		return stackIndex;
	}

	private static int pushToStack(int[] stack, int stackIndex, int[] pxy) {
		stack[stackIndex++] = pxy[1];
		stack[stackIndex++] = pxy[2];
		
		return stackIndex;
	}

	// save value at grid
	private static void playTurn(int[][] grid, int[] pxy) {
		if(grid[pxy[1]][pxy[2]] != DEFAULT_VALUE)
			System.out.println("It is already occupied!!");
		else if(pxy[0] == 1)
			grid[pxy[1]][pxy[2]] = 1;
		else
			grid[pxy[1]][pxy[2]] = 2;
	}

	// 2D array for loop test
	// actually, it's not required since integer will be set 0 by default.
	private static void initialize(int gridLength, int[][] grid) {
		for(int inx = 0; inx<gridLength; inx++) {
			for(int jnx =0; jnx < gridLength; jnx++) {
				grid[inx][jnx] = DEFAULT_VALUE;
			}
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
