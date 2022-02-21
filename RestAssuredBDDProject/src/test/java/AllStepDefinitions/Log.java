package AllStepDefinitions;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Log {
	
	@Test
	public void GetMethod() {
		Response response = given().
				    header("Content-Type","application/JSON").
			when().
			      get("https://reqres.in/api/users?page=2").
			then().
			      statusCode(200).
			      log().all().
			      extract().response();
	}

}
