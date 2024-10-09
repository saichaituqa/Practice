package programs;

public class MinVlaue {

	public static void main(String[] args) {
		
		int[]a= {12,3,6,5,87,5,4};
		
		int minimum=Integer.MIN_VALUE;
		int second_minimum=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]<minimum)
			{
				second_minimum=minimum;
				minimum=a[i];
			}
			else if(a[i]>minimum && a[i]!=second_minimum)
			{
				second_minimum=a[i];
			}
		}
		System.out.println(second_minimum);
	}
}
