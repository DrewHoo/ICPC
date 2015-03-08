import java.util.*;
public class Pisano {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) {
			int set = s.nextInt(), m = s.nextInt();
			int j = 2, f1 = 1, f2 = 1, val1 = 0, val2 = 0;
			
			if (m == 2) {
				j = 3;
			} else {
				for (; ; j+= 2) {
					f1 = (f1 + f2) % m;
					f2 = (f1 + f2) % m;
					if (f1 == 1 && f2 == 1) {
						break;
					}
				}
			}
			System.out.println(set + " " + (j));
		}
	}
}