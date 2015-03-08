import java.util.*;

public class UtopianTreeDynamic {
	
	public static void main(String[] args) {
		ArrayList<long> fibs = new ArrayList();

		long prev = 0;
		long current = 1;
		long temp;

		fibs.add(0);
		for (;;) {
			temp = current;
			current = prev + current;
			fibs.add(current);
			prev = temp;
			if(current > 100) break;
		}
		for (long p : fibs) {
			System.out.println(p);
		}
	
	}
}