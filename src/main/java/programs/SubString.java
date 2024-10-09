package programs;

public class SubString {

	public static void main(String[] args) {

		String str="program of substring";
		int maxSize=0;
		String biggestSubstring="";
		for (int i = 0; i <str.length(); i++) {

			for (int j = i+1; j <=str.length(); j++) {

				String str1 = str.substring(i, j);
				
				
//				if(str1.length()==3 && !str1.contains(" "))
//				{
//					String temp="";
//					
//					if(palindrome(str1)) {
//						System.out.println(str1);
//					}
//				}
//				if(!str1.contains(" "))
//				{
//					System.out.println(str1);
//				}
				
				if(str1.length()>maxSize)
					{
						maxSize=str1.length();
						biggestSubstring = str1;
						
					}
			}
			
		}
		System.out.println(biggestSubstring);
	}
	
	public static boolean palindrome(String s) {
		
		String temp=" ";
		boolean flag= false;

		for(int i=temp.length();i>0;i--)
		{
			temp=s+temp;
		}
		if(temp.equals(s))
		{
			flag=true;
		}
		else
		{
			flag = false;
		}
		
		return flag;
		
	}
	
}
