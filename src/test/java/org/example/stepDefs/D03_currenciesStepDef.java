package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homepage;
import org.testng.Assert;

public class D03_currenciesStepDef {

    P03_homepage euro = new P03_homepage();

    @Given("user clicks on the currencies list")
    public void user_clicks_on_the_currencies_list()
    {
        euro.currencey.click();
    }

    @And("user choose Euro currency")
    public void userChooseEuroCurrency() {
        euro.euro.click();
    }

    @Then("all displayed objects prices are in euros")
    public void allDisplayedObjectsPricesAreInEuros() {

        for (int i = 0 ; i<4 ; i++)
        {
           Assert.assertTrue(euro.webElementList.get(i).getText().contains("€"));
        }


    }
}
