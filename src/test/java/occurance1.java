
public class occurance1 {

	public static void main(String[] args) {
		
		String str="aaabbbcccdddaabbcc";
		
		char[] s = str.toCharArray();
		
		for (int i = 0; i < s.length; i++) {
			
			int count=1;
			
			for (int j = 0; j < s.length; j++) {
				
				if(s[i]==s[j])
				{
					count++;
				}
				else
				{
					System.out.println(s[j]+""+count);
					
					
				}
			}
		}
	}
}
