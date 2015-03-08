import java.util.*;
import java.lang.*;

public class testComplexity {

	public static void main(String[] args) {
		for (int i = 1000; i < 1001; i++) {
			int fast = i*(i+1)/2;
			int slow = i*i;
			int difference = slow - fast;
			double percent = (double) fast / slow;
			System.out.print(i*(i+1)/2 + "\t" + i*i + "\t" + difference + "\t");
			System.out.printf("%.4f", percent);
			System.out.println();
		}
	}
}