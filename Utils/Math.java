package utils;

public class Math{
	public static long factorial(long n) {
		if(n <= 1) return 1;
	return factorial(n-1) * n;
	}
	public static long factorialLoop(long n) {
		long ret = 1;
		while(n != 1) {
			ret *= n;
			n--;
		}
		return ret;
	}
}