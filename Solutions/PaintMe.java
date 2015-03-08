import java.util.Scanner;
import java.lang.Math;


public class PaintMe {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		for(;;){
			int n = s.nextInt();
			if (n == 0) return;
			int width = s.nextInt();
			int length = s.nextInt();
			int height = s.nextInt();
			int area = s.nextInt();
			int m = s.nextInt();
			int surface = 	width * length +		//ceiling
							width * height * 2 +	//2 walls
							length * height * 2;	//other 2 walls
			for (int i = 0; i < m; i++) {
				int wHeight = s.nextInt();
				int wLength = s.nextInt();
				surface -= wHeight * wLength;
			}
			System.out.println((int)Math.ceil((double)n * surface / area));
		}

	}
}

/*
50 8 20 8 350 2
6 3
3 3
50 8 20 8 300 3
6 3
5 3
3 3
*/