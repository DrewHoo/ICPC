import java.util.*;
public class Duplicate {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt();
			if (n == 0) {break;}
			int prev = s.nextInt();
			for (int i = 1; i < n; i++) {
				int next = s.nextInt();
				if (prev == next) {

				} else {
					System.out.print(prev + " ");
				}
				if (i == n - 1) {
					System.out.print(next + " ");
				}
				prev = next;
			}
			if (n == 1) {
				System.out.print(prev + " ");
			}
			System.out.println("$");
		}
	}
}