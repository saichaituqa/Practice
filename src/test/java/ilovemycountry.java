
public class ilovemycountry {

	public static void main(String[] args) {
		
		String str="i love my country";
		
		String[] reverse=str.split(" ");
		
		for (int i = 0; i < reverse.length; i++) {
			
			//System.out.println(reverse[i]);
			
			if(i==reverse.length-1 || i==reverse.length-3)
			{
				char ch[]=reverse[i].toCharArray();
				
				for (int j=ch.length-1; j>=0; j--) {
					
					System.out.print(ch[j]);
				}
				System.out.println();
			}
			else
			{
				System.out.println(reverse[i]);
			}
			}
			}
		}
	

