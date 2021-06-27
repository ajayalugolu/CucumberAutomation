@CreateAccount
Feature: Create account feature of salesforce
  
  Scenario Outline: Sanity_Create Account in Salesforce application
    Given user navigate to salesforce application and enters <username> and <password> 
    When user hit accounts module
    And click new button in accounts and enter mandatory fields and save it
    Then Account must get created

    Examples: 
      | username  | password  |
      | ajayalugolu2529-2fgm@force.com | PassWord@SF1 |
