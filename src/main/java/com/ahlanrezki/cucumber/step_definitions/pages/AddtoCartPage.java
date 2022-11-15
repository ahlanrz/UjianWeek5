package com.ahlanrezki.cucumber.step_definitions.pages;


import com.ahlanrezki.cucumber.step_definitions.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddtoCartPage {
    private WebDriver driver;

    public AddtoCartPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"noo-site\"]/div[2]/div[2]/div/div/div[12]/div")
    WebElement clickproductdressone;

    @FindBy(xpath = "//*[@id=\"pa_color\"]")
    WebElement selectMenu;

    @FindBy(xpath = "//*[@id=\"pa_size\"]")
    WebElement size;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnAddtoCart;

    @FindBy(id = "nav-menu-item-cart")
    WebElement btnIconCart;



    public void addToCartOne() {
        clickproductdressone.click();
        System.out.println("Click product dress");
    }

    public void chooseColor(String color) {
        Select selectMenuColor = new Select(this.selectMenu);

        selectMenuColor.selectByVisibleText(color);
    }

    public void chooseSize(String size) {
        Select selectMenuSize = new Select(this.size);
        selectMenuSize.selectByVisibleText(size);
    }

    public void clickBtnAddtoCart() {
        btnAddtoCart.click();
    }

    public void clickIconCart() {

        btnIconCart.click();
    }

}


