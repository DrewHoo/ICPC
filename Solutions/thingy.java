import java.util.*;
import java.lang.*;



public class thingy {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt();
			if (n == 0) return;
			int m = Integer.parseInt(s.nextLine().trim());

			HashMap<String, String> constituency = new HashMap(n);
			HashMap<String, String> writeIns = new HashMap();

			String candidates = "";
			String writeInCandidates = "";
			String candidate;

			for (int i = 0; i < n; i++) {
				candidate = s.nextLine();
				constituency.put(candidate, "");
				candidates += candidate + " ";
			}

			for (int i = 0; i < m; i++) {
				String str = s.nextLine();
				String supporter = str.substring(0, str.indexOf(" ") + 1);
				String match = str.substring(str.indexOf(" ") + 1);
				if (constituency.containsKey(match)) {
					constituency.put(match, constituency.get(match) + supporter + "\n");
				} else {
					if (writeIns.containsKey(match))
						writeIns.put(match, writeIns.get(match) + supporter + "\n");
					else {
						writeInCandidates += match;
						writeIns.put(match, supporter + "\n");
					}
				}
			}

			Scanner t = new Scanner(candidates);
			t.useDelimiter(" ");
			String supporter;
			while (t.hasNext()) {
				candidate = t.next();
				supporter = constituency.get(candidate);
				if (supporter.length() > 0)
					System.out.println(supporter.substring(0, supporter.lastIndexOf('\n')));
			}

			t = new Scanner(writeInCandidates);
			t.useDelimiter(" ");

			while (t.hasNext()) {
				candidate = t.next();
				supporter = writeIns.get(candidate);
				if (supporter != null && supporter.length() > 0)
					System.out.println(supporter.substring(0, supporter.lastIndexOf('\n')));
			}
			
		}
	}
}