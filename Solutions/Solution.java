import java.util.Scanner;

public class Solution {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int t = input.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = input.nextInt();
			int c = input.nextInt();
			int m = input.nextInt();
			int candy = n / c;
			int wrappers = candy;

			while (wrappers >= m) {
				int leftoverWrappers = wrappers % m;
				int newCandy = wrappers / m;
			}
		}

	}


}