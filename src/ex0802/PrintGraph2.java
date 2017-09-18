package ex0802;

public class PrintGraph2 {
	public static void main(String[] args) {
		int i;
		for (i = 10; i > 0; i--) {
			printGraph(i);
		}
		System.out.println("");
		for (i = 1; i <= 10; i++) {
			printGraph(i);
		}
	}

	public static void printGraph(int x) {
		for (int i = 0; i < x * x; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}
}
