import java.util.*;
import java.lang.*;
import java.math.BigInteger;



public class PerfectShuffle {
	
	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			int n = Integer.parseInt(input.nextLine().trim());
			while(n!=0){
				String[] deck = new String[n];

				for(int i = 0; i < n; i++){
					deck[i] = input.nextLine();
				}

				if(n%2 == 0){	//if the deck has even number of cards
					for(int i=0; i<(n/2); i++){
						System.out.println(deck[i]);
						System.out.println(deck[i+n/2]);
					}
				}
				else{
					for(int i=0; i<(n/2); i++){
						System.out.println(deck[i]);
						System.out.println(deck[i+n/2+1]);
					}
					System.out.println(deck[n/2]);
			}
			n = Integer.parseInt(input.nextLine().trim());
		}
	}
}