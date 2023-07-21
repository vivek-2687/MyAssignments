package Day3Assignments;

import java.util.Arrays;

public class missingElements {

	public static void main(String[] args) {

		int[] arra = {1,2,3,4,7,6,8};
		Arrays.sort(arra);
		
		for(int i=1;i<arra.length;i++)
		{
			if(i!=arra[i-1])
			{
				System.out.println("The missing number is " + i);
				break;
			}
		}
	}

}
