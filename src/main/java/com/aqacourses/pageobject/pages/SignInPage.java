package com.aqacourses.pageobject.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage extends AbstractPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//*[@class='page-heading']")
    public WebElement checkLoginPage;

    @FindBy(xpath = "//*[@name='email']")
    public WebElement email;

    @FindBy(xpath = "//*[@name='passwd']")
    public WebElement password;

    @FindBy(xpath = "//*[@id='SubmitLogin']")
    public WebElement buttonSignIn;

    /**
     * constructor
     *
     * @param driver
     */
    public SignInPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(checkLoginPage));
    }

    /*
    click and enter some information to input field email
     */
    public SignInPage emailInput(String email) {
        this.email.sendKeys(email);
        return this;
    }

    /*
    click and enter some information to input field password
     */
    public SignInPage passwordInput(String password) {
        this.password.sendKeys(password);
        return this;
    }

    /*
    click on SignIn button
     */
    public AccountPage clickSignInButton() {
        this.buttonSignIn.click();
        return new AccountPage(driver);
    }

    /**
     * authorization method on SignInPage
     *
     * @param email
     * @param password
     * @return
     */
    public AccountPage register(String email, String password) {
        emailInput(email);
        passwordInput(password);
        clickSignInButton();
        return new AccountPage(driver);
    }
/*
checkSignInPage method
 */
    public SignInPage checkSignInPage() {
        wait.until(ExpectedConditions.visibilityOf(checkLoginPage));
        return this;
    }

}
