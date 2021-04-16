package com.agile.engine.controller;

import com.agile.engine.utils.WebEventListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class BasePage {
    public static WebDriver webDriver = new ChromeDriver();
    public static WebDriverWait wait = new WebDriverWait(webDriver, 10);

    public  static EventFiringWebDriver e_driver;
    public static WebEventListener eventListener;

    static Properties props = new Properties();
    private static String URL_CHALLENGE;
    private static String CHROME_DRIVER_PATH;

    public BasePage() {
        String propsFileName = "config.properties";
        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propsFileName);

        if(props.isEmpty()){
            try {
                props.load(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if(inputStream != null){
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static {
        URL_CHALLENGE = props.getProperty("appUrl");
        CHROME_DRIVER_PATH = props.getProperty("chromeDriverPath");
    }

    public static void initialization(){
        System.out.println("Open Chrome!!");

        System.setProperty("webdriver.chrome.driver", props.getProperty("chromeDriverPath"));

        System.out.println("Starting the execution...");
        webDriver.get(props.getProperty("appUrl"));


        e_driver = new EventFiringWebDriver(webDriver);
        eventListener = new WebEventListener();
        e_driver.register(eventListener);
        webDriver = e_driver;

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Reaching URL ...");

    }

    public static String getUrlChallenge() {
        return URL_CHALLENGE;
    }
}
