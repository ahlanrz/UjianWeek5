Feature: Checkout Product

  Scenario: User doing checkout product
    When User click button checkout
    And User input firstname lastname
    And User input company name just optional
    And User choose country
    And User input address one
    And User input address two just optional
    And User input city
    And User choose province
    And User input postcode
    And User typing phone number
    And User write notes just optional
    And User checklist checkbox read and agree
    Then User click button place order