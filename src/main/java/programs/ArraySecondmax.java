package programs;

public class ArraySecondmax {

	public static void main(String[] args) {
		
		int a[]= {2,4,6,8,1,30,29};
		
		int firstmax=Integer.MIN_VALUE;
		int secondmax=Integer.MIN_VALUE;
		
		for (int i = 0; i < a.length; i++) {
			
			if(firstmax<a[i]) //-<2 -- <2<4 - t 6<4
			{
				secondmax=firstmax;// sec=-value sec=2 //
				firstmax=a[i]; // first=2 // first=4
			}
			else if(firstmax>a[i] && secondmax!=a[i])//4>6 && 2!=6
			{
				
				secondmax=a[i]; //6
			}
		}
		System.out.println(secondmax);
		System.out.println(firstmax);
	}
}
