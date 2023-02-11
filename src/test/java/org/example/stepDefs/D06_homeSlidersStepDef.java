package org.example.stepDefs;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.pool.TypePool;
import org.example.pages.P03_homepage;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {
        SoftAssert softAssert = new SoftAssert();
    P03_homepage slider = new P03_homepage();

    @When("user click the iphone slider")
    public void user_click_the_iphone_slider(){
        Actions sliders = new Actions(driver);
       sliders.moveToElement(slider.iphone).perform();
       sliders.click().build().perform();
    }


    @Then("Url navigate to the iphone slider product")
    public void urlNavigateToTheIphoneSliderProduct() {
        String url = Hooks.driver.getCurrentUrl();

        softAssert.assertEquals(url,"https://demo.nopcommerce.com/iphone-6");

    }

    @When("user click the nokia slider")
    public void userClickTheNokiaSlider() {
       Actions sliders = new Actions(driver);
        sliders.moveToElement(slider.nokia,600,0).perform();
        sliders.click().build().perform();


    }

    @Then("Url navigate to the nokia slider product")
    public void urlNavigateToTheNokiaSliderProduct() {

        String url = Hooks.driver.getCurrentUrl();

        softAssert.assertEquals(url,"https://demo.nopcommerce.com/nokia-lumia-1020");
        softAssert.assertAll();
    }

}
