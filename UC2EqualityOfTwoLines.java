package linecomparison;

public class UC2EqualityOfTwoLines {
	double length(int x1,int y1,int x2,int y2) {
		double lineDistance;
		lineDistance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		return lineDistance;
		}
		public static void main(String[] args) {
			UC2EqualityOfTwoLines line = new UC2EqualityOfTwoLines();
			Double line1= line.length(1, 7, 2, 1);
			Double line2= line.length(9, 7, 9, 8);
				System.out.println("The Two Lines Are Equal:" +line1.equals(line2));
	}
}
		
