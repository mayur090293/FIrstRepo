package RestAssured;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class OAuth2 extends Oauth2Base
{

	@Test
	public void useoauth2()
	{
		
		Response resp1 = RestAssured.given()
				.auth()
				.oauth2(token)
				.post("http://coop.apps.symfonycasts.com/api/750/eggs-collect");
				
			    System.out.println(resp1.getStatusCode());
			    System.out.println(resp1.jsonPath().prettify());

	}
	
	
	
	
}
