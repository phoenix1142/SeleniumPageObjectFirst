package com.aqacourses.pageobject.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends AbstractPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy (xpath = "//*[@class='page-heading' ]")
    private WebElement checkAccountPage;

    @FindBy (xpath = "//*[@class='account']")
    private WebElement checkFIO;

    @FindBy (xpath = "//*[@class='logout']")
    private WebElement signOutButton;


    /**
     * Constructor
     *
     * @param driver
     */
    public AccountPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOf(checkAccountPage));
    }
/*
Check correct account FIO
 */
    public AccountPage checkFioOnAccountPage(){
        Assert.assertEquals("Values Are Different","Vanya Loboda",checkFIO.getAttribute("textContent"));
        return this;
    }
/*
click to button SignOut
 */
    public AccountPage clickToSignOut(){
        signOutButton.click();
        return this;
    }

}
