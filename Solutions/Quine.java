import java.util.*;
public class Quine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstHalf, secondHalf, line;
		int endOfFirstHalf, phraseLength;
		for (;;) {
			line = scan.nextLine();
			if (line.equals("END")) {
				break;
			}
			phraseLength = (line.length() - 3) / 2;
			endOfFirstHalf = phraseLength + 2;
			char[] a = line.toCharArray();
			for (char c : a) {
				if (c == '"' || c == ' ' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
				} else {
					line = "";
				}
			}
			if (line.indexOf("\"") != 0
				|| 	line.indexOf("\"", 1) != line.lastIndexOf("\"")
				|| 	line.lastIndexOf("\"") != phraseLength + 1
				|| 	line.length() < 5
				||	phraseLength * 2 + 3 != line.length()
				||	line.charAt(1) == ' '
				||	line.charAt(phraseLength) == ' '
				||	line.charAt(endOfFirstHalf) != ' ') {
				System.out.println("not a quine");
				continue;
			}
			firstHalf = line.substring(1, endOfFirstHalf - 1);
			secondHalf = line.substring(line.lastIndexOf("\"") + 2);
			if (firstHalf.equals(secondHalf)) {
				System.out.println("Quine(" + firstHalf + ")");
			} else {
				System.out.println("not a quine");
			}
		}
	}
}