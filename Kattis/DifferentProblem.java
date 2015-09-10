import java.util.*;
public class DifferentProblem {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			long a = in.nextLong(), b = in.nextLong();
			System.out.println(Math.abs(a - b));
			if (!in.hasNextLong()) break;
		}
	}
}