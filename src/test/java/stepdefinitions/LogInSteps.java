package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.LogInPage;
import pages.SignUpPage;
import utilities.Driver;

public class LogInSteps {
    LogInPage logInPage = new LogInPage();
    SignUpPage signUpPage = new SignUpPage();

    @Given("user clicks on sign in link")
    public void user_clicks_on_sign_in_link() {
        signUpPage.signInLnk.click();
    }

    @Then("user clicks on sign in button and sees errors")
    public void user_clicks_on_sign_in_button_and_sees_errors() {
        logInPage.signInBtn.click();
    }
    @Then("first error is visible as {string}")
    public void first_error_is_visible_as(String string) {
        Assert.assertEquals(string, logInPage.errMsg1.getText());
    }
    @Then("second error is visible as {string}")
    public void second_error_is_visible_as(String string) {
        Assert.assertEquals(string, logInPage.errMsg2.getText());
    }

    @Given("user puts email as {string}")
    public void user_puts_email_as(String string) {
        logInPage.email.sendKeys(string);

    }
    @Then("user puts password as {string}")
    public void user_puts_password_as(String string) {
        logInPage.password.sendKeys(string);
    }


    @Then("user clicks on sign in button and verify the log in page")
    public void user_clicks_on_sign_in_button_and_verify_the_log_in_page() {
        logInPage.signInBtn.click();
        Assert.assertEquals("Conduit", Driver.getDriver().getTitle());

    }

}
