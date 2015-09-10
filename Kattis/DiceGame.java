import java.util.*;
public class DiceGame {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] a = new int[4];
		int[] b = new int[4];
		double[] c = new double[4];
		for (int i = 0; i < 4; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			for (int j = a[i]; j < b[i]; j++) {
				c[i] += 1.0/((double)b[i] - a[i]) * j;
			}
		}
		double gunnar = c[0] + c[1];
		double emma = c[2] + c[3];

		if (Double.compare(Math.abs(emma - gunnar), .00001) < 0) {
			System.out.println("Tie");
		} else if (Double.compare(emma, gunnar) > 0) {
			System.out.println("Emma");
		} else if (Double.compare(emma, gunnar) < 0) {
			System.out.println("Gunnar");
		}
	}
}