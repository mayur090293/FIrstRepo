package mvn_prac;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest 
{

	@Test
	public void apiBody()
	{
	    Response resp =RestAssured.get("http://parabank.parasoft.com/parabank/services/bank/customers/12212/");
		String data =resp.asString();
	    System.out.println("Response of API is =" + data);
	   	
	}
	
	@Test
	public void apiStatusCheck()
	{
		Response resp = RestAssured.get("https://github.com/rest-assured/rest-assured/wiki/Usage_Legacy");
		int statusc = resp.getStatusCode();
		Assert.assertEquals(statusc, 200);
	}
}
