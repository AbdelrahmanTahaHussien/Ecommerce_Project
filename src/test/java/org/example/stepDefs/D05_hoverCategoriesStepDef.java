package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.sl.In;
import org.apache.commons.lang3.RandomUtils;
import org.example.pages.P03_homepage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import javax.swing.*;

import java.util.Random;

import static org.example.stepDefs.Hooks.driver;

public class D05_hoverCategoriesStepDef {

    P03_homepage main = new P03_homepage();
    String type ;

    @When("user hover choosing 1 of 3 main categories")
    public void user_hover_choosing_1_of_3_main_catergories()
    {
        Actions hover = new Actions(driver);
        Random random = new Random();

        hover.moveToElement(main.maincatergories.get(random.nextInt(2))).perform();


    }


    @And("user hover chossing 1 of 3 sub-categories")
    public void userHoverChossingOfSubCategories() {
        Actions hover = new Actions(driver);
        Random random = new Random();

        WebElement element = main.subcatergories.get(random.nextInt(2));

        hover.moveToElement(element).perform();

        type = element.getText();

        hover.click().build().perform();
    }

    @Then("user checks that the expected page is right")
    public void userChecksThatTheExpectedPageIsRight(){


        SoftAssert soft =  new SoftAssert();

        soft.assertEquals(main.pgtitle.getText(),type);

        soft.assertAll();
    }
}
