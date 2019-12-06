package com.aqacourses.pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@class='login']")
    private WebElement signIn;

    @FindBy(xpath = "//*[@id='homeslider']")
    WebElement pageDiv;




    /** Constructor */
    public AbstractPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver,this); // Initialize WebElements
        //wait.until(ExpectedConditions.visibilityOf(pageDiv));
    }

    /**
     * Click on SignIn and get Login Page
     * @return
     */
    public SignInPage clickSignInLink() {
        wait.until(ExpectedConditions.elementToBeClickable(signIn)).click();
        return new SignInPage(driver);
    }


}
