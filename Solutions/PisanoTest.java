import java.util.*;
public class PisanoTest {
	public static void main(String[] args) {
		
		long[] fibonacci = new long[1000000];
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for (int i = 2; i < fibonacci.length; i++) {
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
		}
		
		//how to detect a sequence?
		
	}
}