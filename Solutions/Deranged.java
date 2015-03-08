import java.util.*;
public class Deranged {
	public static void main(String[] args) {
		Scanner z = new Scanner(System.in);
		int n = z.nextInt();
		for (int i = 0; i < n; i++) {
			int set = z.nextInt(), numProblems = z.nextInt(), k = z.nextInt();
			long waysToFail = 1;
			for (int j = 0; j < numProblems; j++, k--) {
				if (k > 0) {
					waysToFail *= (numProblems - 1 - j);
				} else {
					waysToFail *= (numProblems - j); 
				}
			}
			System.out.println(set + " " + waysToFail);
		}
	}
}