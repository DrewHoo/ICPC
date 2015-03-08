import java.util.*;
public class QueenCollision {
	private static class Queen {
		public int x;
		public int y;
		public Queen (int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		for (;;) {
			int n = scan.nextInt(); 
			int collisions = 0;
			if (n == 0) break;
			int g = Integer.parseInt(scan.nextLine().trim());
			boolean[][] board = new boolean[n][n];
			int k, x, y, s, t;
			LinkedList<Queen> queens = new LinkedList<Queen>();
			for (int i = 0; i < g; i++) { // for each line
				Scanner ints = new Scanner(scan.nextLine().trim());
				k = ints.nextInt();
				x = ints.nextInt() - 1;
				y = ints.nextInt() - 1;
				s = ints.nextInt();
				t = ints.nextInt();
				// System.out.println("k: " + k + "x: " + x + "y: " + y + "s: " + s + "t: " + t);
				if (k == 1) {
						board[x][y] = true;
						queens.add(new Queen(x, y));
				} else {
					for (int j = 0; j < k; j++) {
						board[x + j*s][y + j*t] = true;
						queens.add(new Queen(x + j*s, y + j*t));
					}
				}
			}
			for (Queen q : queens) {
				//System.out.println("Queen " + num++ + ": x: " + q.x + " y: " + q.y);
				//check down
				int l = q.x;
				int d = q.y - 1;
				for (; d >= 0; d--) {
					if (board[l][d] == true) {
						collisions++;
						break;
					}
				}
				//check left
				l = q.x - 1;
				d = q.y;
				for (; l >= 0; l--) {
					if (board[l][d] == true) {
						collisions++;
						break;
					}
				}
				//check diagonal down/left
				l = q.x - 1;
				d = q.y - 1;
				for (; d >= 0 && l >= 0;) {
					if (board[l][d] == true) {
						collisions++;
						break;
					}
					l--;
					d--;
				}
				l = q.x + 1;
				d = q.y - 1;
				//check diagonal down/right
				for (; d >= 0 && l < n;) {
					if (board[l][d] == true) {
						collisions++;
						break;
					}
					l++;
					d--;
				}
			}
			System.out.println(collisions);
		}
	}
}