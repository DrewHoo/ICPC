import java.util.*;
public class Rijeci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt(), a = 0, b = 0;
		if (k == 0) {
			a = 1;
		} else {
			a = fib(k - 1);
			b = fib(k);
		}
		System.out.println(a + " " + b);
	}
	private static int fib(int k) {
		int f = 1;
		int s = 0;
		int temp;
		for (int i = 0; i < k; i++) {
			temp = f;
			f = f + s;
			s = temp;
		}
		return s;
	}
}