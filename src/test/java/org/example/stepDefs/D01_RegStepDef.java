package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_Register;
import org.openqa.selenium.By;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class D01_RegStepDef {

    P01_Register register = new P01_Register();

    @Given("user go to register page")
    public void user_go_to_register_page() {

            register.registerLink.click();
    }

    @When("user select gender type")
    public void userSelectGenderType() {

        register.maleGender.click();

    }

    @And("user enter first name {string} and last name {string}")
    public void userEnterFirstNameAndLastName(String firstName, String lastName) {

        register.firstname.sendKeys(firstName);
        register.lastname.sendKeys(lastName);

    }

    @And("user enter date of birth")
    public void userEnterDateOfBirth() {

        Select selectday = new Select(register.birthday);
        selectday.selectByIndex(15);

        Select selectmonth = new Select(register.birthmonth);
        selectmonth.selectByIndex(7);

        Select selectyear = new Select(register.birthyear);
        selectyear.selectByValue("1997");

    }

    @And("user enter email {string} field")
    public void userEnterEmailField(String email) {
        register.email.sendKeys(email);
    }

    @And("user fills Password Fields {string}")
    public void userFillsPasswordFields(String password) {
        register.password.sendKeys(password);
        register.confrimpass.sendKeys(password);

    }

    @And("user clicks on register button")
    public void userClicksOnRegisterButton() {
        register.regbutton.click();
    }

    @Then("success message is displayed")
    public void successMessageIsDisplayed() {

            String color = register.successmessage.getCssValue("color");

            SoftAssert soft = new SoftAssert();

            soft.assertTrue(register.successmessage.getText().contains("Your registration completed"));

            soft.assertEquals(Color.fromString(color).asRgba(),"rgba(76, 177, 124, 1)");

            soft.assertAll();

    }


}
