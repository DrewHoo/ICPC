import java.util.*;
public class FalseSense {
	public static void main(String[] args) {
		HashMap<Character, String> morse = new HashMap<Character, String>();
		HashMap<String, Character> esrom = new HashMap<String, Character>();
		morse.put('A', ".-");
		esrom.put(".-", 'A');
		morse.put('B', "-...");
		esrom.put("-...", 'B');
		morse.put('C', "-.-.");
		esrom.put("-.-.", 'C');
		morse.put('D', "-..");
		esrom.put("-..", 'D');
		morse.put('E', ".");
		esrom.put(".", 'E');
		morse.put('F', "..-.");
		esrom.put("..-.", 'F');
		morse.put('G', "--.");
		esrom.put("--.", 'G');
		morse.put('H', "....");
		esrom.put("....", 'H');
		morse.put('I', "..");
		esrom.put("..", 'I');
		morse.put('J', ".---");
		esrom.put(".---", 'J');
		morse.put('K', "-.-");
		esrom.put("-.-", 'K');
		morse.put('L', ".-..");
		esrom.put(".-..", 'L');
		morse.put('M', "--");
		esrom.put("--", 'M');
		morse.put('N', "-.");
		esrom.put("-.", 'N');
		morse.put('O', "---");
		esrom.put("---", 'O');
		morse.put('P', ".--.");
		esrom.put(".--.", 'P');
		morse.put('Q', "--.-");
		esrom.put("--.-", 'Q');
		morse.put('R', ".-.");
		esrom.put(".-.", 'R');
		morse.put('S', "...");
		esrom.put("...", 'S');
		morse.put('T', "-");
		esrom.put("-", 'T');
		morse.put('U', "..-");
		esrom.put("..-", 'U');
		morse.put('V', "...-");
		esrom.put("...-", 'V');
		morse.put('W', ".--");
		esrom.put(".--", 'W');
		morse.put('X', "-..-");
		esrom.put("-..-", 'X');
		morse.put('Y', "-.--");
		esrom.put("-.--", 'Y');
		morse.put('Z', "--..");
		esrom.put("--..", 'Z');
		morse.put('_', "..--");
		esrom.put("..--", '_');
		morse.put(',', ".-.-");
		esrom.put(".-.-", ',');
		morse.put('?', "----");
		esrom.put("----", '?');
		morse.put('.', "---.");
		esrom.put("---.", '.');
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			char[] message = in.nextLine().toCharArray();
			int n = message.length;
			int[] a = new int[n];
			String answer = "";
			for (int i = 0; i < n; i++) {
				answer += morse.get(message[i]);
				a[i] = morse.get(message[i]).length();
			}
			for (int i = 0, k = 0; i < n; i++) {
				message[i] = esrom.get(answer.substring(k, k + a[n - i - 1]));
				k += a[n - i - 1];
			}
			for (char c : message)
				System.out.print(c);
			System.out.println();
		}
	}
}