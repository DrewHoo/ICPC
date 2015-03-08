import java.util.*;
import java.math.BigInteger;

public class nDaysOfChristmas {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<BigInteger> abi = new ArrayList<BigInteger>();
		abi.ensureCapacity(1000000);
		BigInteger gifts = BigInteger.valueOf(0);
		abi.add(gifts);

		for(long i = 1; i < 1000001; i++) { /*fill the list */
			gifts = BigInteger.valueOf(i * (i + 1) / 2);
			abi.add(gifts.add(abi.get((int)i - 1)));
		}

		for (;;) {
			int index = s.nextInt();
			if (index == 0) return;
			System.out.println(abi.get(index).toString());
		}
	}
}