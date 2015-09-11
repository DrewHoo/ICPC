import java.util.*;
import java.util.regex.*;
public class Kemija2 {
	public static void main(String[] args) {
		String answer = (new Scanner(System.in)).nextLine();
		for (Matcher m = (Pattern.compile("apa|epe|ipi|opo|upu")).matcher(answer), int i = 0; m.find(); i += 2)
			answer = answer.substring(0, m.start() - i) + answer.substring(m.end() - i - 1);
 		System.out.println(answer.trim());
	}
}