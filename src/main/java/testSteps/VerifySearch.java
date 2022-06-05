package testSteps;

import commonLibraries.CommonFunctions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifySearch extends CommonFunctions {
    @Given("I launch homepage of the url {string}")
    public void openHomePage() {

    }
    @When(" I click on search field and enter the search term {string}")
    public void searchItem() {
    }
    @And("I click on search icon")
    public void ClickSearchIcon() {
    }
    @Then("I should see products related to {String} in search results page")
    public void verifySearch() {
    }


}
