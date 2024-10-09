package exceptions;

public class ArthemeticExceptioon {

	//Stacktrace
	/*
	 * Exception name - java.lang.ArthmeticException
	 * Exception message - /by Zero
	 * Which line number
	 * Methods Info
	 */
	public static void main(String[] args) {
		
		int i=10;
		
		int j=0;
		
		try {
		int k=i/j;
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled");
		}
	}
}
