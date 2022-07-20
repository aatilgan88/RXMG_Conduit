@abc
Feature: Conduit Feed and Post Page


    Scenario:  create a post

      Given user is on the conduit page
      Then verify the page header as "Conduit"

      Given user clicks on sign in link
      Given user puts email as "aa@gmail.com"
      Then user puts password as "12345a"
      And user clicks on sign in button and verify the log in page

      Given user clicks on new post link
      Then user send in article title as "Automation"
      And user send in the topic as "Cypress"
      And user sends in the article as "It is a useful tool"
      Then user clicks on publish article button and verify the title

      Scenario: ensure posts display correctly on feed
        Given user clicks on home button
        Then user clicks on global feed
        And user verify the title of the post as "Automation"
        Then user verify the topic of the post as "Cypress"

        Scenario: delete post
          Given user clicks on home button
          Then user clicks on global feed
          Given user clicks on the "Automation" post
          Then user clicks on delete button
          Then user clicks on global feed
          And verify that "Automation" post is deleted


