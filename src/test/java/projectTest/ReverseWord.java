package projectTest;

public class ReverseWord {
public static void main(String[] args) {
	
	int a[]= {21,44,78,77,55,6,8,4,101,79,3,1224};
	
	int highest=Integer.MIN_VALUE;
	int lowest=a[0];
	
	for (int i = 0; i < a.length; i++) {
		
		if(a[i]>highest)
		{
			highest=a[i];
		}
		else if(a[i]<lowest)
		{
			
			lowest=a[i];
		}
	}
	
	System.out.println("highest value:"+highest);
	System.out.println("lowest value:"+lowest);
	System.out.println("Difference b/w heightest and lowest:"+" "+(highest-lowest));
	
}
}
