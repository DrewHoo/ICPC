import java.util.*;
public class RIPOFF {
	private static class Node {
		Node parent;
		int val;
		int numAncestors;
		public Node(int val, Node parent) {
			this.val = val;
			this.parent = parent;
			if (parent != null) {
				numAncestors = parent.numAncestors + 1;
			} else {
				numAncestors = 1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			int n = scan.nextInt();
			if (n == 0) {break;}
			int s = scan.nextInt(), t = scan.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
			}
			ArrayList<LinkedHashMap<Integer, Node>> board = new ArrayList<LinkedHashMap<Integer, Node>>(n);
			for (int i = 0; i < n; i++) {
				board.add(i, new LinkedHashMap<Integer, Node>());
			}
			LinkedHashMap<Integer, Node> nextSpace, currentSpace;
			Node node;
			int maxVal = Integer.MIN_VALUE;
			for (int i = 0; i < s && i < n; i++) {
				nextSpace = board.get(i);
				nextSpace.put(1, new Node(a[i], null));
			}
			for (int i = 0; i < n; i++) { //for each space(hashmap) on the board
				currentSpace = board.get(i);
				for (Integer k : currentSpace.keySet()) { //for each node in the hashmap in space i
					node = currentSpace.get(k);
					for (int j = 1; j <= s && i + j < n; j++) { //for each possible move from this space
						nextSpace = board.get(i + j);
						if (nextSpace.get((Integer)node.numAncestors + 1) != null && node.numAncestors + 1 < t) {
							if (node.val + a[i+j] > nextSpace.get((Integer)node.numAncestors + 1).val) {
								nextSpace.put(node.numAncestors + 1, new Node(node.val + a[i+j], node));
							}
						} else if (node.numAncestors + 1 < t) { // nextSpace doesn't contain a value with t turns taken
							nextSpace.put((Integer)node.numAncestors + 1, new Node(node.val + a[i+j], node));
						} 
					}
				}
			}
			for (int i = n - s; i < n; i++) {
				currentSpace = board.get(i);
				for (Integer k : currentSpace.keySet()) {
					if (currentSpace.get(k).val > maxVal) {maxVal = board.get(i).get(k).val;}
				}
			}
			System.out.println(maxVal);
		}
	}
}