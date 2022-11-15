package com.ahlanrezki.cucumber.step_definitions.pages;

import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    int detik = 1;

    @FindBy(xpath = "/html/body/p/a")
    WebElement clickdismiss;

    @FindBy(xpath = "//a[normalize-space()='My Account']")
    WebElement linkmyaccount;

    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameLogin;

    @FindBy(xpath = "//input[@id='password']")
    WebElement usernamePassword;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[2]/span/span")
    WebElement showPassword;


    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    public void loginPageDismiss() {
        clickdismiss.click();
    }

    public void loginPageMyaccount() {
        linkmyaccount.click();
    }

    public void loginForm(String email, String password) {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,500)");
        delay(detik);
        this.usernameLogin.sendKeys(email);
        delay(detik);
        this.usernamePassword.sendKeys(password);
        delay(detik);
        showPassword.click();
        delay(detik);
        btnLogin.click();
        delay(detik);
    }

    public void clickBtnLogin() {
        delay(detik);
        btnLogin.click();
        delay(detik);
    }

    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}