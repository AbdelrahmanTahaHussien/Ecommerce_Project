package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P01_Register {

    // 1-constructor
    public P01_Register ()
    {
        PageFactory.initElements(Hooks.driver , this);
    }

    @FindBy(className = "ico-register")
    public WebElement registerLink;

    @FindBy(css = "input[id='gender-male']")
    public WebElement maleGender;

    @FindBy(id = "FirstName")
    public  WebElement firstname;

    @FindBy(id = "LastName")
    public  WebElement lastname;

    @FindBy(css = "select[name='DateOfBirthDay']")
    public  WebElement birthday;

    @FindBy(css = "select[name='DateOfBirthMonth']")
    public  WebElement birthmonth;


    @FindBy(css = "select[name='DateOfBirthYear']")
    public  WebElement birthyear;

    @FindBy(css = "input[id='Email']")
    public  WebElement email;

    @FindBy(css = "input[id='Password']")
    public  WebElement password;

    @FindBy(css = "input[id='ConfirmPassword']")
    public  WebElement confrimpass;

    @FindBy(id = "register-button")
    public WebElement regbutton;

    @FindBy(css = "div[class='result']")
    public WebElement successmessage;
}

   /* public WebElement registerLink()
    {
        WebElement register =  Hooks.driver.findElement(By.className("ico-register"));
        return  register;
    }
}
*/