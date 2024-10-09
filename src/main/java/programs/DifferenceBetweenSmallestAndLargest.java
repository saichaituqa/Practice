package programs;

public class DifferenceBetweenSmallestAndLargest {

	public static void main(String[] args) {
		
		int a[]= {23,55,42,15,65,75};
		
		int max=a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				min=max;
				max=a[i];
			}
			else if(a[i]<min) {
				
				min=a[i];
			}
		}
		
		System.out.println(max);
		
	}
}
