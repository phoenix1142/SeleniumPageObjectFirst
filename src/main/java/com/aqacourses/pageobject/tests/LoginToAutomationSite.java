package com.aqacourses.pageobject.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Collections;

public class LoginToAutomationSite {
    private WebDriver driver;

    /**
     * setUp() method to create something
     */
    @Before
    public void setUp() {
        // If you want to disable infobars please use this code
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption(
                "excludeSwitches", Collections.singletonList("enable-automation"));
        options.setExperimentalOption("useAutomationExtension", false);

        // Initialize path to ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
    }

    /**
     * Open site and login and logout
     */
    @Test
    public void testLoginToAutomationSite() {

    }

    /**
     * Make driver quits
     */
    @After
    public void tearDown() {
        driver.quit();
    }
}
