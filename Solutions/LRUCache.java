import java.util.*;
public class LRUCache {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int simNum = 0;
		for (int cache = s.nextInt(); cache != 0; cache = s.nextInt()) { //for every input line.
			System.out.println("Simulation " + ++simNum);
			String line = new String(s.nextLine().trim()); 				//use full String constructor
			LinkedList<Character> q = new LinkedList<Character>(); 		//LinkedList acts as queue
			for (int i = 0; i < line.length(); i++) { 					//for every character in the input
				char command = line.charAt(i);
				if (command == '!') { 									//print
					for (Character c : q) {System.out.print(c);}
					System.out.println();
				} else {
					if (q.remove((Character) command)) { 				//if data is already in cache
						q.addLast(command); 							//find it in cache, remove it, and add it at the back of the queue
					} else if (q.size() == cache) { 					//if cache capacity has been reached
						q.removeFirst(); 								//remove the thing least recently used aka the head aka dequeue
						q.addLast(command); 							//aka enqueue
					} else {q.addLast(command);} 						//if there is room in cache AND data is not in cache
				}
			}
		}
	}
}