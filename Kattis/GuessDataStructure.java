import java.util.*;
public class GuessDataStructure {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for (;;) {
			if (!in.hasNextInt()) break;
			boolean isStack = true, isQueue = true, isPQueue = true;
			LinkedList<Integer> queue = new LinkedList<Integer>();
			LinkedList<Integer> stack = new LinkedList<Integer>();
			LinkedList<Integer> pqueue = new LinkedList<Integer>();
			int n = in.nextInt();
			for (int i = 0; i < n; i++) {
				int instruction = in.nextInt(), item = in.nextInt();
				if (instruction == 1) {
					stack.add(item);
					queue.add(item);
					for (int j = 0; j < pqueue.size(); j++)
						if (pqueue.get(j) < item) {
							pqueue.add(j, item);
							break;
						}
					if (pqueue.size() < queue.size())
						pqueue.add(item);
				} else if (instruction == 2) {
					if (stack.size() < 1 || stack.removeLast() != item)
						isStack = false;
					if (queue.size() < 1 || queue.removeFirst() != item)
						isQueue = false;
					if (pqueue.size() < 1 || pqueue.removeFirst() != item)
						isPQueue = false;
				}
			}
			String answer = "";
			if (isStack && !isQueue && !isPQueue) {
				answer = "stack";
			} else if (!isStack && isQueue && !isPQueue) {
				answer = "queue";
			} else if (!isStack && !isQueue && isPQueue) {
				answer = "priority queue";
			} else if (!isStack && !isQueue && !isPQueue) {
				answer = "impossible";
			} else {
				answer = "not sure";
			}
			System.out.println(answer);
		}
	}
}