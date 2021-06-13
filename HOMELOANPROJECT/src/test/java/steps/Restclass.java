package steps;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Restclass {
	
	@Test
	void test_02()
	{
		given()
		.get("https://anypoint.mulesoft.com/mocking/api/v1/sources/exchange/assets/org.mule.examples/customer-home-loans/1.0.0/m/Loans").then().statusCode(200);
		//.body("data.id[0]", equalTo(7));
	}
	
}