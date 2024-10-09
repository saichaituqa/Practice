package dummy;

public class Electric {

	int power;
	String volt;
	
	public Electric(int power, String volt) {
		
		this.power = power;
		this.volt = volt;
	}
	
	public Electric() {
		
		
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public String getVolt() {
		return volt;
	}
	public void setVolt(String volt) {
		this.volt = volt;
	}
	
}
