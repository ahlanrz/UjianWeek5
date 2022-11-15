package com.ahlanrezki.cucumber.step_definitions;

import com.ahlanrezki.cucumber.step_definitions.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;


public class TestSearch {
    private static WebDriver driver;
    private static ExtentTest extentTest;
    private SearchPage search= new SearchPage();

    public TestSearch() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("User click icon search")
    public void user_click_button_search() {
        search.clickSearch();
        extentTest.log(LogStatus.PASS, "User click icon search");
    }

    @And("User input DRESS product search")
    public void user_typing_dress_product_search() {
        search.searchItem("DRESS");
        extentTest.log(LogStatus.PASS, "User input DRESS product in search");
    }

    @Then("User press enter")
    public void user_press_enter() {
        search.pressEnter();
        extentTest.log(LogStatus.PASS, "User press enter");
    }

}