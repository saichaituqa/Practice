package programs;

public class Replacespace {

	public static void main(String[] args) {

		String s1="i  am  in   banglore";

		//		String res = s1.replace(' ','-');
		//		
		//		System.out.println(res);

		char[] ch=s1.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
		
			if(' '>=1) {
				System.out.print(ch[i]);
			}
			
		}
	}
}