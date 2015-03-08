import java.util.*;

public class DigitSolitaire {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, s;
		s = scanner.nextInt();
		while (s != 0) {
			System.out.print(s + " ");
			while (s > 9) {
				String string = "" + s;
				n = Integer.parseInt(String.valueOf(string.charAt(0)));
				for (int i = 1; i < string.length(); i++) {
					// System.out.println("string.charAt(i): " + string.charAt(i));
					// System.out.println("n = " + n);
					n *= Integer.parseInt(String.valueOf(string.charAt(i)));
				}
				s = n;
				System.out.print(s + " ");
			}
			s = scanner.nextInt();
			System.out.println();
		}
	}
}