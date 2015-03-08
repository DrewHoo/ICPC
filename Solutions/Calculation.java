import java.util.*;

public class Calculation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 0; i < n; i++) { //input level
			String table = "------+---------\n time | elapsed\n------+---------\n";
			System.out.print(table);
			int sh, sm, dh, dm, duration;
			sh = s.nextInt();
			sm = s.nextInt();
			dh = s.nextInt();
			dm = s.nextInt();
			duration = (dm == 0) ? dh : dh + 1;
			duration = (dh == 0) ? 0 : duration;
			duration = (sm == 0 || dh == 1) ? duration - 1 : duration;
			// System.out.println("duration: " + duration);

			if (sm == 0 || duration == 0) {
				if (sh < 10) {System.out.print(" ");}
				System.out.println(sh + ":XX | XX");	
				sm = 60;
			} else {
				if (sh < 10) { System.out.print(" ");} //add space
				System.out.println(sh + ":XX | XX - " + sm);
			}
				
				if (sm == 60) {;}
				else {sm = 60 - sm;}

			for (int j = 0; j < duration; j++) {
				sh = (sh == 12) ? 1 : sh + 1;
				if (sh < 10) {System.out.print(" ");}
				System.out.println(sh + ":XX | XX + " + sm);
				sm = sm + 60;
			}

			
		}
	}
}