package programs;

public class AnagramProgram {

	public static void main(String[] args) {
		
		String str="eat";
		String str1="tea";
		
		char ch[]=str.toCharArray();
		char ch1[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
			
			for(int j=0;j<ch1.length;j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println();
				}
			}
		}
	}
}
