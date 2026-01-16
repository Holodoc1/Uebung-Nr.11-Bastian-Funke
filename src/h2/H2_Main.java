package h2;

public class H2_Main {

	public static void main(String[] args) {
		int n = 30;
		benchmark(n);
	}
	
	public static int fibonacci(int n) {
		if(n == 1 || n == 2) return 1;
		else return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public static int fibonacciCached(int n, int[] cache) {
		if(n == 1 || n == 2) return 1;
		else {
			if(cache[n - 1] != 0) {
				return cache[n - 1];
			}else {
				cache[n - 1] = fibonacciCached(n - 1, cache) + fibonacciCached(n - 2, cache);
				return cache[n - 1];
			}
		}
	}
	
	public static int fibonacciIterative(int n) {
		int result = 1;
		if(n > 2) {
			int pre = 1;
			for(int i = 3; i <= n; i++) {
				int temp = result;
				result += pre;
				pre = temp;
			}
		}
		return result;
	}
	
	public static void benchmark(int n) {
		int[] cache = new int[n];
		
		long startTime = System.nanoTime();	
		fibonacci(n);
		long elapsedTime = System.nanoTime() - startTime;
		System.out.println("Elapsed nanoseconds fibonacci: " + elapsedTime);
		
		long startTime2 = System.nanoTime();	
		fibonacciIterative(n);
		long elapsedTime2 = System.nanoTime() - startTime2;
		System.out.println("Elapsed nanoseconds fibonacciIterative: " + elapsedTime2);
		
		long startTime3 = System.nanoTime();	
		fibonacciCached(n,cache);
		long elapsedTime3 = System.nanoTime() - startTime3;
		System.out.println("Elapsed nanoseconds fibonacciCached: " + elapsedTime3);
	}
}
