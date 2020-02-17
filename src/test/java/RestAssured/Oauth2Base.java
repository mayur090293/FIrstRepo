package RestAssured;

import org.testng.annotations.BeforeTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Oauth2Base 
{
   static String token;
   @BeforeTest
   public String generatetokenforoauth2()
   {
	   Response resp = RestAssured.given()
				.formParam("client_id", "MayurApp")
				.formParam("client_secret", "f9825993d44e6d0ea74476c2dbd7253a")
				.formParam("grant_type", "client_credentials")
				
				.post("http://coop.apps.symfonycasts.com/token");
				
				System.out.println(resp.jsonPath().prettify());
				token = resp.jsonPath().getJsonObject("access_token");
				System.out.println(token);
				return(token);
   }
	
	
	
	
	
}
