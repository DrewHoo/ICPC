import java.util.*;
public class ReverseBinary {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), num = 0;
		int log2ofn = (int) (Math.log(n) / Math.log(2));
		int[] binaryRepresentation = new int[log2ofn + 1];
		for (int i = log2ofn; i >= 0; --i) {
			if (num + Math.pow(2, i) <= n) {
				num += Math.pow(2, i);
				binaryRepresentation[i] = 1;
			} else {
				binaryRepresentation[i] = 0;
			}
		}
		num = 0;
		for (int i = 0; i <= log2ofn; i++) {
			num += binaryRepresentation[log2ofn - i]*Math.pow(2,i);
		}
		System.out.println(num);
	}
}