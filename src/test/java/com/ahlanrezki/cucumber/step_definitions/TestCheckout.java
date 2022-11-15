package com.ahlanrezki.cucumber.step_definitions;

import com.ahlanrezki.cucumber.step_definitions.pages.CheckoutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestCheckout {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private CheckoutPage checkoutProduct = new CheckoutPage();

    public TestCheckout() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button checkout")
    public void user_click_button_checkout() {
        checkoutProduct.clickBtnCheckout();
        extentTest.log(LogStatus.PASS,"User click buton checkout");
    }

    @And("User input firstname lastname")
    public void user_typing_firstname_lastname() {
        checkoutProduct.name("Ahlan", "Rezki");
        extentTest.log(LogStatus.PASS,"User typing firstname lastname");
    }

    @And("User input company name just optional")
    public void user_typing_company_name_just_optional() {
        checkoutProduct.companyName("DIKA");
        extentTest.log(LogStatus.PASS,"User typing company name");
    }

    @And("User choose country")
    public void user_choose_country() {
        checkoutProduct.country("ID");
        extentTest.log(LogStatus.PASS,"User choose country");
    }

    @And("User input address one")
    public void user_typing_address_one() {
        checkoutProduct.addressOne("Jl.Gang Senggol");
        extentTest.log(LogStatus.PASS,"User typing address one");
    }

    @And("User input address two just optional")
    public void user_typing_address_two_just_optional() {
        checkoutProduct.addressTwo("-");
        extentTest.log(LogStatus.PASS,"User typing address two");
    }

    @And("User input city")
    public void user_typing_city() {
        checkoutProduct.city("Jakarta Timur");
        extentTest.log(LogStatus.PASS,"User typing city");
    }

    @And("User choose province")
    public void user_choose_province() {
        checkoutProduct.province("DKI Jakarta");
        extentTest.log(LogStatus.PASS,"User choose province");
    }

    @And("User input postcode")
    public void user_typing_postcode() {
        checkoutProduct.postcode("13420");
        extentTest.log(LogStatus.PASS,"User typing postcode");
    }

    @And("User typing phone number")
    public void user_typing_phone_number() {
        checkoutProduct.phoneNumber("087713456789");
        extentTest.log(LogStatus.PASS,"User typing phone number");
    }

    @And("User write notes just optional")
    public void user_enter_notes_just_optional() {
        checkoutProduct.notes("");
        extentTest.log(LogStatus.PASS,"User enter notes just optional");
    }

    @And("User checklist checkbox read and agree")
    public void user_tick_checkbox_read_agree() {
        checkoutProduct.clickCheckboxTermConditions();
        extentTest.log(LogStatus.PASS,"User tick checkbox read and agree");
    }

    @Then("User click button place order")
    public void user_click_button_place_order() {
        checkoutProduct.clickBtnPlaceOrder();
        extentTest.log(LogStatus.PASS,"User click button place order");
    }

}
