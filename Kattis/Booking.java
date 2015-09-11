import java.util.*;
public class Booking {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt(), n = in.nextInt();
		if (r == n) {
			System.out.println("too late");
		} else {
			int[] a = new int[r];
		for (int i = 0; i < n; i++)
			a[in.nextInt() - 1] = 1;
		for (int i = 0; i < r; i++)
			if (a[i] != 1) {
				System.out.println(i + 1);
				break;
			}	
		}
	}
}