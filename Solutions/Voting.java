import java.util.*;

public class Voting {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			String line = s.nextLine().trim();
			if (line.equals("#")) {break;}
			int y = 0, a = 0, p = 0, n = 0;
			for (int i = 0; i < line.length(); i++) {
				if (line.charAt(i) == 'Y') {
					y++;
				} else if(line.charAt(i) == 'N') {
					n++;
				} else if (line.charAt(i) == 'A') {
					a++;
				} else {
					p++;
				}
			}
			if (Double.compare((double) a, (double)line.length() / 2) >= 0) {
				System.out.println("need quorum");
			} else if (y > n) {
				System.out.println("yes");
			} else if (y == n) {
				System.out.println("tie");
			} else if (n > y) {
				System.out.println("no");
			}
		}
	}
}