package AllStepDefinitions;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
@Test
public class BDDFrameWork_Setup {
	
	@Given("user enters url")
	public void user_is_enters_url() {
	    // Write code here that turns the phrase above into concrete actions
         System.out.println("Given");
         
	}

	@When("user navigated to url")
	public void user_navigated_to_url () {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("when");
		
	}

	@Then("successful")
	public void successful() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("then");
	}

}
