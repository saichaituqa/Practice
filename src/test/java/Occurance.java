
public class Occurance extends Cliniq{

	public static void main(String[] args) {
		
		Cliniq oc=new Cliniq();
		
		
		Cliniq c=new Occurance();
		
		Occurance oo=new Occurance();
		
		oo.cq();
		
		String str="hello hai namaste";
		
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
					else {
						count++;
					}
				}
				
			}
			if(count>=1)
			{
				System.out.println(ch[i]+"----------->"+count);
			}
			
		}
	}
}
