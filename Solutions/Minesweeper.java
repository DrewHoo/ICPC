import java.util.*;
public class Minesweeper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		for (;;) {
			int c = s.nextInt(), r = s.nextInt();
			if (r == 0 && c == 0) {break;}
			s.nextLine();
			char[][] board = new char[c][r];
			//fill the board
			for (int i = 0; i < c; i++) { 
				char[] row = s.nextLine().trim().toCharArray();
				for (int j = 0; j < r; j++) {
					// System.out.println("j = " + j + " r = " + r);
					board[i][j] = row[j];
				}
			}

			for (int i = 0; i < c; i++) {
				for (int j = 0; j < r; j++) {
					if (board[i][j] == '*') {
						System.out.print("*");
						continue;
					}
					//evaluate moore neighborhood
					char count = '0';
					//up
					if (i + 1 < c && board[i + 1][j] == '*') {
						count++;
					}
					//up right
					if (i + 1 < c && j + 1 < r && board[i+1][j+1] == '*'){
						count++;
					} 
					//0 right
					if (j + 1 < r && board[i][j+1] == '*') {
						count++;
					}
					//down right
					if (i > 0 && j + 1 < r && board[i-1][j+1] == '*') {
						count++;
					}
					//down
					if (i > 0 && board[i-1][j] == '*') {
						count++;
					}
					//down left
					if (i > 0 && j > 0 && board[i-1][j-1] == '*') {
						count++;
					}
					//0 left
					if (j > 0 && board[i][j-1] == '*') {
						count++;
					}
					//up left
					if (j > 0 && i + 1 < c && board[i+1][j-1] == '*') {
						count++;
					}
					board[i][j] = count;
					System.out.print(count);
				}
				System.out.println();
			}
		}
	}
}