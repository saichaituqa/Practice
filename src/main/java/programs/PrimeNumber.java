package programs;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int a=3;
		
		int count=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0 && a!=1)
		{
			System.out.println(a+"It is a prime number");
		}
		else
		{
			System.out.println(a+"it is not a prime number");
		}
	}
}
