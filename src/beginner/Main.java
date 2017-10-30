package beginner;

public class Main {

	public static void main(String[] args) {
		int fibonacci = 9;
		// 1 1 2 3 5 8 13 21 34
		System.out.println(fibonacci(fibonacci));
	}

//	private static int fibonacci(int n) {
//		if( n == 0)
//			return 0;
//		
//		if( n == 1)
//			return 1;
//		
//		return fibonacci(n-1) + fibonacci(n-2);
//	}
	
	private static int fibonacci(int n) {
		if( n == 0)
			return 0;
		
		if( n == 1 || n == 2 )
			return 1;
		
		int[] fibonacci = new int[n];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		int index = 2;
		while(index < n) {
			fibonacci[index] = fibonacci[index-1] + fibonacci[index-2];
			index++;
		}
		
		return fibonacci[n-1];
	}
}
