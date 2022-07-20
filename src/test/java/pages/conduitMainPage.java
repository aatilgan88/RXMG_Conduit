package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class conduitMainPage {
    public conduitMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath = "(//ul[@class='nav navbar-nav pull-xs-right']/li)[3]")
    public WebElement signUpLnk;

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement signInLnk;
}
