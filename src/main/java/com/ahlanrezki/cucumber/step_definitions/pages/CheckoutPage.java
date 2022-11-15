package com.ahlanrezki.cucumber.step_definitions.pages;

import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {
    private WebDriver driver;

    public CheckoutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Checkout')]")
    WebElement btnCheckout;

    @FindBy(xpath = "//input[@id='billing_first_name']")
    WebElement firstname;

    @FindBy(xpath = "//input[@id='billing_last_name']")
    WebElement lastname;

    @FindBy(xpath = "//input[@id='billing_company']")
    WebElement companyName;

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement country;

    @FindBy(xpath = "//input[@id='billing_address_1']")
    WebElement addressOne;

    @FindBy(xpath = "//input[@id='billing_address_2']")
    WebElement addressTwo;

    @FindBy(xpath = "//input[@id='billing_city']")
    WebElement city;

    @FindBy(xpath = "//input[@role='combobox']")
    WebElement province;

    @FindBy(xpath = "//input[@id='billing_postcode']")
    WebElement postCode;

    @FindBy(xpath = "//input[@id='billing_phone']")
    WebElement phone;

    @FindBy(xpath = "//input[@id='billing_email']")
    WebElement email;

    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement notes;

    @FindBy(xpath = "//input[@id='terms']")
    WebElement checkboxTerm_Conditions;

    @FindBy(xpath = "//button[@id='place_order']")
    WebElement btnPlaceOrder;


    public void clickBtnCheckout() {
        btnCheckout.click();
    }

    public void name(String firstname, String lastname) {
        this.firstname.sendKeys(firstname);
        this.lastname.sendKeys(lastname);
    }

    public void companyName(String optionalCompanyName) {
        this.companyName.sendKeys(optionalCompanyName);
    }

    public void country(String country) {
        Select selectCountry = new Select(this.country);
        selectCountry.selectByValue(country);
    }

    public void addressOne(String streetAddress) {
        this.addressOne.sendKeys(streetAddress);
    }

    public void addressTwo(String optionalStreeAddress) {
        this.addressTwo.sendKeys(optionalStreeAddress);
    }

    public void city(String city) {
        this.city.sendKeys(city);
    }

    public void province(String province) {
        Select selectProvince = new Select(this.province);
        selectProvince.selectByValue(province);
    }

    public void postcode(String postcode) {
        this.postCode.sendKeys(postcode);
    }

    public void phoneNumber(String phoneNumber){
        this.phone.sendKeys(phoneNumber);
    }

    public void notes(String note) {
        this.notes.sendKeys(note);
    }

    public void clickCheckboxTermConditions() {
        checkboxTerm_Conditions.click();
    }

    public void clickBtnPlaceOrder() {
        btnPlaceOrder.click();
    }

}

