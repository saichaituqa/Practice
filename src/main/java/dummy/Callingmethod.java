package dummy;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class Callingmethod {

	public static void main(String[] args) {
		
		Address ad=new Address("Vijaya", "5623", "6565", "sadf");
				
		Electric e=new Electric(2000, "5000v");
		
		Variableb b=new Variableb(e);
		
		Pojomainclass po=new Pojomainclass(ad, b, true,"hai", e);
		
		given().body(po).contentType(ContentType.JSON)
		
		.when().get().then().log().all();
		
	}
}
