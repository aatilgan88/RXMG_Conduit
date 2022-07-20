@abc
Feature: Conduit Sign up and Login Feature

  Scenario: user is on conduit main page
    Given user is on the conduit page
    Then verify the page header as "Conduit"
    And user clicks on sign up link and verifies the page header as "Conduit"
    Then close the application
