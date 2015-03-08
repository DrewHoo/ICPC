import java.util.*;
import java.lang.*;

public class CutTheCake {

	static class Line {
		int x1, y1, x2, y2;
		Double slope, intercept;
		public Line(int x1, int y1, int x2, int y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			if (x1 == x2) { //slope is undefined
					slope = Double.POSITIVE_INFINITY;
				}
				else if (y1 == y2) { //slope is zero
					slope = 0.0;
				}
				else {
					slope = ((double) y1 - y2) / (x1 - x2);
				}
			intercept = (slope.isInfinite()) ? 0 : y1 - (slope * x1);
		}
		public boolean hitsCircle(int radius, int xC, int yC) {
			//this part is magic
			int a = y1 - y2;
			int b = x2 - x1;
			int c = (x1 - x2) * y1 + (y2 - y1) * x1;
			double d = Math.abs(a*xC + b*yC + c) / Math.sqrt(a*a + b*b);
			return (d < (double) radius) ? true : false;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r, a, b, n/*, x1, x2, y1, y2*/;
		//double slope;
		for (;;) {
			boolean intersectsInCircleFlag = false;
			ArrayList<Line> lines = new ArrayList();
			r = s.nextInt();
			a = s.nextInt();
			b = s.nextInt();
			n = s.nextInt();
			if (r == a && a == b && b == n && n == 0) break;
			// add a Line to lines if it hits the circle
			for (int i = 0; i < n; i++) {
				Line newLine = new Line(s.nextInt(), s.nextInt(), s.nextInt(), s.nextInt());
				if (newLine.hitsCircle(r, a, b)) lines.add(newLine);
			}
			int i = 0;

			//find out if any lines cross inside the circle
			for (Line m : lines) {
				for (i = lines.indexOf(m) + 1; i < lines.size(); i++) {
					if ((i < lines.size()) && intersectsInCircle(m, lines.get(i), r, a, b)) {
						//System.out.println("Line " + lines.indexOf(m) + " and Line " + i + " intersect in the circle");
						intersectsInCircleFlag = true;
					}
				}
			}

			int sections = lines.size();
			//System.out.println("lines.size() = " + lines.size());
			//if (intersectsInCircleFlag == true) System.out.println("intersects in circle");

			if (intersectsInCircleFlag == true) {
				sections += 2;
				System.out.println(sections);
				// System.out.println("lines intersected");
			// } else if (lines.size() == 0) {
			// 	System.out.println(0);
			} else {
				System.out.println(++sections);
			}

			//using lines.size() and flag, calculate pieces

			//check to see if any lines intersect inside the circle. Just find
			//their point of intersection, and then run the distance formula on it & center
			//then compare that	distance to the radius
		}
	}

	public static boolean intersectsInCircle(Line l1, Line l2, int radius, int xC, int yC) {
		//this will tell me if slope are the same. Since slope can = +infinity, no need to do vertical check
		double xintersection, yintersection, distance;
		if (Double.compare(l1.slope, l2.slope) == 0) { //this may not be the best way to compare
			return false;
		}
		// System.out.println("l1 intercept: " + l1.intercept + " l2 intercept: " + l2.intercept);
		if (l1.slope == Double.POSITIVE_INFINITY) {
			xintersection = l1.x1;
			yintersection = l1.x1 * l2.slope + l2.intercept;
		} else if (l2.slope == Double.POSITIVE_INFINITY) {
			xintersection = l2.x1;
			yintersection = l1.slope * xintersection + l1.intercept;
		} else {
			xintersection = (l1.intercept - l2.intercept) / (l1.slope - l2.slope)*(-1);
			yintersection = l1.slope * xintersection + l1.intercept;
		}
		
		distance = Math.sqrt(Math.pow(xC - xintersection, 2) + Math.pow(yC - yintersection, 2));
		//if distance < radius
		//System.out.println("Double.compare returned : " + Double.compare(distance, (double) radius));

		if (Double.compare(distance, (double) radius) < 0) {
			// System.out.println("Line1: " + l1.x1 + " " + l1.y1 + " " + l1.x2 + " " + l1.y2);
			// System.out.println("\t" + "slope: " + l1.slope);
			// System.out.println("Line2: " + l2.x1 + " " + l2.y1 + " " + l2.x2 + " " + l2.y2);
			// System.out.println("\t" + "slope: " + l2.slope);
			// System.out.print("Point of intersection: ");
			// System.out.printf("%.4f", xintersection);
			// System.out.print(", ");
			// System.out.printf("%.4f", yintersection);
			// System.out.println();
			return true;
		} else {
			return false;
		}
	}

	// public boolean hitsCircle(Line l1, int radius, int xC, int yC) {
	// 		//this part is magic
	// 		int a = l1.y1 - l1.y2;
	// 		int b = l1.x2 - l1.x1;
	// 		int c = (l1.x1 - l1.x2) * l1.y1 + (l1.y2 - l1.y1) * l1.x1;
	// 		double d = Math.abs(a*xC + b*yC + c) / Math.sqrt(a*a + b*b);
	// 		return (d < (double) radius) ? true : false;
	// }
}