import java.util.*
import java.lang.*

public class FizzBuzz {

	for(int i = 1; i < 101; i++) {
		if (i % 3 == 0) {
			System.out.print("Fizz");
		}
		else if (i % 5 == 0) {
			System.out.print("Buzz");
		}
		else {
			System.out.print(i);
		}

		System.out.println();
	}
}