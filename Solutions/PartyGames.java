import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class PartyGames {
		
	public static void main(String[] args) {
	
		//get # of strings
		//put it in a for loop
		Scanner s = new Scanner(System.in);
		//System.out.print("How many guests? ");
		int testNames = Integer.parseInt(s.nextLine());
		ArrayList<String> answers = new ArrayList<String>();
		while (testNames != 0) { //executes once for each set of names
			String[] names = new String[testNames];
			for (int i = 0; i < testNames; i++) { //gets all names
				//System.out.print("Enter a name: ");
				names[i] = s.nextLine();
			}
			Arrays.sort(names);
			/*System.out.println("Thanks! Here are your sorted names: ");
			for (int i = 0; i < testNames; i++) {
				System.out.println(names[i]);
			}*/
			char[] middleLow = names[testNames / 2 - 1].toCharArray();
			char[] middleHigh = names[testNames / 2].toCharArray();
			String answer = "";

			for (int i = 0; i < middleLow.length; i++) { 	//copy the first n + 1 matching letters
				answer += String.valueOf(middleLow[i]);
				if(middleHigh[i] != middleLow[i]) {			//into answer
					i = middleLow.length;
				}
			}

			if(answer.length() < middleLow.length) {
				char[] answerArray = answer.toCharArray();
				answerArray[answerArray.length - 1]++; //bump a letter up one
				answer = "";
				for (int i = 0; i < answerArray.length; i++) {
					answer += String.valueOf(answerArray[i]);
				}

			}

			testNames = Integer.parseInt(s.nextLine()); //move to next test case
			answers.add(answer);
		}
		for (String t : answers) {
			System.out.println(t);
		}
	
	}

}