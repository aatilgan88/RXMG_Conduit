@abc
Feature: Sign Up Page Feature
  Background: user to get to sign up page
    Given user is on the conduit page
    Then verify the page header as "Conduit"
    And user clicks on sign up link and verifies the page header as "Conduit"

  Scenario: negative Signup test
    Given user clicks on sign up button and see error messages
    Then user verify the first error message as "username The 'username' field is required!"
    And user verify the second error message as "password The 'password' field is required!"
    And user verify the third error message as "email The 'email' field is required!"
    Then close the application;

    Scenario: positive Signup test
      Given user sends in username as "conduitUser"
      Then user sends in email as "aa@gmail.com"
      And user sends in password as "12345a"
      And user clicks on sign up button
      Then close the application;

