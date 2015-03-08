import java.util.*;
public class Top25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = "", s2 = "";
		HashSet<String> hs = new HashSet<String>();
		LinkedList<String> ll = new LinkedList<String>();
		for (int n = Integer.parseInt(scan.nextLine()); n > 0; n--) {
			ll.add(scan.nextLine().trim());
		}
		for (int i = 1; !ll.isEmpty(); i++) {
			s = ll.removeFirst();
			s2 = scan.nextLine().trim();
			if (!hs.add(s2)) {hs.remove(s2);} //if element already appeared in first list
			if (!hs.add(s)) {hs.remove(s);} //if element already appeared in second list
			if (hs.isEmpty()) { //if you have a set
				System.out.println(i);
				i = 0; //because i++ will mean i = 1;
}}}}