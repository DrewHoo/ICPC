import java.util.*;
public class Islands {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int prev, next, count = 0, set = s.nextInt();
			prev = s.nextInt();
			for (int j = 1; j < 15; j++) {
				next = s.nextInt();
				if (next > prev) {
					count++;
				}
				prev = next;
			}
		System.out.println(set + " " + count);
		}
	}
}