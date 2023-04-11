package telran.recursion.controller;

public class RecursionAppl {

	public static void main(String[] args) {
		System.out.println("GCD (18,30) - " + gcd(18, 30));
		System.out.println("sqrt(25,0.001) - " + sqrt(25, 0.001));
		System.out.println("Print100 - ");
		print100();
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a % b);
		}
	}

	public static double sqrt(double x, double precision) {
		return sqrt(x, precision, 1.0);
	}

	private static double sqrt(double x, double precision, double x0) {
		double x1 = 0.5 * (x0 + x / x0);
		double d = Math.abs(x1 - x0);
		if (d < 2 * precision && d * d < 2 * precision) {
			return x1;
		} else {
			return sqrt(x, precision, x1);
		}
	}

	public static void print100() {
		// TODO *
		// print all numbers from 1 to 10
		// don't use any loops, streams, if-else and other choice operations
		print100(1, 100);
	}

	private static void print100(int n, int to) {
		System.out.print(n + " ");
		try {
			int[] arr = new int[to - 1 - n];
			print100(n + 1, to);
		} catch (Exception e) {
			// array lenght < 0
		}
	}

}
