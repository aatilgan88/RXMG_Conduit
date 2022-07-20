@abc
Feature: Sign Up Page Feature
  Background: user to get to sign up page
    Given user is on the conduit page
    Then verify the page header as "Conduit"

    Scenario: negative-incorrect login
      Given user clicks on sign in link
      Then user clicks on sign in button and sees errors
      And first error is visible as "email The 'user.email' field is required!"
      And second error is visible as "password The 'user.password' field is required!"
      Then close the application;

      Scenario: Valid log in scenario
        Given user clicks on sign in link
        Given user puts email as "aa@gmail.com"
        Then user puts password as "12345a"
        And user clicks on sign in button and verify the log in page
        Then close the application;


