package linecomparison;

public class LineComparison {
		double length(int x1,int y1,int x2,int y2) {
			double lineDistance;
			lineDistance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
			return lineDistance;
		}
			public static void main(String[] args) {
		LineComparison line = new LineComparison();
		double result = line.length(1, 9, 9, 7);
		System.out.println("Length Of The Line:" +result);
	}
}

