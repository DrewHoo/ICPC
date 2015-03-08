import java.util.*;
public class Politics {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for(;;) {
			int n = s.nextInt();
			int m = s.nextInt();
			if (n == 0 && m == 0) {break;}
			s.nextLine();
			HashMap<String, LinkedList<String>> h = new HashMap<String, LinkedList<String>>();
			LinkedList<String> a = new LinkedList<String>();
			for (int i = 0; i < n; i++) {
				String name = new String(s.nextLine().trim()); 
				h.put(name, new LinkedList<String>());
				a.addLast(name);
			}
			for (int j = 0; j < m; j++) {
				String supporter = new String(s.next());
				String politician = new String(s.nextLine().trim());
				if (!h.containsKey(politician)) {
					h.put(politician, new LinkedList<String>());
					a.addLast(politician);
				} 
				h.get(politician).addLast(supporter);
			}
			for (String politician : a) {
				for (String supporter : h.get(politician)) {
					if (supporter != null && supporter.length() > 0) {
						System.out.println(supporter);
}}}}}}