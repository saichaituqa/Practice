import java.util.Iterator;

public class subString {

	public static void main(String[] args) {
		
		String str="vinnay";
		
		for (int i = 0; i < str.length(); i++) {
			
			for (int j = i+1; j < str.length(); j++) {
				
			String str1 = str.substring(i,j);
			
			System.out.println(str1);
			
			if(str1.length()==3)
			{
				String temp="";
				
				for (int k = 0; k < args.length; k++) {
					
				}
			}
			}
		}
	}
}
