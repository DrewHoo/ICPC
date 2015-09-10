import java.util.*;
public class ProblemsJudging2 {
	private static class judgment {
		String name;
		public judgment(String name) {
			this.name = name;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		LinkedList<judgment> judgments = new LinkedList<judgment>();
		for (int i = 0; i < n; i++) {
			judgments.add(new judgment(in.next()));
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			String str = in.next();
			for (judgment j : judgments)
				if (j.name.equals(str)) {
					judgments.remove(j);
					sum++;
					break;
				}
		}
		System.out.println(sum);
	}
}