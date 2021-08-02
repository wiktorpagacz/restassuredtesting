package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.CoreMatchers.is;

public class GetPostSteps {
    @Given("I perform GET operation for {string}")
    public void iPerformGETOperationFor(String url) {
    }

    @And("I perform GET for the user number {string}")
    public void iPerformGETForTheUserNumber(String postNumber) {
        BDDStyledMethod.SimpleGETPost(postNumber);
    }

    @Then("I should see user name as {string}")
    public void iShouldSeeUserNameAs(String arg0) {
    }

    @Then("I should see the author names")
    public void iShouldSeeTheAuthorNames() {
        BDDStyledMethod.PerformContainsCollection();
    }
}
