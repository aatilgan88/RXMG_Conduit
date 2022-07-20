package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LogInPage {
    public LogInPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="//button[@class='btn btn-lg btn-primary pull-xs-right']")
    public WebElement signInBtn;

    @FindBy(xpath ="(//ul[@class='error-messages']/li)[1]")
    public WebElement errMsg1;

    @FindBy(xpath = "(//ul[@class='error-messages']/li)[2]")
    public WebElement errMsg2;

    @FindBy(xpath = "(//input[@class='form-control form-control-lg'])[1]")
    public WebElement email;

    @FindBy(xpath = "(//input[@class='form-control form-control-lg'])[2]")
    public WebElement password;
}
