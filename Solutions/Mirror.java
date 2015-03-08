import java.util.*;

public class Mirror {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<Character, Character> h = new HashMap<Character, Character>();
		h.put('b', 'd');
		h.put('d', 'b');
		h.put('p', 'q');
		h.put('q', 'p');
		h.put('i', 'i');
		h.put('o', 'o');
		h.put('v', 'v');
		h.put('w', 'w');
		h.put('x', 'x');
		for (String line = s.nextLine(); !line.equals("#"); line = s.nextLine()) {
			String mirror = new String("");
			for (int i = 0; i < line.length(); i++) {
				if (h.get(line.charAt(i)) != null) {
					mirror = h.get(line.charAt(i)) + mirror;
				} else {
					mirror = "INVALID";
					break;
				}
			}
			if (mirror.contains("INVALID")) {
				System.out.println("INVALID");
			} else {
				System.out.println(mirror);
			}

			

		}
	}
}