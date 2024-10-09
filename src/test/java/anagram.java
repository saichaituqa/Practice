import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		
		String str="tea";
		
		String str1="east";
		
		char [] s=str.toCharArray();
		
		char[] s1 = str1.toCharArray();
		
	
		if(s.length!=s1.length)
			
		{
			
		}
		Arrays.sort(s);
		Arrays.sort(s1);
		
		for (int i = 0; i < s.length; i++) {
			
			if(s[i]!=s1[i])
			{
				System.out.println("it is not an anagram");
			}
		}
				
//		boolean b=Arrays.equals(s, s1);
//		
//		System.out.println(s);
//		System.out.println(s1);
//		if(b==true)
//		{
//			System.out.println("it is an anagram");
//		}
//		else
//		{
//			System.out.println("it is not an anagram");
//		}
	}
}
