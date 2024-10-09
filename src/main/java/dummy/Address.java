package dummy;


public class Address {

	private String city;
	String countryCode;
	String postalCode;
	String street;

	
	public Address(String city, String countryCode, String postalCode, String street) {
		this.city = city;
		this.countryCode = countryCode;
		this.postalCode = postalCode;
		this.street = street;
	}
	
	public Address() {
		
		
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	
}


