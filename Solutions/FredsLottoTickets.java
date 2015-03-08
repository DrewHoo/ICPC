import java.util.*;
public class FredsLottoTickets {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) { //for each input
			int next = 0, n = Integer.parseInt(s.nextLine());
			if (n == 0) {break;}
			ArrayList<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) { //for each line in input
				Scanner s2 = new Scanner(new String(s.nextLine()));
				for (int k = 0; k < 6; k++) { //for each int in each line of input
					next = s2.nextInt();
					if (!a.contains(next)) {a.add(next);}
				}
			}
			if (a.size() == 49) {System.out.println("Yes");}
			else {System.out.println("No");}
			// System.out.println("a.size() = " + a.size());
			// int j = 0;
			// for (int e : a) {
			// 	System.out.print(e + "\t");
			// 	if (++j % 10 == 0) {System.out.println();}
			// }
		}
	}
}