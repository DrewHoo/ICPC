import java.util.*;

public class MadScientist {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (int n = s.nextInt(); n != 0; n = s.nextInt()) { //input level
			Scanner intStream = new Scanner(s.nextLine().trim());
			LinkedList<Integer> list = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) { //value level
				list.add(intStream.nextInt());
			}

			LinkedList<Integer> output = new LinkedList<Integer>();
			for (int j = 0; j < list.size(); j++) {
				for (int t = 0; output.size() < list.get(j); t++) {
					output.add(j + 1);
				}
			}
			for (Integer q : output) {
				System.out.print(q + " ");
			}
				System.out.println();
		}
	}
}