//P9
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;

public class SpeedCCY {
	

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		int s1 = s.nextInt();
		int s2 = s.nextInt();
		

		while (d + s1 + s2 != 0) {
			double seconds1 = (double) d / ((double) s1 / 3600);
			double seconds2 = (double) d / ((double) s2 / 3600);

			int time = (int) Math.round(seconds1 - seconds2);
			int hrs = time / 3600;
			int min = (time / 60) % 60;
			int sec = time % 60;

			System.out.printf("%d:%02d:%02d\n", hrs, min, sec);

			String hours = Integer.toString(hrs);
			String minutes = Integer.toString(min);
			String seconds = Integer.toString(sec);
			
			// if (minutes.length() < 2) { minutes = "0" + minutes;}
			// if (seconds.length() < 2) { seconds = "0" + seconds;}
			// System.out.println(hours + ":" + minutes + ":" + seconds);

			d = s.nextInt();
			s1 = s.nextInt();
			s2 = s.nextInt();
		} 

	}

}