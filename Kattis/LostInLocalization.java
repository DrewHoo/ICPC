import java.util.*;
public class LostInLocalization {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String s = "";
		if (n < 5)
			s = "few";
		else if (n < 10)
			s = "several";
		else if (n < 20)
			s = "pack";
		else if (n < 50)
			s = "lots";
		else if (n < 100)
			s = "horde";
		else if (n < 250)
			s = "throng";
		else if (n < 500)
			s = "swarm";
		else if (n < 1000)
			s = "zounds";
		else
			s = "legion";
		System.out.println(s);
	}
}