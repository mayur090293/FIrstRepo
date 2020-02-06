package RestAssured;

import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredPostApi {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		RequestSpecification req =given().header("Authorization", "Bearer sk_test_lae7YdisClt1oj4OjbYOXsAP00aSUi3HyW");
		req.header("Content-Type", "application/json");
		
		JSONObject json = new JSONObject();
		json.put("name","Tom Miller");
		json.put("email", "tom.miller@gmail.com");
		
		req.body(json.toString());
		
		Response jsonresp=req.post("https://api.stripe.com/v1/customers");
		System.out.println("Json response for new entry:" + jsonresp);
		System.out.println(jsonresp.getStatusCode());
	}
	
	

}
