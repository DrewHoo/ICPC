import java.util.*;
public class Nonogram {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int n = Integer.parseInt(s.nextLine());
			if (n == 0) {break;}
			char[][] board = new char[n][n];
			for (int i = 0; i < n; i++) {
				char[] row = s.nextLine().trim().toCharArray();
				for (int j = 0; j < n; j++) {
					board[i][j] = row[j];
				}
			}
			for (int i = 0; i < n; i++) {
				int x = 0;
				String line = "";
				for (int j = 0; j < n; j++) {
					if (board[i][j] == 'X') {x++;}
					//if at end
					if (j == n - 1 && (x != 0 || line.equals(""))) {
						if (!line.equals("")) {
							line += " ";
						}
						line += x;
					} else if (board[i][j] == '.' && x != 0) {
						if (!line.equals("")) {
							line += " ";
						}
						line += x;
						x = 0;
					}
				}
				System.out.println(line);
			}
			for (int j = 0; j < n; j++) {
				int x = 0;
				String line = "";
				for (int i = 0; i < n; i++) {
					if (board[i][j] == 'X') {x++;}
					//if at end
					if (i == n - 1 && (x != 0 || line.equals(""))) {
						if (!line.equals("")) {
							line += " ";
						}
						line += x;
					} else if (board[i][j] == '.' && x != 0) {
						if (!line.equals("")) {
							line += " ";
						}
						line += x;
						x = 0;
					}
				}
				System.out.println(line);
			}
		}
	}
}