package exceptions;

public class Conc2 extends Conc {

	public void start() {
		
		System.out.println("hai");
	}
	
	public static void main(String[] args) {
		
		Conc2 c=new Conc2();
		
		c.start();
	}
}
