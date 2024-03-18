Feature: Login into portal

  Background: 
    Given User is on LoginPage

  Scenario: User login with valid credentials
    When User enter valid Username and Password
    And click on verify button
    Then User is redirected to Homepage of Okta


  Scenario: User login with invalid credentials
    When User enter invalid username and password
    And click on verify button
    Then User should get error message

  Scenario: Help Button Functionality
    When User clicks on help button
    Then User should get redirected to Home page

  Scenario: Keepmesignedin functionality
    When User enters username and clicks on keepmesignedin button
    And click on next button to enter password and click on verify button
    Then User should get redirected to Home pagee and click on logout button

  Scenario: Unlock account and verify email
    When User enters the username  and clicks Unlock Account button
    When User enters the username and clicks on select button
   

  Scenario: Unlock account with username field empty
    When User enters username and clicks Unlock Account button
    When User keeps username field empty and clicks on select button
    Then user friendly message should be displayed
