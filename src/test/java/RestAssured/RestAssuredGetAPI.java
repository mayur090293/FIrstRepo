package RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredGetAPI  {

	public static void main(String[] args) 
	{
	  RequestSpecification req = given().auth().basic("sk_test_lae7YdisClt1oj4OjbYOXsAP00aSUi3HyW", "null");
	  req.given().header("Content-Type", "application/json");
	  Response response=req.get("https://api.stripe.com/v1/customers/cus_Gg9iNhWG2l9eNo");
	  response.prettyPrint();
	  int statusc = response.getStatusCode();
	  System.out.println("Status code returned is:" + statusc);
	}

}
 