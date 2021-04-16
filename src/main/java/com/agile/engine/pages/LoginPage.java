package com.agile.engine.pages;

import com.agile.engine.controller.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.IOException;

public class LoginPage extends BasePage {

    @FindBy(id="email-input")
    WebElement emailInput;

    @FindBy(id="password-input")
    WebElement passwordInput;

    @FindBy(id="login-button")
    WebElement loginButton;


    public LoginPage(){
        PageFactory.initElements(webDriver, this);
    }

    public void findLoginElements(){
        emailInput.isDisplayed();
        passwordInput.isDisplayed();
        loginButton.isDisplayed();
    }

    public void loginMethod(String email, String password){
        // This method is used in all login scenarios
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);

        loginButton.click();
    }
}
