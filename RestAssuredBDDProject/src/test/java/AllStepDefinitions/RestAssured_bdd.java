package AllStepDefinitions;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
@Test
public class RestAssured_bdd {
	
	RequestSpecification request;
	Response response;
	@Given("user enters url")
	public void user_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
         System.out.println("Given");
         RestAssured.baseURI = "https://reqres.in/api/users?page=2";
	}

	@When("status code using get method")
	public void status_code_using_get_method() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
		given().
		get("https://reqres.in/api/users?page=2").
		then().log().status();
		
	}

	@Then("status code received")
	public void status_code_received() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("status code received");
	}

}
