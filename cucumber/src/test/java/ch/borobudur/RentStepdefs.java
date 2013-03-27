package ch.borobudur;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RentStepdefs {
    @Given("^there are (\\d+) cars available for rental$")
    public void there_are_cars_available_for_rental(int availableCars) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @When("^I rent one$")
    public void rent_one_car() throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }

    @Then("^there will only be (\\d+) cars available for rental$")
    public void there_will_be_less_cars_available_for_rental(int expectedAvailableCars) throws Throwable {
        // Express the Regexp above with the code you wish you had
        throw new PendingException();
    }
}
