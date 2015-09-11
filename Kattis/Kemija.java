import java.util.*;
import java.util.regex.*;
public class Kemija {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		Pattern p = Pattern.compile("apa|epe|ipi|opo|upu");
		Matcher m = p.matcher(answer);
		for (int i = 0; m.find(); i += 2)
			answer = answer.substring(0, m.start() - i) + answer.substring(m.end() - i - 1);
 		System.out.println(answer.trim());
	}
}