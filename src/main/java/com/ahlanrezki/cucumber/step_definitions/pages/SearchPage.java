package com.ahlanrezki.cucumber.step_definitions.pages;


import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

    private WebDriver driver;

    public SearchPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a")
    WebElement clickSearch;

    @FindBy(name = "s")
    WebElement inputSearch;


    public void clickSearch() {
        clickSearch.click();
    }

    public void searchItem(String searchItem) {
        this.inputSearch.sendKeys(searchItem);
    }

    public void pressEnter() {
        inputSearch.submit();
    }


}
