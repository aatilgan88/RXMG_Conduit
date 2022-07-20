package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class SignUpPage {
    public SignUpPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(xpath = "//button[@class='btn btn-lg btn-primary pull-xs-right']")
    public WebElement signUpBtn;

    @FindBy(xpath = "(//input[@class='form-control form-control-lg'])[1]")
    public WebElement userName;

    @FindBy(xpath = "(//input[@class='form-control form-control-lg'])[2]")
    public WebElement email;

    @FindBy(xpath = "(//input[@class='form-control form-control-lg'])[3]")
    public WebElement passWord;

    @FindBy(xpath = "//ul[@class='error-messages']/li")
    public List<WebElement> errMsgList;

    @FindBy(xpath = "(//ul[@class='error-messages']/li)[1]")
    public WebElement errMsg1;

    @FindBy(xpath = "(//ul[@class='error-messages']/li)[2]")
    public WebElement errMsg2;

    @FindBy(xpath = "(//ul[@class='error-messages']/li)[3]")
    public WebElement errMsg3;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement signInLnk;

}
