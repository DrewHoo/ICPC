import java.util.*;

/**
 * This is a solution to a cool interview problem that my friend Wayne shared with me.
 * The problem is: Print the characters in an nxn matrix by traversing it in counterclockwise
 * concentric 'circles'
 */

public class ConcentricMatrixTraversal {
	public static char[][] matrix0 = {	{'a','d'},
										{'b','c'}
										};
	public static char[][] matrix1 = {	{'a', 'h', 'g'},
										{'b', 'i', 'f'},
										{'c', 'd', 'e'}
										};
	public static char[][] matrix2 = {	{'a', 'p', 'o', 'n', 'm'},
										{'b', 'q', 'x', 'w', 'l'},
										{'c', 'r', 'y', 'v', 'k'},
										{'d', 's', 't', 'u', 'j'},
										{'e', 'f', 'g', 'h', 'i'}
										};
	public static void main(String[] args) {
		System.out.print("2x2 matrix: ");
		printMatrix(matrix0);
		System.out.print("3x3 matrix: ");
		printMatrix(matrix1);
		System.out.print("5x5 matrix: ");
		printMatrix(matrix2);


	}

	public static void printMatrix(char[][] matrixIn) {
		int n = matrixIn[0].length;
		int rotations = (int) Math.ceil(Math.log(n)/Math.log(2));
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < rotations; k++) {
			for (int i=k, j=k; i < n-k; i++) //down
				sb.append(matrixIn[i][j]);
			for (int i=n-1-k, j=k+1; j < n-k; j++) //right
				sb.append(matrixIn[i][j]);
			for (int j=n-1-k, i=n-k-2; i >= k; i--) //up
				sb.append(matrixIn[i][j]);
			for (int j=n-k-2, i=k; j > k; j--) //left
				sb.append(matrixIn[i][j]);
		}
		System.out.println(sb.toString());
	}
}