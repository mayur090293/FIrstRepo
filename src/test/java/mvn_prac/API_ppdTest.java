package mvn_prac;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class API_ppdTest 
{
   @SuppressWarnings("unchecked")
@Test
   public void postTest()
   {
	   RequestSpecification req=RestAssured.given();
	   
	   req.header("Content-Type","application/json");  
	   
	   JSONObject json = new JSONObject();
	   
	   json.put("id","4");
	   json.put("title","This is my 4th post request");
	   json.put("author","Mayur Mahagaonkar");
	   
	   req.body(json.toJSONString());
	   
	   Response resp=req.post("http://localhost:3000/posts");
	   int code=resp.getStatusCode();
	   Assert.assertEquals(201, code);
	   
   }
   
   @SuppressWarnings("unchecked")
@Test
   public void putTest()
   {
	   RequestSpecification reqs=RestAssured.given();
	   
	   reqs.header("Content-Type","application/json");
	   
	   JSONObject json=new JSONObject();
	   json.put("id","9");
	   json.put("title","This is updated via post");
	   json.put("author","Mayur");
	   
	   reqs.body(json.toJSONString());
	   
	   Response resp=reqs.put("http://localhost:3000/posts/9");
	   System.out.println(resp.body());
   }
   
   @Test
   public void deleteTest()
   {
	   RequestSpecification resps=RestAssured.given();
	   Response rep = resps.delete("http://localhost:3000/posts/9");
	   int code = rep.getStatusCode();
	   Assert.assertEquals(200, code);
	   
   }
	
}
