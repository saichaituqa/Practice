package programs;

import java.util.Iterator;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int a=121;
		
		int rev=0;
		
		int n=a;
		
		System.out.println(rev);
		
		while(a>0)
		{
			int rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println(rev);
		if(rev==n)
		{
			System.out.println("it is a palindrome number");
		}
		else
		{
			System.out.println("it is not a palindrome nummber");
		}
		}
		
	}

