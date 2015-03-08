import java.util.*;

public class Fly {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		for (int i = 0; i < n; i++) {
			int set = s.nextInt();
			double D = s.nextDouble(), A = s.nextDouble(), B = s.nextDouble(), F = s.nextDouble();
			double totalSpeed = A + B;
			double time = D / totalSpeed;
			double fd = F * time;
			System.out.print(set + " ");
			System.out.printf("%3.2f\n", fd);
		}
	}
}