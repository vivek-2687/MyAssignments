package Day2Assignments;

public class fibonacciSeries {

	public static void main(String[] args) {


		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum;
		
		System.out.println(firstNum);
		for (int i = 1; i < range; i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
		}

	}

}
