package RestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class preemitiveAuth 
{
 @Test
 public void testPreemitiveAuth()
 {
	 int scode=given()
	 .auth().preemptive().basic("ToolsQA", "TestPassword")
	 .when()
	 .get("http://restapi.demoqa.com/authentication/CheckForAuthentication/")
	 .getStatusCode();
	 Assert.assertEquals(scode, 200);
	 
	 
 }
}
