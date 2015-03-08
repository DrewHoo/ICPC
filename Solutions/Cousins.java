import java.util.*;
public class Cousins {
	public static class Node {
		int val;
		Node parent;
		LinkedList<Node> children;
		public Node(int val) {
			this.val = val;
			parent = null;
			children = new LinkedList<Node>();
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = s.nextInt();
			if (n == 0) {break;}
			int k = s.nextInt();//Integer.parseInt(s.nextLine().trim());
			s.nextLine();
			
			LinkedList<Integer> l = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) { //O(n)
				l.add(s.nextInt());
			}
			Node head = new Node(l.removeFirst());
			LinkedList<Node> nq = new LinkedList<Node>();
			nq.add(head);
			Node first, nk = null;

			//build tree
			if (n < 5) { //5 is smallest tree with > 0 cousins
				System.out.println("0");
				continue;
			}
			while (!l.isEmpty()){
				first = nq.removeFirst();
				while (!l.isEmpty() && (first.children.size() == 0 || first.children.peekLast().val == l.peek() - 1)) {
					Node child = new Node(l.removeFirst()); //a child is born
					child.parent = first; //tell child who parent is
					first.children.add(child); //add child
					nq.add(child);
					if (child.val == k) {nk = child;}

				}
			}
			int numCousins = 0;
			Node grandParent;
			if (nk.parent != null && nk.parent.parent != null) { //child is root or parent is root
				for (Node auntUncle : nk.parent.parent.children) {
					if (auntUncle != null) {
						numCousins += auntUncle.children.size();
					}
				}
				numCousins -= nk.parent.children.size();
			}
			System.out.println(numCousins);
		}
	}
}