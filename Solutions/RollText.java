//P10
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Integer;

public class RollText {
		
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;) {
			int lines = Integer.parseInt(s.nextLine().trim());
			if (lines == 0) return;
			int index = 0;
			for (int i = 0; i < lines; i++) {
				String str = s.nextLine();
				if (index < str.length()) {
					index = (str.substring(index).contains(" ")) ? str.indexOf(" ", index) : str.length();
				} 
			}
			System.out.println(++index);
		}
	}
}