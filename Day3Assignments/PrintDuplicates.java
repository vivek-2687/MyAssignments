package Day3Assignments;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {

		int[] arra = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Arrays.sort(arra);
		
		for(int i=0;i<arra.length-1;i++) {
			
				if(arra[i]== arra[i+1]) {
					System.out.println("The duplicate number is " +arra[i]);
				}

	}

	}
}
	
