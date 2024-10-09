package programs;

public class SecondMaximum {

	public static void main(String[] args) {
		
		int a[]= {23,12,54,55,63,35,32,21};
		
		int largest=Integer.MIN_VALUE;
		int second_largest=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>largest)
			{
				second_largest=largest;
				largest=a[i];
			}
			else if(a[i]>second_largest && a[i]!=largest)
			{
				second_largest=a[i];
			}
		}
		
		System.out.println(second_largest);
		
	}
}
