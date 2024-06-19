#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Search Flights
 

  @cleartrip
  Scenario: Verify user is able to search flight
    Given User launches a Chrome Browser
    When  User opens the url "https://www.cleartrip.com/"
    And User clicks on the crossbutton
    And User selects Where From as "New Delhi"
    And User selects Where To as "Ranchi"
    And User selects the month-year as "August 2024"
    And User selects the date 
    Then User clicks on the Search Flight
    And User wait on Search Flight Page

  