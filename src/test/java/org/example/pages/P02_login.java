package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {

    public P02_login ()
    {
        PageFactory.initElements(Hooks.driver , this);
    }

    @FindBy(css = "a[class='ico-login']")
    public WebElement loginButton;

    @FindBy(css = "input[class='email']")
    public WebElement emailin;
    @FindBy(css = "input[class='password']")
    public WebElement passin;

    @FindBy(css = "button[class='button-1 login-button']")
    public WebElement presslogin;

    @FindBy(css = "a[class='ico-account']")
    public WebElement myaccount;

    @FindBy(css = "div[class='message-error validation-summary-errors']")
    public  WebElement errormsg;

}
