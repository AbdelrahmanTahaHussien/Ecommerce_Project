package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.example.pages.P03_homepage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.time.Duration;

public class D08_WishlistStepDef {
    SoftAssert softAssert =new SoftAssert();

    P03_homepage wishlist = new P03_homepage();

    @When("user click on wishlist button on HTC")
    public void UserClickOnWishlistButtonOnHTC() {
        wishlist.htcheart.click();
    }


    @Then("Notification success message appeare in green color {string}")
    public void notificationSuccessMessageAppeareInGreenColor(String green) {

        wishlist.successnot.isDisplayed();
        String  color = wishlist.successnot.getCssValue("color");
        softAssert.assertEquals(Color.fromString(color).asHex(),"#4bb07a");

    }



    @When("user closes notification and click on wishlist")
    public void userClosesNotificationAndClickOnWishlist() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(wishlist.successnot));
        wishlist.successClose.click();
        wishlist.wishlist.click();

    }

    @Then("check that qty is more than 0")
    public void checkThatQtyIsMoreThan() {
      int c = Integer.parseInt(wishlist.qty.getAttribute("value"));

       softAssert.assertTrue(c>0);
        softAssert.assertAll();

    }
}
