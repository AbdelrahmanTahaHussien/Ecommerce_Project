package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homepage;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.lang.ref.SoftReference;
import java.util.Locale;

public class D04_searchStepDef {

    P03_homepage search = new P03_homepage();



    @When("user enter Search item name as {string}")
    public void userEnterSearchItemNameAs(String item) {

        search.searchtxt.sendKeys(item);
        search.searchbutton.click();

    }

    @When("user click on the item")
    public void userClickOnTheItem() {
        search.itembox.click();
    }

    @Then("displayed objects contains the search word {string}")
    public void displayedObjectsContainsTheSearchWord(String txt) {

        for (int i = 0 ; i < search.searchItemlist.size() ; i++) {

            Assert.assertTrue(search.searchItemlist.get(i).getText().toLowerCase(Locale.ROOT).contains(txt));

        }
    }


    @Then("displayed objects contains the sku word {string}")
    public void displayedObjectsContainsTheSkuWord(String sku) {
        Assert.assertTrue(search.sku.getText().toUpperCase(Locale.ROOT).contains(sku));
    }
}
