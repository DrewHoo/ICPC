import java.util.*;

public class viveLaDifference {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		do {
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
			int index = 0;
			while (!(a == b && b == c && c == d && d == a)) {
				int ta = Math.abs(a - b);
				int tb = Math.abs(b - c);
				int tc = Math.abs(c - d);
				int td = Math.abs(d - a);
				// System.out.print(a + "\t");
				// System.out.print(b + "\t");
				// System.out.print(c + "\t");
				// System.out.println(d);
				a = ta;
				b = tb;
				c = tc;
				d = td;
				index++;
			}
			System.out.println(index);
		} while (0 != a + b + d + c);

	}

}