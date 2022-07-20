package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.junit.Test;
import pages.conduitMainPage;
import utilities.ConfigReader;
import utilities.Driver;

public class ConduitMainPageSteps {
    conduitMainPage conduitMainPage = new conduitMainPage();

    @Given("user is on the conduit page")
    public void user_is_on_the_conduit_page() {
        Driver.getDriver().get(ConfigReader.getProperty("conduit_url"));
    }

    @Then("verify the page header as {string}")
    public void verify_the_page_header_as(String string) {
        String conduitHeader = Driver.getDriver().getTitle();
        Assert.assertEquals(string, conduitHeader);
    }

    @Then("user clicks on sign up link and verifies the page header as {string}")
    public void user_clicks_on_sign_up_link_and_verifies_the_page_header_as(String string) {
        conduitMainPage.signUpLnk.click();
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertEquals(string, Driver.getDriver().getTitle());
    }

    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();
    }
}
