package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.SignUpPage;
import utilities.Driver;

public class SignUpSteps {
    SignUpPage signUpPage = new SignUpPage();
    @Given("user clicks on sign up button and see error messages")
    public void user_clicks_on_sign_up_button_and_see_error_messages() {
       signUpPage.signUpBtn.click();
    }
    @Then("user verify the first error message as {string}")
    public void user_verify_the_first_error_message_as(String string) {
        Assert.assertEquals(string, signUpPage.errMsg1.getText());
    }
    @Then("user verify the second error message as {string}")
    public void user_verify_the_second_error_message_as(String string) {
        Assert.assertEquals(string, signUpPage.errMsg2.getText());
    }
    @Then("user verify the third error message as {string}")
    public void user_verify_the_third_error_message_as(String string) {
        Assert.assertEquals(string, signUpPage.errMsg3.getText());
    }
    @Then("close the application;")
    public void close_the_application() {
        Driver.closeDriver();
    }

    @Given("user sends in username as {string}")
    public void user_sends_in_username_as(String string) {
        signUpPage.userName.sendKeys(string);
    }
    @Then("user sends in email as {string}")
    public void user_sends_in_email_as(String string) {
        signUpPage.email.sendKeys(string);
    }
    @Then("user sends in password as {string}")
    public void user_sends_in_password_as(String string) {
        signUpPage.passWord.sendKeys(string);
    }
    @Then("user clicks on sign up button")
    public void user_clicks_on_sign_up_button() {
        signUpPage.signUpBtn.click();
        Assert.assertEquals("Conduit", Driver.getDriver().getTitle());
    }

}
