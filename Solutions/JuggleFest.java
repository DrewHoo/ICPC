import java.util.*;
public class JuggleFest {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int n = s.nextInt(); n != 0; n = s.nextInt()) { //for each input line
			boolean crashed = false;
			Scanner line = new Scanner(s.nextLine().trim());
			char[] a = new char[20];
			for (int poop = 0; poop < 20; poop++) {
				a[poop] = ' ';
			}
			char ball = 'A';
			for (int i = 0; i < n; i++) { // for each ball
				int h = line.nextInt();
				for (int j = i; j < 20; j += h) {// fill array with ball pattern
					if (j == i) {

					} else {
						if (a[j] == ' ') {
							a[j] = ball;
						} else {
							crashed = true;
							System.out.println("j: " + j + "\tball: " + ball + "\ti: " + i + "\th: " + h);
							System.out.println(a);
						}
					}
				}
				ball++;
			}
			if (crashed) {
				System.out.println("CRASHED");
			} else { 
				for (char c : a) {
					if (c != ' ') System.out.print(c);
				}
				System.out.println();
			}
		}
	}
}