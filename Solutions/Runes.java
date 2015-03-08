import java.util.*;
public class Runes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String left1Arg = "", left2Arg = "", lhs, rhs, input = scan.nextLine().trim();
		char operator;
		Long left1, left2, right;
		int i = 0;
		//get diff sides of argument (this discards the '=')
		String[] sides = input.split("=");
		lhs = sides[0];
		rhs = sides[1];
		//in case of leading '-'
		left1Arg += lhs.charAt(i++);
		//grab first argument
		for (;(lhs.charAt(i) >= '0' && lhs.charAt(i) <= '9') || lhs.charAt(i) == '?'; i++) {
			left1Arg += lhs.charAt(i);
		}
		//grab operator
		operator = lhs.charAt(i++);
		//grab second argument
		for (; i < lhs.length(); i++) {
			left2Arg += lhs.charAt(i);
		}
		//check valid values of '?'
		for (Integer k = 0; k < 10; k++) {
			if (input.contains(k.toString())) {continue;}
			left1 = Long.parseLong(left1Arg.replace("?", k.toString()));
			left2 = Long.parseLong(left2Arg.replace("?", k.toString()));
			right = Long.parseLong(rhs.replace("?", k.toString()));
			if (left1.toString().length() != left1Arg.length()){continue;}
			if (left2.toString().length() != left2Arg.length()){continue;}
			if (right.toString().length() != rhs.length()){continue;}
			switch(operator) {
				case '+':
					if (left1 + left2 == right){
						System.out.println(k);
						return;
					}
					break;
				case '-':
					if (left1 - left2 == right) {
						System.out.println(k);
						return;
					}
					break;
				case '*':
					if (left1 * left2 == right) {
						System.out.println(k);
						return;
					}
					break;
				case '/':
					if (left1 / left2 == right) {
						System.out.println(k);
						return;
					}
					break;
				default:
		}}
		//if we haven't returned by this point, there is no valid answer
		System.out.println("-1");
}}