import java.util.*;
public class Balloons {
	public static class Team {
		int total;
		int distA;
		int distB;
		public Team(int total, int distA, int distB) {
			this.total = total;
			this.distA = distA;
			this.distB = distB;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int N, A, B;
			N = s.nextInt(); //num teams; 1 <= N <= 1,000
			A = s.nextInt(); //num balloons in room A; 0 <= A <= 10,000
			B = s.nextInt(); //num balloons in room B; 0 <= B <= 10,000
			ArrayList<Team> a = new ArrayList<Team>(N);
			for (int i = 0; i < N; i++) {
				a.add(new Team(s.nextInt(), s.nextInt(), s.nextInt()));
			}
		}


	}
}