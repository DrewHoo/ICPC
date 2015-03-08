import java.util.*;

public class xorTest {
	public static void main(String[] args) {
		String str1 = "gfedcba";
		String str2 = "abcdefg";
		String str3 = "";
		for (int i = 0; i < str1.length(); i++) {
			str3 += str1.charAt(i) ^ str2.charAt(i);
		}
		System.out.println("str3 " + str3);
	}
}