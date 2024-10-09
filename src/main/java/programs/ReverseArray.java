package programs;

public class ReverseArray {

	public static void main(String[] args) {

		String s="ravichandra";

		char[] ch=s.toCharArray();	


		for (int i = 0; i < ch.length-1; i++) {

			int count=0;

			for (int j = 0; j < ch.length; j++) {

				if(ch[i]==ch[j])
				{
					if(i>j) {

						break;
					}
					else {
						count++;
					}
				}

			}
			if(count>=1) {
				System.out.println(ch[i]+""+count);
			}
		}
	}
}