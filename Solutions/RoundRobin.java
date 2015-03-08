import java.util.*;
public class RoundRobin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int players = s.nextInt(); players != 0; players = s.nextInt()) {
			int count = 0, turns = s.nextInt(), k = 0;
			int[] a = new int[players];
			boolean playersHaveDifferentScores = true;
			while (playersHaveDifferentScores) { //each loop completes 1 turn
				playersHaveDifferentScores = false;
				for (int i = 0; i < turns; i++, k++){
					k = (k >= a.length) ? 0 : k;
					a[k]++;
				}
				if (k == 0) {
					k = a.length - 1;
				} else {
					k--;
				}
				// System.out.println("before: " + Arrays.toString(a));
				// System.out.println(a[k - 1] + " " + a[k] + " " + a[k+1]);
				a = (a.length != 1) ? resize(a, k) : a;
				// System.out.println("after: " + Arrays.toString(a));
				//check to see if scores are the same
				for (int i = 1; i < a.length; i++) {
					if (Integer.compare(a[i-1], a[i]) != 0) {
						playersHaveDifferentScores = true;
					}
				}
				if (!playersHaveDifferentScores) {
					System.out.println(a.length + " " + a[0]);
				}
			}
		}
	}
	//pivot is the index of the array that is to be deleted
	public static int[] resize(int[] a, int pivot) {
		int[] b = new int[a.length - 1];
		for (int i = pivot; i < a.length - 1; i++) {
			a[i] = a[i+1];
		}
		for (int i = 0; i < b.length; i++) {
			b[i] = a[i];
		}
		return b;
	}
}