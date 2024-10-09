package programs;

public class AAABBC {

	public static void main(String[] args) {
		
		String str="AAABBCC";
		
		char ch[]=str.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
		
			int count=0;
			
			for (int j = 0; j < ch.length; j++) {
				
				if(ch[i]==ch[j])
				{
					if(i>j)
					{
						break;
					}
					else
					{
						count++;
					}
				}
				
			}
			if(count>=1) {
			System.out.print(count+""+ch[i]);
		}
			System.out.print("");
		}
	}
}
