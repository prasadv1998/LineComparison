package linecomparison;

public class LineComparison {
	double length(int x1,int y1,int x2,int y2) {
	double lineDistance;
	lineDistance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	return lineDistance;	}
	public static void main(String[] args) {
		LineComparison line = new LineComparison();
		Double line1= line.length(1, 7, 2, 1);
		Double line2= line.length(9, 7, 9, 8);
		if(Double.compare(line1,line2) == 0) {
			System.out.println("Two Results Are Equal");
		}else if(Double.compare(line1,line2) < 0) {
			System.out.println("Line1 Is Less Than Line2");
		}else {
			System.out.println("Line1 Is Greater Than Line2");
		}
	}
}



