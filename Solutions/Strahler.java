import java.util.*;
public class Strahler {
	private static class Node {
		int id;
		LinkedList<Node> children = new LinkedList<Node>();
		LinkedList<Node> parents = new LinkedList<Node>();
		public Node () {
			id = 0;
		}
		public int findOrder() {
			if (parents.isEmpty()) {return 1;}

			// find orders of parents
			Integer[] orders = new Integer[parents.size()];
			int i = 0;
			for (Node n : parents) {
				orders[i++] = n.findOrder();
			}
			//find highest order number that occurs at least twice
			Arrays.sort(orders, new Comp());
			for (int k = 1; k < orders.length; k++) {
				if (orders[k] == orders[k - 1]) {
					return orders[k] + 1;
				}
			}
			return orders[0];
		}
		private static class Comp implements Comparator<Integer> {
			public int compare(Integer a, Integer b) {
				if (a < b) {return 1;}
				if (a > b) {return -1;}
				return 0;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int K = s.nextInt();
		for (int i = 0; i < K; i++) {
			int set = s.nextInt(), m = s.nextInt(), p = s.nextInt();
			Node[] nodes = new Node[m];
			for (int j = 0; j < p; j++) {
				int a = s.nextInt(), b = s.nextInt();
				if (nodes[a - 1] == null) {
					nodes[a - 1] = new Node();
				}
				if (nodes[b - 1] == null) {
					nodes[b - 1] = new Node();
				}
				nodes[a - 1].children.add(nodes[b - 1]);
				nodes[b - 1].parents.add(nodes[a - 1]);
			}
			Node mouth = null;
			for (Node n : nodes) {
				if (n.children.isEmpty()) {
					mouth = n;
				}
			}
			System.out.println(set + " " + mouth.findOrder());
		}
	}
}