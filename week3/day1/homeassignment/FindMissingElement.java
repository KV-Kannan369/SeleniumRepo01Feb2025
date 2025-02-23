package week3.day1.homeassignment;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
	
		int[] input = {1,4,3,2,8,6,7};
		Arrays.sort(input); // 1,2,3,4,6,7,8
							// 0,1,2,3,4,5,6
		
		for(int i=0;i<input.length;i++) {
			
			int x = i + 1;			
			if(x != input[i])
			{
				System.out.println("Missing Numbers: ==> "+x);
				break;
			}
			
		}
		
	}

}
