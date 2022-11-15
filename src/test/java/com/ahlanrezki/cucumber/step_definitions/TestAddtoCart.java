package com.ahlanrezki.cucumber.step_definitions;

import com.ahlanrezki.cucumber.step_definitions.pages.AddtoCartPage;
import com.ahlanrezki.cucumber.step_definitions.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestAddtoCart {
    private static WebDriver driver;
    private static ExtentTest extentTest;

    private AddtoCartPage addCart = new AddtoCartPage();

    private SearchPage search = new SearchPage();

    public TestAddtoCart() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click product dress item")
    public void user_click_product_dress_item() {
        addCart.addToCartOne();
        extentTest.log(LogStatus.PASS,"User click product dress item");
    }

    @And("User choose product dress color")
    public void user_choose_product_dress_color() {
        addCart.chooseColor("Green");
        extentTest.log(LogStatus.PASS,"User choose product dress color");
    }

    @And("User choose product dress size")
    public void user_choose_product_dress_size() {
        addCart.chooseSize("Medium");
        extentTest.log(LogStatus.PASS, "User choose product dress size");
    }

    @And("User click button add to cart on dress product")
    public void user_click_button_add_to_cart_on_dress_product() {
        addCart.clickBtnAddtoCart();
        extentTest.log(LogStatus.PASS,"User click button add cart on dress product");
    }

    @Then("User click icon cart for dress view")
    public void user_click_icon_cart_for_dress_view() {
        addCart.clickIconCart();
        extentTest.log(LogStatus.PASS, "User click icon cart for dress view");
    }

}
