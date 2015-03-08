import java.util.*;
public class KnightMoves {
	public static class Coords {
		int i;
		int j;
		int count;
		char c;
		public Coords(int i, int j, int count, char c) {
			this.i = i;
			this.j = j;
			this.count = count;
			this.c = c;
		}
	}
	public static void main(String[] args) {
		Scanner s  = new Scanner(System.in);
		int m = s.nextInt(), n = Integer.parseInt(s.nextLine().trim());
		char[][] board = new char[m][n];
		Coords start = null;
		for (int i = 0; i < m; i++) {
			char[] line = s.nextLine().trim().toCharArray();
			for (int j = 0; j < n; j++) {
				board[i][j] = line[j];
				if (line[j] == 'K') {start = new Coords(i, j, 0, board[i][j]);}
			}
		}
		LinkedList<Coords> q = new LinkedList<Coords>();
		q.add(start);
		int count = 0;
		int stackcount = 0;
		for (;;) {
			if (q.isEmpty()) {
				System.out.println("-1");
				return;
			}
			Coords p = q.removeFirst();
			if (p.c == 'X') {
				System.out.println(p.count);
				return;
			}
			int i, j;
			//a 4,3
			i = p.i + 2;
			j = p.j + 1;
			if (i < m && j < n && board[i][j] != '#') {
				q.addLast(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 3,4
			i = p.i + 1;
			j = p.j + 2;
			if (i < m && j < n && board[i][j] != '#') {
				//add new coords to q
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				//set #
				board[i][j] = '#';
			}
			//a 3,0
			i = p.i + 1;
			j = p.j - 2;
			if (i < m && j >= 0 && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 4,1
			i = p.i + 2;
			j = p.j - 1;
			if (i < m && j >= 0 && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 1,0
			i = p.i - 1;
			j = p.j - 2;
			if (i >= 0 && j >= 0 && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 0,1
			i = p.i - 2;
			j = p.j - 1;
			if (i >= 0 && j >= 0 && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 0,3
			i = p.i - 2;
			j = p.j + 1;
			if (i >= 0 && j < n && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
			//a 1,4
			i = p.i - 1;
			j = p.j + 2;
			if (i >= 0 && j < n && board[i][j] != '#') {
				q.add(new Coords(i, j, p.count + 1, board[i][j]));
				board[i][j] = '#';
			}
		}
		
 	}
}