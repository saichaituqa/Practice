package programs;

import java.util.Arrays;

public class ArraysSecondMax {

	public static void main(String[] args) {
		
	int arr[]= {26,48,98,7,9,99};
//		
//		Arrays.sort(arr);
//		
//		System.out.println(arr[arr.length-2]);
	
	int highest=Integer.MIN_VALUE;
	
	int secondhighest=Integer.MIN_VALUE;
	
	System.out.println(highest);
	System.out.println(secondhighest);
	
	for (int i = 0; i < arr.length; i++) {
		
		if(arr[i]>highest)
		{
			secondhighest=highest;
			highest=arr[i];
		}
		else if(arr[i]<highest && arr[i]>secondhighest)
		{
			secondhighest=arr[i];
		}
		
	}
	System.out.println(secondhighest);
	}
}
