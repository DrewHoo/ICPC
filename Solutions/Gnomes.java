import java.util.*;
public class Gnomes {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		System.out.println("Gnomes:");
		for (int i = 0; i < n; i++) {
			int one = s.nextInt(), two = s.nextInt(), three = s.nextInt();
			if (one <= two && two <= three) {
				System.out.println("Ordered");
			} else if (three <= two && two <= one) {
				System.out.println("Ordered");
			} else {System.out.println("Unordered");}
		}
	}
}