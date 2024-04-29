package restAPI;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAPITest {
	
	@Test
	public void A_GetAllProducts() {
		
		RestAssured.baseURI="http://localhost:8081/medicare/show/all/products";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.body().asString();
		System.out.println(responseBody);
		System.out.println("Response code is:"+response.statusCode());
		AssertJUnit.assertEquals(response.statusCode(), 200);	
		
	}
	
	@Test
	public void B_GetCatagory2Product() {
		
		RestAssured.baseURI="http://localhost:8081/medicare/show/category/2/products";
		RequestSpecification request = RestAssured.given();
		Response response = request.get();
		String responseBody = response.body().asString();
		System.out.println(responseBody);
		System.out.println("Response code is:"+response.statusCode());
		AssertJUnit.assertEquals(response.statusCode(), 200);
				
		
		
	}
	
	

}
