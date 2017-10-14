package ex1304;

public class FactorialTest {
	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

	public static int factorial(int n) {
		int x = 1;
		for (int k = n; k > 0; k--) {
			x = x * k;
		}
		return x;
	}
}
