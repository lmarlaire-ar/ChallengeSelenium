package com.agile.engine.utils;

import com.agile.engine.controller.BasePage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.events.WebDriverEventListener;

import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class WebEventListener extends BasePage implements WebDriverEventListener {

    public void beforeAlertAccept(WebDriver webDriver, String url){
        System.out.println("Before navigating to: '" + url + "'");
    }

//    public void onException(Throwable error, WebDriver driver) {
//        System.out.println("Exception occured: " + error);
//        try {
//            takeScreenshotAtEndOfTest();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void takeScreenshotAtEndOfTest() throws IOException {
//        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
//        String currentDir = System.getProperty("user.dir");
//        FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//    }
//
    @Override
    public void beforeAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertAccept(WebDriver webDriver) {

    }

    @Override
    public void afterAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeAlertDismiss(WebDriver webDriver) {

    }

    @Override
    public void beforeNavigateTo(String s, WebDriver webDriver) {
        System.out.println("Before navigating to previous page");
    }

    @Override
    public void afterNavigateTo(String s, WebDriver webDriver) {
        System.out.println("After navigating to previous page");
    }

    @Override
    public void beforeNavigateBack(WebDriver webDriver) {
        System.out.println("Before navigated back to previous page");
    }

    @Override
    public void afterNavigateBack(WebDriver webDriver) {
        System.out.println("After navigated back to previous page");
    }

    @Override
    public void beforeNavigateForward(WebDriver webDriver) {
        System.out.println("Before navigated forward to previous page");
    }

    @Override
    public void afterNavigateForward(WebDriver webDriver) {
        System.out.println("After navigated forward to previous page");
    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {

    }

    @Override
    public void beforeFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterFindBy(By by, WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterClickOn(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void beforeChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void afterChangeValueOf(WebElement webElement, WebDriver webDriver, CharSequence[] charSequences) {

    }

    @Override
    public void beforeScript(String s, WebDriver webDriver) {

    }

    @Override
    public void afterScript(String s, WebDriver webDriver) {

    }

    @Override
    public void beforeSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void afterSwitchToWindow(String s, WebDriver webDriver) {

    }

    @Override
    public void onException(Throwable throwable, WebDriver webDriver) {

    }

    @Override
    public <X> void beforeGetScreenshotAs(OutputType<X> outputType) {

    }

    @Override
    public <X> void afterGetScreenshotAs(OutputType<X> outputType, X x) {

    }

    @Override
    public void beforeGetText(WebElement webElement, WebDriver webDriver) {

    }

    @Override
    public void afterGetText(WebElement webElement, WebDriver webDriver, String s) {

    }
}
