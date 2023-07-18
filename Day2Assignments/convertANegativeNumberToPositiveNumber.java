package Day2Assignments;

public class convertANegativeNumberToPositiveNumber {

	public static void main(String[] args) {
		int x = -40;
		 System.out.println(x);
		
		 if (x<0)
		 {
			 System.out.println("The Number " + x + " is Negative");
			 int y = Math.abs(x);
			 System.out.println("Converted to Positive = "+ y);
		 }
		 else
		 {
			 System.out.println("The Number " + x + " is Positive");
			
		 }
	}

}
