package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.ConduitFeedAndPostPage;
import utilities.Driver;

public class ConduitFeedAndPostSteps {
    ConduitFeedAndPostPage conduitFeedAndPostPage = new ConduitFeedAndPostPage();

    @Given("user clicks on new post link")
    public void user_clicks_on_new_post_link() {
        conduitFeedAndPostPage.newPost.click();
    }
    @Then("user send in article title as {string}")
    public void user_send_in_article_title_as(String string) {
        conduitFeedAndPostPage.typeArticleTitle.sendKeys(string);
    }
    @Then("user send in the topic as {string}")
    public void user_send_in_the_topic_as(String string) {
        conduitFeedAndPostPage.typearticleSubtitle.sendKeys(string);
    }
    @Then("user sends in the article as {string}")
    public void user_sends_in_the_article_as(String string) {
        conduitFeedAndPostPage.typeArticle.sendKeys(string);
    }
    @Then("user clicks on publish article button and verify the title as {string}")
    public void user_clicks_on_publish_article_button_and_verify_the_title_as(String string) {
        conduitFeedAndPostPage.publichArticleBtn.click();
    }

    @Given("user clicks on home button")
    public void user_clicks_on_home_button() {
        conduitFeedAndPostPage.homeButton.click();
    }

    @Then("user clicks on global feed")
    public void user_clicks_on_global_feed() {
        conduitFeedAndPostPage.globalFeed.click();
    }


    @Then("user verify the title of the post as {string}")
    public void user_verify_the_title_of_the_post_as(String articleTitle) {
        WebElement postTitle= Driver.getDriver().findElement(By.xpath("//h1[text()='"+articleTitle+"']"));
        Assert.assertTrue(postTitle.isDisplayed());
    }

    @Then("user verify the topic of the post as {string}")
    public void user_verify_the_topic_of_the_post_as(String articleTopic) {
        WebElement postTopic= Driver.getDriver().findElement(By.xpath("//p[text()='"+articleTopic+"']"));
        Assert.assertTrue(postTopic.isDisplayed());
    }

    @Given("user clicks on the {string} post")
    public void user_clicks_on_the_automation_post(String post) {
        WebElement postTitle= Driver.getDriver().findElement(By.xpath("//h1[text()='"+post+"']"));
        postTitle.click();
    }

    @Then("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        conduitFeedAndPostPage.deleteBtn.click();
    }

    @Then("verify that {string} post is deleted")
    public void verify_that_automation_post_is_deleted(String post) {
        Boolean isPresent = Driver.getDriver().findElements(By.xpath("//h1[text()='"+post+"']")).size() > 0;
        Assert.assertFalse(isPresent);
    }


}
