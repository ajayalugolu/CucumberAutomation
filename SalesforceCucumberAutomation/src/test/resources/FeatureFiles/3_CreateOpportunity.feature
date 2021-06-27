@CreateOpportunity
Feature: Create opportunity feature of salesforce
  
  Scenario Outline: Sanity_Create Opportunity in Salesforce application
    Given user navigate to salesforce application and enters <username> and <password> 
    When user hit opportunities module
    And click new button in opportunities and enter mandatory fields and save it
    Then Opportunity must get created

    Examples: 
      | username  | password  |
      | ajayalugolu2529-2fgm@force.com | PassWord@SF1 |