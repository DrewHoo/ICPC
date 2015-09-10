import java.util.*;
public class Pet {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = 1, sum = 0, winSum = 0;
		for (int i = 0; i < 5; i++){
			sum = 0;
			for (int j = 0; j < 4; j++)
				sum += in.nextInt();
			if (winSum < sum) {
				winSum = sum;
				num = i + 1;
			}
		}
		System.out.println(num + " " + winSum);
	}
}