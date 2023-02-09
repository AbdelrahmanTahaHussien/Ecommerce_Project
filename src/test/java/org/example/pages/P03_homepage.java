package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class P03_homepage {

    public P03_homepage ()
    {
        PageFactory.initElements(Hooks.driver , this);
    }


    @FindBy(css = "select[id='customerCurrency']")
    public WebElement currencey;

    @FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[1]/div/select/option[2]")
    public WebElement euro;

    @FindBy(css = "span[class='price actual-price']")
    public List<WebElement> webElementList ;


    @FindBy(css = "input[class='search-box-text ui-autocomplete-input']")
    public WebElement searchtxt;

    @FindBy(css ="button[class='button-1 search-box-button']" )
    public WebElement searchbutton;

    @FindBy(css = "div[class='item-box']")
    public List<WebElement> searchItemlist;

    @FindBy(css = "div[class='item-box']")
    public WebElement itembox;

    @FindBy(css = "div[class = 'sku'")
    public WebElement sku;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li")
    public List<WebElement> maincatergories;

    @FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li/ul/li")
    public List<WebElement> subcatergories;

    @FindBy(css = "div[class=\"page-title\"]")
    public WebElement pgtitle;

    @FindBy(css = "a[class=\"nivo-imageLink\"][style=\"display: block;\"]")
    public WebElement iphone;

    @FindBy(css = "a[class=\"nivo-imageLink\"][style=\"display: block;\"]")
    public WebElement nokia;

    @FindBy(css = "li[class='facebook']")
    public WebElement btnfacebook;

    @FindBy(css = "li[class='twitter']")
    public WebElement btntwitter;
    @FindBy(css = "li[class='rss']")
    public WebElement btnrss;
    @FindBy(css = "li[class='youtube']")
    public WebElement btnyoutube;



    @FindBy(css = "div[id='bar-notification']")
    public WebElement successnot;

    @FindBy(css = "span[class='close']")
    public WebElement successClose;

    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    public WebElement htcheart;

    @FindBy(css ="span[class='wishlist-label']")
    public WebElement wishlist;

    @FindBy(css = "input[aria-label='Qty.']")
    public WebElement qty;

}

