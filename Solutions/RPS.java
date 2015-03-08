import java.util.*;
public class RPS {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			String p1 = s.nextLine();
			String p2 = s.nextLine();
			if (p1.equals("E")) {break;}
			int p1score = 0, p2score = 0;
			for (int i = 0; i < p1.length(); i++) {
				char p1throw = p1.charAt(i);
				char p2throw = p2.charAt(i);
				switch(p1throw) {
					case 'R':
						if (p2throw == 'R') {

						} else if (p2throw == 'S') {
							p1score++;
						} else if (p2throw == 'P') {
							p2score++;
						}
						break;
					case 'S': 
						if (p2throw == 'R') {
							p2score++;
						} else if (p2throw == 'S') {

						} else if (p2throw == 'P') {
							p1score++;
						}
						break;
					case 'P':
						if (p2throw == 'R') {
							p1score++;
						} else if (p2throw == 'S') {
							p2score++;
						} else if (p2throw == 'P') {
							
						}
						break;
				}
			}
			System.out.println("P1: " + p1score);
			System.out.println("P2: " + p2score);
		}
	}
}