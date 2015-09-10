import java.util.*;
public class ProblemsJudging {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		HashMap<String, Integer> hm = new HashMap<String, Integer>(n);
		for (int i = 0; i < n; i++) {
			String verdict = in.next();
			if (hm.containsKey(verdict)) {
				hm.put(verdict, hm.get(verdict) + 1);
			} else {
				hm.put(verdict, 1);
			}
		}
		int k = 0;
		for (int i = 0; i < n; i++) {
			String verdict = in.next();
			if (hm.containsKey(verdict) && hm.get(verdict) > 0) {
				k++;
				hm.put(verdict, hm.get(verdict) - 1);
			}
		}
		System.out.println(k);
	}
}