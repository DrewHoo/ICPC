import java.util.*;

public class IsFibo {
	
	public static void main(String[] args) {
		ArrayList<Long> fibs = new ArrayList<>();

		Long prev = Long.valueOf(0L);
		Long current = Long.valueOf(1L);
		Long temp;
		Long limit = Long.valueOf(10000000000L);

		fibs.add(0L);
		fibs.add(1L);
		for (;;) {
			temp = current;
			current = prev + current;
			if(current > limit) break;
			fibs.add(current);
			prev = temp;
		}
		/*for (long p : fibs) {
			System.out.println(p);
		}*/

		Scanner s = new Scanner(System.in);
		int testCases = Integer.parseInt(s.nextLine());
		Long input;
		for (;;) {
			if (testCases-- == 0) break;
			input = Long.parseLong(s.nextLine());
			if (fibs.contains(input)) {
				System.out.println("IsFibo");
			}
			else {
				System.out.println("IsNotFibo");
			}
		}
	
	}
}