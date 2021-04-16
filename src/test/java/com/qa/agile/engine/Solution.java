package com.qa.agile.engine;

import com.agile.engine.controller.BasePage;
import com.agile.engine.pages.LoginPage;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

public class Solution extends BasePage {
   /*
      Author: Lucas Marlaire lmarlaire@gmail.com

      You can copy credentials from here:
       - login@codility.com    password
       - unknown@codility.com  password
    */
    private LoginPage loginPage;

    // In this case, I do not prefer to use hardcoded data. I prefer to use another option like a Property or yml file
    private String messageSuccess = "Welcome to Codility";
    private String messageLoginFail = "You shall not pass! Arr!";
    private String messageEmailValidationError = "Enter a valid email";
    private String emptyCredentials = "Email is required\nPassword is required";

    public Solution()  {
        super();
    }

    private static void homeUrl(){
        webDriver.get(getUrlChallenge());
        webDriver.manage().window().maximize();
    }


    @Before
    public void setUp(){
        initialization();
        loginPage = new LoginPage();
        System.out.println("Paso por el setUp Method!!");
    }

    @Test // scenario 1
    public void testLoginFormPresent() {
        loginPage.findLoginElements();
    }

    @Test // scenario 2
    public void testLoginSuccess() {
        loginPage.loginMethod("login@codility.com", "password");
        WebElement firstResult = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions
                .presenceOfElementLocated(By.id("container")));
        System.out.println("Message displayed: " + firstResult.getText());
        Assert.assertEquals(firstResult.getText(), messageSuccess);
    }

    @Test // scenario 3
    public void testLoginWrongCredentials() {
        loginPage.loginMethod("unknown@codility.com", "password");

        WebElement firstResult = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.id("messages")));
        System.out.println("Message displayed: " + firstResult.getText());
        Assert.assertEquals(firstResult.getText(), messageLoginFail);
    }

    @Test // scenario 4
    public void testLoginEmailValidation() {
        loginPage.loginMethod("wrong email structure", "password");

        WebElement firstResult = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.id("messages")));
        System.out.println("Message displayed: " + firstResult.getText());
        Assert.assertEquals(firstResult.getText(), messageEmailValidationError);
    }

    @Test // scenario 5
    public void testLoginEmptyCredentials() {
        loginPage.loginMethod("", "");

        WebElement firstResult = new WebDriverWait(webDriver, 5)
                .until(ExpectedConditions
                        .presenceOfElementLocated(By.id("messages")));
        System.out.println("Message displayed: " + firstResult.getText());

        Assert.assertEquals(firstResult.getText(), emptyCredentials);
    }

    @AfterMethod
    public void tearDown(){
        webDriver.quit();
    }
}
