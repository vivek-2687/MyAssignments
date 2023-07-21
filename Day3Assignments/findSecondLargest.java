package Day3Assignments;

import java.util.Arrays;

public class findSecondLargest {

	public static void main(String[] args) {

		int[] data = {3,2,11,4,6,7};
		
		int x = data.length;
		
		Arrays.sort(data);
		
		
		System.out.println("The second Largest number " + data[x-2]);
		
		
		
	}

}
