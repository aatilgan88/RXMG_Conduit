package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ConduitFeedAndPostPage {
    public ConduitFeedAndPostPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@class='nav-item'])[2]")
    public WebElement newPost;

    @FindBy(xpath = "//input[@class='form-control form-control-lg']")
    public  WebElement typeArticleTitle;

    @FindBy(xpath = "(//input[@class='form-control'])[1]")
    public  WebElement typearticleSubtitle;

    @FindBy(xpath = "//div[@class='col-md-10 offset-md-1 col-xs-12']/form/fieldset/fieldset[3]/textarea")
    public WebElement typeArticle;

    @FindBy(xpath = "//button[@class='btn btn-lg pull-xs-right btn-primary']")
    public  WebElement publichArticleBtn;


    @FindBy(xpath = "(//li[@class='nav-item']/a)[1]")
    public  WebElement homeButton;

    @FindBy(xpath = "(//li[@class='nav-item']/a)[6]")
    public  WebElement globalFeed;

    @FindBy(xpath = "//button[@class='btn btn-outline-danger btn-sm']")
    public  WebElement deleteBtn;

}
