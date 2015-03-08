import java.util.*;

public class AngryChicken {
	
	public static void main(String[] args) {
		ArrayList<Integer> twix = new ArrayList<>();

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());
		int k = Integer.parseInt(s.nextLine());

		for (;;) {
			if (n-- == 0) break;
			twix.add(Integer.parseInt(s.nextLine()));

		}
	
	}
}