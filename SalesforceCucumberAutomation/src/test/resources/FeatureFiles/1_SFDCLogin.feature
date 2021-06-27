@Login
Feature: Login feature verification for salesforce application
  
  Scenario Outline: Sanity_Login to Salesforce application
    Given user navigate to salesforce application and enters <username> and <password> 
    Then user should be land on home page

    Examples: 
      | username  | password  |
      | ajayalugolu2529-2fgm@force.com | PassWord@SF1 |