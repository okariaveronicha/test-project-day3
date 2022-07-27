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
@loginFeature
Feature: Login

  @test
  	Scenario Outline: Login with invalid data
  	Given I open WebUrl
    When I click button login page 
    And I fill correct <username> and <password>
    And I click button login
    Then Login failed <statusfailed>
    
		Examples: 
      | username  | password | statusfailed |
      | user1234@phptravels.com | FGeui0Il9vvLqwyijXFuow== | invalid username |
      | user123@phptravels.com | FGeui0Il9vvLqwyijXFuow=== | invalid password |
    
      
    Scenario Outline: Login with valid data
    Given I open WebUrl
    When I click button login page 
    And I fill correct <username> and <password>
    And I click button login
    Then Login status <status>
    
    Examples: 
      | username  | password | status |
      | user123@phptravels.com | FGeui0Il9vvLqwyijXFuow== | valid |
    