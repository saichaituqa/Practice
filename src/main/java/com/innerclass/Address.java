package com.innerclass;

public class Address {

	String city;
	String CountryCode;
	String Postalcode;
	String street;
	boolean variablec;
	String variabled;
	
	public Address(String city,String CountryCode,String Postalcode,String street) {
		
		this.city=city;
		this.CountryCode=CountryCode;
		this.Postalcode=Postalcode;
		this.street=street;
	}

	public String getCity() {
		return city;
	}

	public String getCountryCode() {
		return CountryCode;
	}

	public String getPostalcode() {
		return Postalcode;
	}

	public String getStreet() {
		return street;
	}
	
class variableb{
	Electric electric;
	
	
}

class Electric{
	
	String power;
	String vaolt;
	
	public Electric(String power,String vaolt) {
		this.power=power;
		this.vaolt=vaolt;
		
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getVaolt() {
		return vaolt;
	}

	public void setVaolt(String vaolt) {
		this.vaolt = vaolt;
	}
	
	
}
}


