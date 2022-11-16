package com.ahlanrezki.cucumber.step_definitions.pages;

import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
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
    WebElement clickmyaccount;

    @FindBy(xpath = "//input[@id='username']")
    WebElement username;

    @FindBy(xpath = "//input[@id='password']")
    WebElement Password;

    @FindBy(xpath = "//strong[normalize-space()='ERROR']")
    WebElement txtAlertError;

    @FindBy(xpath = "//*[@id=\"customer_login\"]/div[1]/form/p[3]/button")
    WebElement btnLogin;

    @FindBy(xpath = "/html/body/div[1]/div[2]/main/article/div/div/div/p[1]/strong[1]")
    WebElement loginSuccess;

    public void loginPage() {
        clickdismiss.click();
        clickmyaccount.click();
    }

    public void loginForm(String email, String password) {
        this.username.sendKeys(email);
        this.Password.sendKeys(password);
    }

    public void clickBtnLogin() {
        delay(detik);
        btnLogin.click();
    }

    public String getTxtMessageError() {
        return txtAlertError.getText();
    }
    public String getTxtMyAccount() {
        return loginSuccess.getText();
    }

    static void delay(int detik) {


        try {
            Thread.sleep(1000 * detik);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}