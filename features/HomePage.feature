Feature: Sap Homepage

    Background: 
    Given User is on login page of the application
    When User enters valid username 
    And Enters valid password
    And Click on Login button
    
  	@Smoke11
  	Scenario: CMS_SAP_01_Login
    Then User should redirects to CMS home page
    
    @Smoke
    Scenario: CMS_SAP_02_CMS-Tab
    Given User is on CMS homepage
    When User Clicks on CMS tab
    Then User should be able to see the CMS dropdown options
      
    @Smoke
    Scenario: CMS_SAP_03_CMS-SAP
    Given User is on CMS homepage
    When User Clicks on CMS tab
    And User hover mouse on SAP option 
    Then User should be able to see the SAP list options