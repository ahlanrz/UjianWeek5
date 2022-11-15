package com.ahlanrezki.cucumber.step_definitions.utils;

public enum TestScenarios {
    T1("User valid login"),
    T2("User search product item"),
    T3("User add cart dress product item"),
    T4("User doing checkout product");

    private String testName;

    TestScenarios(String value) {
        testName = value;
    }

    public String getTestName() {
        return testName;
    }

}
