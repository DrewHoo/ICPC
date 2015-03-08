import java.util.*;
import java.lang.*;
import java.math.BigInteger;



public class NDaysOfChristmas {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<BigInteger> nums = new ArrayList<BigInteger>(1000000);
		BigInteger gifts;
		nums.add(BigInteger.valueOf(0));
		
		for (long i = 1; i < 1000002; i++) {
			gifts = BigInteger.valueOf((long) i * (i - 1) / 2);
			gifts = gifts.add(nums.get((int)i - 1));
			nums.add(gifts);
		}
		
		for (;;) {
			int n = s.nextInt();
			if (n == 0) return;
			System.out.println(nums.get(n + 1));
		}
	}
}