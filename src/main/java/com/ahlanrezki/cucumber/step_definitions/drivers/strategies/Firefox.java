package com.ahlanrezki.cucumber.step_definitions.drivers.strategies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox implements DriverStrategy {
    public WebDriver setStrategy() {
        System.setProperty("webdriver.gecko.driver", "E:\\Bootcamp SQA\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        return driver;
    }
}
