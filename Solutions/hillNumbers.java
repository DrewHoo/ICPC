import java.util.*;

public  class hillNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		for (Integer i = 100; i < n; i++) {
			int k, p;
			String str = i.toString();
			
			for (int j = 0; j < str.length() - 1; j++) {
				k = (int) str.charAt(j);	
				p = (int) str.charAt(j + 1);
			}
		}
	}

}