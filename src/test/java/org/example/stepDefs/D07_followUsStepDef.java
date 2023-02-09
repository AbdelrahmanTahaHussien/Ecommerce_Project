package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;

import java.util.Set;

public class D07_followUsStepDef {

    P03_homepage follow = new P03_homepage();

    String mainurl;
    String childurl;

    @When("user click on the facebook button")
    public void UserClickOnTheFacebookButton() throws InterruptedException {
        follow.btnfacebook.click();
        mainurl =   Hooks.driver.getWindowHandle();
        Thread.sleep(2000);
        Set<String> child = Hooks.driver.getWindowHandles();
        for(String a : child) {
           childurl= Hooks.driver.switchTo().window(a).getCurrentUrl();
        }
        }


    @Then("Url navigate to facebook {string}")
    public void urlNavigateToFacebook(String facebookurl) {
        Assert.assertEquals(childurl,facebookurl);
    }

    @When("user click on the twitter button")
    public void userClickOnTheTwitterButton() throws InterruptedException {
        follow.btntwitter.click();
        mainurl = Hooks.driver.getWindowHandle();
        Thread.sleep(2000);
        Set<String> child = Hooks.driver.getWindowHandles();
        for (String a : child) {
            childurl = Hooks.driver.switchTo().window(a).getCurrentUrl();
        }}

        @Then("Url navigate to twitter {string}")
        public void urlNavigateToTwitter (String twitterUrl){
            Assert.assertEquals(childurl, twitterUrl);
        }

        @When("user click on the rss button")
        public void userClickOnTheRssButton () throws InterruptedException {
            follow.btnrss.click();
            mainurl = Hooks.driver.getWindowHandle();
            Thread.sleep(2000);
            Set<String> child = Hooks.driver.getWindowHandles();
            for (String a : child) {
                childurl = Hooks.driver.switchTo().window(a).getCurrentUrl();
            }
        }

        @Then("Url navigate to rss link {string}")
        public void urlNavigateToRssLink (String rssurl){
            Assert.assertEquals(childurl, rssurl);
        }

        @When("user click on the youtube button")
        public void userClickOnTheYoutubeButton () throws InterruptedException {
            follow.btnyoutube.click();
            mainurl = Hooks.driver.getWindowHandle();
            Thread.sleep(2000);
            Set<String> child = Hooks.driver.getWindowHandles();
            for (String a : child) {
                childurl = Hooks.driver.switchTo().window(a).getCurrentUrl();
            }
        }

        @Then("Url navigate to the youtube link {string}")
        public void urlNavigateToTheYoutubeLink (String youtubeurl){
            Assert.assertEquals(childurl, youtubeurl);
        }
    }
