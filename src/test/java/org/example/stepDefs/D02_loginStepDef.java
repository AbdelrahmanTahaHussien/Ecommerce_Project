package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class D02_loginStepDef {
    P02_login login = new P02_login();
    @Given("user go to login page")
        public void user_go_to_login_page(){

            login.loginButton.click();
        }


    @When("user login with {string} {string} and {string}")
    public void userLoginWithAnd(String arg,String email, String password) {

            login.emailin.sendKeys(email);
            login.passin.sendKeys(password);
    }

    @And("user press on login button")
    public void userPressOnLoginButton() {

        login.presslogin.click();
    }


    @Then("user login to the system successfully")
    public void userLoginToTheSystemSuccessfully() {
       String linkUrl = Hooks.driver.getCurrentUrl();
        SoftAssert soft = new SoftAssert();
        soft.assertEquals(linkUrl,"https://demo.nopcommerce.com/");
        System.out.println(linkUrl);
        login.myaccount.isDisplayed();
        soft.assertAll();
    }

    @Then("user could not login to the system")
    public void userCouldNotLoginToTheSystem() {



        String color = login.errormsg.getCssValue("color");

        SoftAssert soft = new SoftAssert();

        soft.assertTrue(login.errormsg.getText().contains("Login was unsuccessful"));

        soft.assertEquals(Color.fromString(color).asHex(),"#e4434b");

        soft.assertAll();
    }
}
