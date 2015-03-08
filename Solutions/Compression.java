import java.util.*;
public class Compression{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int imgNum = 0;
		for (;;) {
			System.out.println("Image " + ++imgNum + ":");
			int w = s.nextInt();
			if (w == 0) {break;}
			int t = Integer.parseInt(s.nextLine().trim());
			boolean[][] image = new boolean[w][w];
			for (int i = 0; i < w; i++) {
				char[] line = s.nextLine().trim().toCharArray();
				for (int j = 0; j < w; j++) {
					image[i][j] = line[j] == '1' ? true : false;
				}
			}
			image = quarter(image, t);
			for (int i = 0; i < w; i++) {
				for (int j = 0; j < w; j++) {
					String c = image[i][j] ? "1" : "0";
					System.out.print(c);
				}
				System.out.println();
			}
		}
	}
	public static boolean[][] quarter(boolean[][] image, int t) {
		int count = 0;
		for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				if(image[i][j])
					count++;
			}
		}
		double threshold = (double) t / 100.00;
		double percentTrue = (double) count / (image.length * image.length);
		double percentFalse = 1.00 - percentTrue;
		if (image.length == 1) {
			return image;
		} else if (Double.compare(percentTrue, threshold) >= 0) { //make image ones
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image.length; j++) {
					image[i][j] = true;
				}
			}
		} else if (Double.compare(percentFalse, threshold) >= 0) {
			for (int i = 0; i < image.length; i++) {
				for (int j = 0; j < image.length; j++) {
					image[i][j] = false;
				}
			}
		} else {
			boolean[][] a00, a01, a10, a11;
			int half = image.length/2, end = image.length;

			a00 = new boolean[half][half];
			for (int i = 0; i < half; i++) {
				for (int j = 0; j < half; j++) {
					a00[i][j] = image[i][j];
				}
			}
			a00 = quarter(a00, t);

			a10 = new boolean[half][half];
			for (int i = half; i < end; i++) {
				for (int j = 0; j < half; j++) {
					// System.out.println("i: " + i + " j: " + j + " half: " + half + " end: " + end);
					a10[i - half][j] = image[i][j];
				}
			}
			a10 = quarter(a10, t);
			a01 = new boolean[half][half];
			for (int i = 0; i < half; i++) {
				for (int j = half; j < end; j++) {
					a01[i][j - half] = image[i][j];
				}
			}
			a01 = quarter(a01, t);

			a11 = new boolean[half][half];
			for (int i = half; i < end; i++) {
				for (int j = half; j < end; j++) {
					a11[i - half][j - half] = image[i][j];
				}
			}
			a11 = quarter(a11, t);
			//A00
			for (int i = 0; i < half; i++) {
				for (int j = 0; j < half; j++) {
					image[i][j] = a00[i][j];
				}
			}
			//A10
			for (int i = half; i < end; i++) {
				for (int j = 0; j < half; j++) {
					image[i][j] = a10[i - half][j];
				}
			}
			//A01
			for (int i = 0; i < half; i++) {
				for (int j = half; j < end; j++) {
					image[i][j] = a01[i][j - half];
				}
			}
			//A11
			for (int i = half; i < end; i++) {
				for (int j = half; j < end; j++) {
					image[i][j] = a11[i - half][j - half];
				}
			}
		}
		
		return image;
	}
}